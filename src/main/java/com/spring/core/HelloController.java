package com.spring.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//Request Handler Method
@RequestMapping("/hello")	

public String hello()
{
	return "Hello,World";
}
	
	

}
