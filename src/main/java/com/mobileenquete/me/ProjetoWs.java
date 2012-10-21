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
		// TODO Auto-generated method stub
		
	}

	public void delete(Projeto entity) {
		// TODO Auto-generated method stub
		
	}

	public void update(Projeto entity) {
		// TODO Auto-generated method stub
		
	}

	public List<Projeto> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Projeto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
