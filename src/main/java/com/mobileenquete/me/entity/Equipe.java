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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author simao
 *
 * Class que representa uma equipe
 */
@Entity
@Table(name="tb_equipe")
@XmlRootElement
public class Equipe implements Serializable{
	
	private static final long serialVersionUID = 1741235279845592267L;
	
	@Id
	@SequenceGenerator(name = "seq", sequenceName = "sq_equipe_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
	private Long id;
	
	@Column(name = "name", length=50)
	private String name;
	
	@ManyToOne
	@JoinColumn(name="id_aluno")
	private Aluno aluno;

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
	
	

}
