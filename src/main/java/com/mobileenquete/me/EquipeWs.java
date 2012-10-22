/**
 * 
 */
package com.mobileenquete.me;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mobileenquete.me.entity.Equipe;
import com.mobileenquete.me.server.business.BusinessEquipe;
import com.mobileenquete.me.server.business.BusinessFacede;

/**
 * @author Simão Neto
 *
 */
@Path("/equipe")
@Component(value="equipeWs")
public class EquipeWs implements BusinessFacede<Equipe>{
	
	@Autowired
	private BusinessEquipe businessEquipe;

	public void save(Equipe entity) {
		
	}

	public void delete(Long id) {
		
	}

	public void update(Equipe entity) {
		
	}

	@GET
	@Path("/equipes")
	@Produces("application/xml")
	public List<Equipe> loadAll() {
		return businessEquipe.loadAllEquipe();
	}

	@GET
	@Path("/{id}")
	@Produces({"application/xml"})
	public Equipe findById(@PathParam("id") Long id) {
		return businessEquipe.findByPrimaryKeyAluno(id);
	}
}
