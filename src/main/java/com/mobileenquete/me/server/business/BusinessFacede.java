package com.mobileenquete.me.server.business;

import java.util.List;

public interface BusinessFacede<Entity> {
	
	public void save(Entity entity);
	public void delete(Long id);
	public void update(Entity entity);
	public List<Entity> loadAll();
	public Entity findById(Long id);
	
}
