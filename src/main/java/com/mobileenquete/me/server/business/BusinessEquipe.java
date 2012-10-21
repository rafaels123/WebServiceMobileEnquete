/**
 * 
 */
package com.mobileenquete.me.server.business;

import java.util.List;

import com.mobileenquete.me.entity.Equipe;
import com.mobileenquete.me.server.dao.DaoEquipe;

/**
 * @author Simão Neto
 *
 */
public interface BusinessEquipe {
	
	public DaoEquipe getDaoEquipe();

	public void setDaoEquipe(DaoEquipe daoEquipe);

	public Equipe findByPrimaryKeyAluno(Long type);

	public List<Equipe> loadAllEquipe();

	public void removeEquipe(Integer object);

	public void storeEquipe(Equipe equipe);

}
