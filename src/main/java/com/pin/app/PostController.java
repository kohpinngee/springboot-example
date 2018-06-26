package com.pin.app;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pin.api.Post;
import com.pin.api.PostResource;

@Controller
@EnableAutoConfiguration
public class PostController {

	@Resource
	PostResource postResource;
	
	@RequestMapping("/posts")
	@ResponseBody()
	List<Post> getAllPosts() {

		return postResource.getAllPosts();
	}
}