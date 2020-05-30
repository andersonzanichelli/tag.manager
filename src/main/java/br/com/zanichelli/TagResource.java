package br.com.zanichelli;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tag")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TagResource {
	
	@Inject
	private TagRepository repository;

    @GET
    public String health() {
        return "The tag manager it`s running ok! Thank you";
    }

    @GET
    public List<Tag> list() {
        return repository.listAll();
    }
    
    @POST
    @Transactional
    public Tag save(@Valid Tag tag) {
    	repository.persist(tag);
    	return tag;
    }
}