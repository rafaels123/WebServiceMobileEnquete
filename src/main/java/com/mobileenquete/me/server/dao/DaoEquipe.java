/**
 * 
 */
package com.mobileenquete.me.server.dao;

import org.springframework.stereotype.Component;

import com.mobileenquete.me.entity.Equipe;

/**
 * @author Simão Neto
 *
 */
@Component
public class DaoEquipe extends DaoAbstract<Equipe, Long>{

	@Override
	protected Long getId(Equipe equipe) {
		// TODO Auto-generated method stub
		return equipe.getId();
	}

}
