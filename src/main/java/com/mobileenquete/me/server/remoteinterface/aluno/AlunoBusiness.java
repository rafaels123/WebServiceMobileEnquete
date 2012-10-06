package com.mobileenquete.me.server.remoteinterface.aluno;

import java.util.List;

import com.mobileenquete.me.entity.Aluno;
import com.mobileenquete.me.server.dao.DaoAluno;

public interface AlunoBusiness {

	public List<Aluno> getAlunos(Long id);

	public Aluno findByPrimaryKeyAluno(Long id);

	public DaoAluno getDaoAluno();

	public void setDaoAluno(DaoAluno daoAuno);

	public void removeCompany(Long id);

	public void storeAluno(Aluno aluno);

	public List<Aluno> loadAllAlunos();

}