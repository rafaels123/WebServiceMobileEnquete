/**
 * 
 */
package com.mobileenquete.me.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileenquete.me.entity.Aluno;
import com.mobileenquete.me.server.dao.DaoAluno;
import com.mobileenquete.me.server.remoteinterface.AlunoService;

/**
 * @author simao
 *
 */
@Service("AlunoService")
public class AlunoServiceImpl implements AlunoService{
	
	@Autowired
	DaoAluno daoAluno;

	public Aluno insert(Aluno aluno) {
		
		aluno = new Aluno();
		aluno.setMatricula(333);
		
		
		return daoAluno.store(aluno);
	}

	public Aluno read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void update(Long id, Aluno aluno) {
		// TODO Auto-generated method stub
		
	}

}
