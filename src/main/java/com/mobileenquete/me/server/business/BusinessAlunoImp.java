package com.mobileenquete.me.server.business;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mobileenquete.me.entity.Aluno;
import com.mobileenquete.me.server.dao.DaoAluno;

/**
 *
 * @author 
 */
@Component
@Transactional
public class BusinessAlunoImp  implements Serializable, BusinessAl {

	private static final long serialVersionUID = -1L;

	@Autowired
	private DaoAluno daoAluno;
	
	
	
	public DaoAluno getDaoAluno() {
		return daoAluno;
	}
	public void setDaoAluno(DaoAluno daoAluno) {
		this.daoAluno = daoAluno;
	}
	
	@Transactional
	public Aluno findByPrimaryKeyAluno(Integer type) {
		return getDaoAluno().findByPrimaryKey(type);
	}
	
	@Transactional
	public List<Aluno> loadAllAluno() {
		return getDaoAluno().loadAll();
	}
	public void removeAluno(Integer object) {
		getDaoAluno().remove(object);
		
	}
	public void storeAluno(Aluno aluno) {
		getDaoAluno().store(aluno);
		
	}
	
}