/**
 * 
 */
package com.mobileenquete.me.server.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mobileenquete.me.entity.Projeto;
import com.mobileenquete.me.server.dao.DaoProjeto;

/**
 * @author Simão Neto
 *
 */
@Component
@Transactional
public class BusinessProjetoImp implements BusinessProjeto{

	@Autowired
	private DaoProjeto daoProjeto;
	
	public DaoProjeto getDaoProjeto() {
		return daoProjeto;
	}

	public void setDaoProjeto(DaoProjeto daoProjeto) {
		this.daoProjeto = daoProjeto;
	}

	@Transactional
	public Projeto findByPrimaryKeyAluno(Long type) {
		return daoProjeto.findByPrimaryKey(type);
	}

	@Transactional
	public List<Projeto> loadAllProjeto() {
		return daoProjeto.loadAll();
	}

	
	public void removeProjeto(Long id) {
		daoProjeto.remove(id);
	}

	public void storeProjeto(Projeto projeto) {
		
	}

}
