/**
 * 
 */
package com.mobileenquete.me.server.dao;

import org.springframework.stereotype.Component;

import com.mobileenquete.me.entity.Projeto;

/**
 * @author Simão Neto
 *
 */
@Component
public class DaoProjeto extends DaoAbstract<Projeto, Long>{

	@Override
	protected Long getId(Projeto projeto) {
		return projeto.getId();
	}

}
