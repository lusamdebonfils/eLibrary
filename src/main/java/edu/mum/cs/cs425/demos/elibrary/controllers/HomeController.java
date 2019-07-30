package edu.mum.cs.cs425.demos.elibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = {"/elibrary","/","/index"})
	public String displayHomePage() {
		return "index";
	}
	
	@RequestMapping(value = {"/elibrary/about","/about"})
	public String displayAboutPage() {
		return "about";
	}
}
