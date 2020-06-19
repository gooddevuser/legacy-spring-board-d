package com.springboard.controller;

import java.util.Locale;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // @Component + spring mvc 기능 추가
public class HomeController {
	
	@RequestMapping(path = { "/", "/home" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home"; // viewname -> /WEB-INF/views/ + home + .jsp
	}
	
	@GetMapping(path = { "/access-denied" })
	public String accessDenied(Authentication authentication) {
		
		return "access-denied";
	}
	
}








