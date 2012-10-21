/**
 * 
 */
package com.mobileenquete.me;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

import com.mobileenquete.me.entity.Projeto;
import com.mobileenquete.me.server.business.BusinessFacede;

/**
 * @author Simão Neto
 *
 */
@Path("/projeto")
@Component(value="projetoWs")
public class ProjetoWs implements BusinessFacede<Projeto>{

	public void save(Projeto entity) {
		
	}

	public void delete(Projeto entity) {
		
	}

	public void update(Projeto entity) {
		
	}

	public List<Projeto> loadAll() {
		return null;
	}

	public Projeto findById(Long id) {
		return null;
	}

}
