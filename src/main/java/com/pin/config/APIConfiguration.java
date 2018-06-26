package com.pin.config;

import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pin.api.PostResource;

@Configuration
public class APIConfiguration {

	@Bean
	PostResource createPostResource(){
		final String path = "https://jsonplaceholder.typicode.com";

		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(UriBuilder.fromPath(path));
		return target.proxy(PostResource.class);	
	}
}
