/**
 * 
 */
package com.mobileenquete.me.server.remoteinterface.aluno;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mobileenquete.me.entity.Aluno;
import com.mobileenquete.me.server.dao.DaoAluno;

/**
 * @author simao
 *
 */
@Transactional
public class AlunoBusinessImp implements Serializable, AlunoBusiness{

	private static final long serialVersionUID = -8981564612052969188L;

	@Autowired
	private DaoAluno daoAluno;
	public List<Aluno> getAlunos(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Aluno findByPrimaryKeyAluno(Long id) {
		// TODO Auto-generated method stub
		return daoAluno.findByPrimaryKey(id);
	}

	public DaoAluno getDaoAluno() {
		// TODO Auto-generated method stub
		return daoAluno;
	}

	public void setDaoAluno(DaoAluno daoAuno) {
		this.daoAluno = daoAuno;
	}

	public void removeCompany(Long id) {
		
		daoAluno.remove(id);
		
	}

	public void storeAluno(Aluno aluno) {
		daoAluno.store(aluno);
	}

	public List<Aluno> loadAllAlunos() {
		// TODO Auto-generated method stub
		return null;
	}

}
