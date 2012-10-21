/**
 * 
 */
package com.mobileenquete.me.server.dao;

import com.mobileenquete.me.entity.Equipe;

/**
 * @author Simão Neto
 *
 */
public class DaoEquipe extends DaoAbstract<Equipe, Long>{

	@Override
	protected Long getId(Equipe equipe) {
		// TODO Auto-generated method stub
		return equipe.getId();
	}

}
