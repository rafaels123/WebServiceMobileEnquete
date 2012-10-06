/**
 * 
 */
package com.mobileenquete.me.server.services.alunoServices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mobileenquete.me.entity.Aluno;
import com.mobileenquete.me.server.dao.DaoAluno;

/**
 * @author simao
 *
 */
public interface AlunoService {
	
	public List<Aluno> getAlunos(Long id);

	public Aluno findByPrimaryKeyAluno(Long id);
	
	public void removeCompany(Long id);

	public void storeAluno(Aluno aluno);

	public List<Aluno> loadAllAlunos();
	
}
