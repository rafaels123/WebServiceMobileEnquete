package com.mobileenquete.me.server.business;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mobileenquete.me.entity.Aluno;
import com.mobileenquete.me.server.dao.DaoAluno;


public interface BusinessAl {

	public DaoAluno getDaoAluno();

	public void setDaoAluno(DaoAluno daoAluno);

	public Aluno findByPrimaryKeyAluno(Integer type);

	public List<Aluno> loadAllAluno();

	public void removeAluno(Integer object);

	public void storeAluno(Aluno aluno);

}