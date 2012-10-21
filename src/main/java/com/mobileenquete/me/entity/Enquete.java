/**
 * 
 */
package com.mobileenquete.me.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author simao
 *
 * Class que representa uma enquete
 */
@Entity
@Table(name="tb_enquete")
public class Enquete implements Serializable{
	
	private static final long serialVersionUID = 1489971835371027963L;
	
	@Id
	@SequenceGenerator(name = "seq", sequenceName = "sq_enquete_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_projeto")
	private Projeto projeto;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_equipe")
	private Equipe equipe;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_aluno")
	private Aluno aluno;
	
	@Column
	private Integer totalVoto;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the projeto
	 */
	public Projeto getProjeto() {
		return projeto;
	}

	/**
	 * @param projeto the projeto to set
	 */
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	/**
	 * @return the equipe
	 */
	public Equipe getEquipe() {
		return equipe;
	}

	/**
	 * @param equipe the equipe to set
	 */
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	/**
	 * @return the aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Integer getTotalVoto() {
		return totalVoto;
	}

	public void setTotalVoto(Integer totalVoto) {
		this.totalVoto = totalVoto;
	}
	
	
	
	
	
	
	
	

}
