/**
 * 
 */
package com.mobileenquete.me.server.remoteinterface;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mobileenquete.me.entity.Aluno;

/**
 * @author simao
 *
 */
@Path("alunoservice")
public interface AlunoService {
	
	@POST
    @Path("aluno")
    @Consumes({ MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_XML })
	public Aluno insert(Aluno aluno);
	
	@GET
    @Path("aluno/{id}")
    @Consumes({ MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_XML })
	public Aluno read(@PathParam("id") Long id);

	@DELETE
    @Path("aluno/{id}")
    @Consumes({ MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_XML })
	public void delete(@PathParam("id") Long id);
	
	@PUT
    @Path("aluno/{id}")
    @Consumes({ MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_XML })
	public void update(@PathParam("id") Long id, Aluno aluno);
	

}
