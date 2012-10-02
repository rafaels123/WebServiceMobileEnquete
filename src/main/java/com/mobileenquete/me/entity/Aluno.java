/**
 * 
 */
package com.mobileenquete.me.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author simao
 *
 * Class que representa um aluno
 */
@Entity
@Table(name="tb_aluno")
public class Aluno implements Serializable{
	
	private static final long serialVersionUID = -3378164210002817874L;
	
	@Id
	@SequenceGenerator(name = "seq", sequenceName = "sq_aluno_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
	private Long id;
	
	@Column(name = "name", length=50)
	private String name;
	
	@Column(name = "matricula")
	private int matricula;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
}
