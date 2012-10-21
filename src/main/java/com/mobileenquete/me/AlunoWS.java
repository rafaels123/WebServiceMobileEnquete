/**
 * 
 */
package com.mobileenquete.me;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mobileenquete.me.entity.Aluno;
import com.mobileenquete.me.server.business.BusinessAl;
import com.mobileenquete.me.server.business.BusinessFacede;

/**
 * @author Simão Neto
 *
 */
@Path("/aluno")
@Component(value="alunoWs")
public class AlunoWs implements BusinessFacede<Aluno>{

	@Autowired
	private BusinessAl businessAl;
	
	public AlunoWs() {
	}
	
	@POST
	@Produces({"application/xml"})
	@Consumes("application/xml")
    @Path("/add_aluno")
	public void save(Aluno entity) {
		businessAl.storeAluno(entity);
	}


	public void delete(Aluno entity) {
		
	}


	public void update(Aluno entity) {
		
	}


	@GET
	@Produces({"application/xml"})
	@Path("/alunos")
	public List<Aluno> loadAll() {
		return businessAl.loadAllAluno();
	}


	@GET
	@Path("/{id}")
	@Produces({"application/xml"})
	public Aluno findById(@PathParam("id") Integer id) {
		return businessAl.findByPrimaryKeyAluno(id);
	}
}
