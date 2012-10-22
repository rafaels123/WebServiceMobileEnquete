/**
 * 
 */
package com.mobileenquete.me;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mobileenquete.me.entity.Aluno;
import com.mobileenquete.me.entity.Projeto;
import com.mobileenquete.me.server.business.BusinessFacede;
import com.mobileenquete.me.server.business.BusinessProjeto;

/**
 * @author Simão Neto
 *
 */
@Path("/projeto")
@Component(value="projetoWs")
public class ProjetoWs implements BusinessFacede<Projeto>{

	@Autowired
	private BusinessProjeto businessProjeto;
	
	public void save(Projeto entity) {
		
	}

	@DELETE
	@Path("/delete/{id}")
	public void delete(@PathParam("id") Long id) {
		businessProjeto.removeProjeto(id);
	}

	public void update(Projeto entity) {
		
	}

	@GET
	@Path("/projetos")
	@Produces("application/xml")
	public List<Projeto> loadAll() {
		return businessProjeto.loadAllProjeto();
	}

	@GET
	@Path("/{id}")
	@Produces("application/xml")
	public Projeto findById(@PathParam("id") Long id) {
		return businessProjeto.findByPrimaryKeyAluno(id);
	}
}
