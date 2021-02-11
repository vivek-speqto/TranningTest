package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/hello")
	public String msg()
	{
		return "hello";
	}
}
