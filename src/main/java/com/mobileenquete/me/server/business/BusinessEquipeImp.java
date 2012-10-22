/**
 * 
 */
package com.mobileenquete.me.server.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mobileenquete.me.entity.Equipe;
import com.mobileenquete.me.server.dao.DaoEquipe;

/**
 * @author Simão Neto
 *
 */
@Component
@Transactional
public class BusinessEquipeImp implements BusinessEquipe {

	@Autowired
	private DaoEquipe daoEquipe;
	
	public DaoEquipe getDaoEquipe() {
		return daoEquipe;
	}

	public void setDaoEquipe(DaoEquipe daoEquipe) {
		this.daoEquipe = daoEquipe;
	}

	@Transactional
	public Equipe findByPrimaryKeyAluno(Long type) {
		return daoEquipe.findByPrimaryKey(type);
	}

	@Transactional
	public List<Equipe> loadAllEquipe() {
		return daoEquipe.loadAll();
	}

	public void removeEquipe(Long object) {
		
	}

	public void storeEquipe(Equipe equipe) {
		
	}

}
