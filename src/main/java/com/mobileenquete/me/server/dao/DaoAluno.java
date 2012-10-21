/**
 * 
 */
package com.mobileenquete.me.server.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mobileenquete.me.entity.Aluno;

/**
 * @author Simão Neto
 *
 */
@Component
public class DaoAluno extends DaoAbstract<Aluno, Long>{

	@Override
	protected Long getId(Aluno aluno) {
		// TODO Auto-generated method stub
		return aluno.getId();
	}
	
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Aluno> loadAll() {
//		List<Aluno> alunos = new ArrayList<Aluno>();
//		try{
//			String hql = "from Aluno";
//			
//			getSession().beginTransaction();
//			
//			alunos.addAll(getSession().createQuery(hql).list());
//			
//			getSession().beginTransaction().commit();
//			getSession().close();
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		return alunos;
//	}

}
