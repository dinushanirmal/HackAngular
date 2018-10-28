package com.test.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Filter")
public class ReqFilter {
	
	@GetMapping("/testFilter")
	public String headerFilter(@RequestHeader(value="User-Agent") String agent) {
		System.out.println("agent"+agent);
		return agent;
	}

}
