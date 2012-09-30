/**
 * 
 */
package com.mobileenquete.me.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author simao
 *
 * Class que representa um aluno
 */
@Table(name="tb_aluno")
public class Aluno implements Serializable{
	
	private static final long serialVersionUID = -3378164210002817874L;
	
	@Id
	@Column(name="id")
	private Long id;
	private String name;
	private int matricula;
	
}
