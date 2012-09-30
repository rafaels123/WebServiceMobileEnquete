/**
 * 
 */
package com.mobileenquete.me.server.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author simao
 *
 * Class que implementa os metodos de crud.
 */
public abstract class DaoAbstract<Entity, PkType extends Serializable> implements Dao<Entity, PkType>{
	
	private static final long serialVersionUID = -4979587101834754887L;

	@Autowired
	SessionFactory sessionFactory;

	public void remove(PkType object) {
		// TODO Auto-generated method stub
		
	}

	public List<Entity> removes(List<Entity> object) {
		// TODO Auto-generated method stub
		return null;
	}

	public Entity findByPrimaryKey(PkType type) {
		// TODO Auto-generated method stub
		return null;
	}

	public Entity store(Entity object) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Entity> stores(List<Entity> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Entity> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T find(Class<T> arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Entity find(Serializable arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
