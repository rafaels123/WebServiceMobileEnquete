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
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.mobileenquete.me.entity.Aluno;
import com.mobileenquete.me.server.remoteinterface.aluno.AlunoBusiness;

/**
 * @author simao
 *
 */
@Path("alunoservice")
public class AlunoWS {
	
	@Autowired
	private AlunoBusiness alunoBusiness;
	
	@GET
	@Path("aluno/{id}")
	@Consumes({ MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_XML })
	public List<Aluno> getAlunos(@PathParam("id") Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@POST
	@Path("aluno")
	@Consumes({ MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_XML })
	public void storeAluno(Aluno aluno) {
		
	}

}
