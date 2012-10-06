/**
 * 
 */
package com.mobileenquete.me.server.services.alunoServices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobileenquete.me.entity.Aluno;
import com.mobileenquete.me.server.dao.DaoAluno;
import com.mobileenquete.me.server.remoteinterface.aluno.AlunoBusiness;

/**
 * @author simao
 *
 */
@Transactional
@Service("AlunoService")
@Path("alunoservice")
@Component
public class AlunoServiceImpl implements AlunoService{
	
	@Autowired
	private AlunoBusiness alunoBusiness;

	public AlunoBusiness getAlunoBusiness() {
		return alunoBusiness;
	}

	public void setAlunoBusiness(AlunoBusiness alunoBusiness) {
		this.alunoBusiness = alunoBusiness;
	}

	@GET
	@Path("aluno/{id}")
	@Consumes({ MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_XML })
	public List<Aluno> getAlunos(@PathParam("id") Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Aluno findByPrimaryKeyAluno(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setDaoAluno(DaoAluno daoAuno) {
		// TODO Auto-generated method stub
		
	}

	@DELETE
	@Path("aluno/{id}")
	@Consumes({ MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_XML })
	public void removeCompany(@PathParam("id") Long id) {
		
	}

	@POST
	@Path("aluno")
	@Consumes({ MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_XML })
	public void storeAluno(Aluno aluno) {
		
	}

	public List<Aluno> loadAllAlunos() {
		// TODO Auto-generated method stub
		return null;
	}

//	@PUT
//	@Path("aluno/{id}")
//	@Consumes({ MediaType.APPLICATION_XML })
//	@Produces({ MediaType.APPLICATION_XML })
//	public void update(@PathParam("id") Long id, Aluno aluno);
}
