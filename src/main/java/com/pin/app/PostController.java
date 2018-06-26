package com.pin.app;

import java.util.List;

import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pin.api.Post;
import com.pin.api.PostResource;

@Controller
@EnableAutoConfiguration
public class PostController {

	@RequestMapping("/posts")
	@ResponseBody()
	List<Post> getAllPosts() {

		final String path = "https://jsonplaceholder.typicode.com";

		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(UriBuilder.fromPath(path));
		PostResource proxy = target.proxy(PostResource.class);

		// GET
		return proxy.getAllPosts();
	}
}