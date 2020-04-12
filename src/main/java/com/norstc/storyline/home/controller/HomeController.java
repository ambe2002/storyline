package com.norstc.storyline.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping(value="/")
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping(value="/error")
	public String error() {
		return "404";
	}
	
	@GetMapping(value="/home" )
	public String home() {
		return "homepage";
	}
}
