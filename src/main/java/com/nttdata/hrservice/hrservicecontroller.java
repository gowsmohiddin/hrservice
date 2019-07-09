package com.nttdata.hrservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nttdata.entity.User;

@RestController
public class hrservicecontroller {
	
	RestTemplate RestTemplate;
	@GetMapping("/user")
	public List<User> getUsers()
	{
		System.out.println("Under hrservicecontroller");
		return null;
		
		
	}

}
