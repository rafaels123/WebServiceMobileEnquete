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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author simao
 *
 * Class que representa um projeto
 */
@Entity
@Table(name="tb_projeto")
@XmlRootElement
public class Projeto implements Serializable{
	
	private static final long serialVersionUID = 3852074577149987562L;
	@Id
	@SequenceGenerator(name = "seq", sequenceName = "sq_aluno_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
	private Long id;
	
	@Column(name = "name", length=50)
	private String name;
	
	@Column(name = "description", length=300)
	private String description;
	
	@OneToOne
	@JoinColumn(name="id_equipe")
	private Equipe equipe;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Projeto [id=" + id + ", name=" + name + ", description="
				+ description + ", equipe=" + equipe + "]";
	}
	
	
}
