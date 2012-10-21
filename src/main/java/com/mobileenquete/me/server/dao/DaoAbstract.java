package com.mobileenquete.me.server.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;

import com.mobileenquete.me.server.dao.exception.DaoException;
    
public abstract class DaoAbstract<Entity, PkType extends Serializable> implements Dao<Entity, PkType> {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Class<Entity> classEntity;
	
	@SuppressWarnings("unchecked")
	public DaoAbstract() {
    	this.classEntity = (Class<Entity>) ((ParameterizedType) getClass() .getGenericSuperclass()).getActualTypeArguments()[0];
    }
	
    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
      return sessionFactory.getCurrentSession();
    }

    protected abstract PkType getId(Entity object);
    
    protected String getQRNAll(){
    	return null;
    }
    
    public Class<Entity> getClassEntity(){
    	return classEntity;
    }

    public void remove(PkType object) {
        if (object == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.sessionFactory.getCurrentSession().delete(findByPrimaryKey(object));
        } catch (Exception e) {
        	e.printStackTrace();
            throw new DaoException("Erro ao remover o Objeto", e);
        }
    }
    
    public List<Entity> removes(List<Entity> object) {
    	if (object == null) {
    		throw new IllegalArgumentException();
    	}
    	try {
    		for (Entity entity : object) {
    			remove(getId(entity));
			}
    	} catch (Exception e) {
    		e.printStackTrace();
    		throw new DaoException("Erro ao remover os Objetos", e);
    	}
    	return object;
    }

    @SuppressWarnings("unchecked")
	public Entity findByPrimaryKey(PkType type){
    	Transaction t = getSession().beginTransaction();
    	return (Entity)this.sessionFactory.getCurrentSession().get(getClassEntity(), type);
    }

    @SuppressWarnings("unchecked")
	public <T> T find(Class<T> arg0, Object arg1) {
		return (T)this.sessionFactory.getCurrentSession().get(arg0, (Serializable)arg1);
	}
    
    public Entity find(Serializable arg1) {
    	return find(classEntity, arg1);
    }

	public Entity store(Entity object) {
        if (object == null) {
            throw new IllegalArgumentException();
        }
        try {
          if (getId(object) == null || getId(object).toString().trim().equals("0")) {
        	  this.sessionFactory.getCurrentSession().persist(object);
          } else {
        	  this.sessionFactory.getCurrentSession().merge(object);
          }
        } catch (Exception e) {
        	e.printStackTrace();
            throw new DaoException("Erro ao inserir o Objeto", e);
        }
        return object;
    }
	
	public List<Entity> stores(List<Entity> object) {
		if (object == null) {
			throw new IllegalArgumentException();
		}
		try {
			for (Entity entity : object) {
				store(entity);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException("Erro ao inserir os Objetos", e);
		}
		return object;
	}

    @SuppressWarnings("unchecked")
	public List<Entity> loadAll() {
        try {
        	Transaction t = getSession().beginTransaction();
        	org.hibernate.Query query = null; 
        	if(getQRNAll() != null){
        		query = this.sessionFactory.getCurrentSession().getNamedQuery(getQRNAll());
        	}else{
        		query = this.sessionFactory.getCurrentSession().createQuery(getQRAll());
        	}
            return query.list();
        } catch (Exception e) {
        	e.printStackTrace();
            throw new DaoException("Erro ao buscar lista dos Objetos", e);
        }
    }
    
    public Long loadAllSize() {
    	try {
    		org.hibernate.Query query = this.sessionFactory.getCurrentSession().createQuery(getQRAllSize());
    		return (Long)query.uniqueResult();
    	} catch (Exception e) {
    		e.printStackTrace();
    		throw new DaoException("Erro ao buscar lista dos Objetos", e);
    	}
    }
    
    protected String getQRAll(){
    	String nameClass = getClassEntity().getSimpleName();
    	return "FROM " + nameClass +" e";
    }
    
    protected String getQRAllSize(){
    	return "SELECT COUNT(*) " + getQRAll();
    }
    
    public static Order getOrder(String orderByField, boolean ascending){
    	return ascending ? Order.asc(orderByField) : Order.desc(orderByField);
    }
    
    @SuppressWarnings("unchecked")
	public List<Entity> loadSubList(int offSet,int maxResult,Order ... orders){
    	org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(getQRAll());
    	query.setFirstResult(offSet);
    	query.setMaxResults(maxResult);
    	return query.list();
    }
    
    protected String getQRAllParms(String parameterName){
    	String s = parameterName.split("\\.")[0];
    	return getQRAll() + " where e." + parameterName + " like :" + s;
    }
    
    public long loadAllSize(String parameterName, Object  parameterValue){
    	String s = parameterName.split("\\.")[0];
		try {
	    	org.hibernate.Query query = getSessionFactory().getCurrentSession().createQuery("select count(*)" + getQRAllParms(parameterName));
	    	query.setParameter(s, parameterValue);
    		return (Long)query.uniqueResult();
    	} catch (Exception e) {
    		e.printStackTrace();
    		throw new DaoException("Erro ao buscar lista dos Objetos", e);
    	}
    }
    
    @SuppressWarnings("unchecked")
	public List<Entity> loadSubList(int offSet,int maxResult, String parameterName, Object  parameterValue,Order ... orders){
    	org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(getQRAllParms(parameterName));
    	query.setParameter(parameterName, parameterValue);
    	query.setFirstResult(offSet);
    	query.setMaxResults(maxResult);
    	return query.list();
    }
    
    
    public List<Entity> loadSubList(int offSet,int maxResult,String orderByField, boolean ascending){
    	return loadSubList(offSet, maxResult, getOrder(orderByField, ascending));
    }
    
    public List<Entity> loadSubList(int offSet,int maxResult){
    	return loadSubList(offSet, maxResult, (Order[])null);
    }
    
	/**
	 * Cria um objeto Criteria a partir da sessao.
	 * 
	 * @return Criteria (Hibernate)
	 */
	protected Criteria createCriteria() {
		Criteria criteria = null;
		try {	
			criteria = getSession().createCriteria(classEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return criteria;
	}
	
	protected Query createQuery(String hql) {
		Query query = null;
		try {	
			query = getSession().createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query;
	}
	
	protected SQLQuery createSqlQuery(String sql) {
		SQLQuery query = null;
		try {	
			query = getSession().createSQLQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query;
	}
	
	@SuppressWarnings("unchecked")
	protected List<Entity> listFromQuery(Query query){
		return query.list();
	}

}