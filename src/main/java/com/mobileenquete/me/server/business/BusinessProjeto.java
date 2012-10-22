/**
 * 
 */
package com.mobileenquete.me.server.business;

import java.util.List;

import com.mobileenquete.me.entity.Projeto;
import com.mobileenquete.me.server.dao.DaoProjeto;

/**
 * @author Simão Neto
 *
 */
public interface BusinessProjeto {
	
	public DaoProjeto getDaoProjeto();

	public void setDaoProjeto(DaoProjeto daoProjeto);

	public Projeto findByPrimaryKeyAluno(Long type);

	public List<Projeto> loadAllProjeto();

	public void removeProjeto(Long id);

	public void storeProjeto(Projeto projeto);

}
