/**
 * 
 */
package com.mobileeleicao.me.entity;

import java.io.Serializable;

/**
 * @author simao
 *
 * Class que representa um projeto
 */
public class Projeto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3852074577149987562L;
	private Long id;
	private String name;
	private String description;
	private Equipe equipe;
	
	

}
