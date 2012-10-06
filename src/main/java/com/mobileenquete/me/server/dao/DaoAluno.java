/**
 * 
 */
package com.mobileenquete.me.server.dao;

import org.springframework.stereotype.Component;

import com.mobileenquete.me.entity.Aluno;

/**
 * @author simao
 *
 */
@Component
public class DaoAluno extends DaoAbstract<Aluno, Long>{
	
	private static final long serialVersionUID = 7208296872904579849L;

	@Override
	protected Long getId(Aluno aluno) {
		// TODO Auto-generated method stub
		return aluno.getId();
	}

}
