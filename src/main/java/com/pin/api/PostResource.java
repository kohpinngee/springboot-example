package com.pin.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/posts/")
public interface PostResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<Post> getAllPosts();

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	Post getPost(@PathParam("id") String id);
}
