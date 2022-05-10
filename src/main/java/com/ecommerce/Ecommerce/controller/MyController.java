package com.ecommerce.Ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shiva
 * Date : 06 May 2022
 */
@RestController
public class MyController {
	
	@GetMapping("/")
	public String home() {
		return "welcome to Ecommerce site";
	}
	
	
}
