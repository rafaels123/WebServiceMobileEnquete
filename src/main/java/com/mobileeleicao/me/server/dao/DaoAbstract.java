/**
 * 
 */
package com.mobileeleicao.me.server.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author simao
 *
 * Class que implementa os metodos de crud.
 */
public abstract class DaoAbstract<Entity, PkType extends Serializable> implements Dao<Entity, PkType>{
	
	private static final long serialVersionUID = -4979587101834754887L;

	/* (non-Javadoc)
	 * @see com.mobileeleicao.me.server.dao.Dao#remove(java.lang.Object)
	 */
	public void remove(PkType object) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mobileeleicao.me.server.dao.Dao#removes(java.util.List)
	 */
	public List<Entity> removes(List<Entity> object) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mobileeleicao.me.server.dao.Dao#findByPrimaryKey(java.lang.Object)
	 */
	public Entity findByPrimaryKey(PkType type) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mobileeleicao.me.server.dao.Dao#store(java.lang.Object)
	 */
	public Entity store(Entity object) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mobileeleicao.me.server.dao.Dao#stores(java.util.List)
	 */
	public List<Entity> stores(List<Entity> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mobileeleicao.me.server.dao.Dao#loadAll()
	 */
	public List<Entity> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mobileeleicao.me.server.dao.Dao#find(java.lang.Class, java.lang.Object)
	 */
	public <T> T find(Class<T> arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mobileeleicao.me.server.dao.Dao#find(java.io.Serializable)
	 */
	public Entity find(Serializable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
