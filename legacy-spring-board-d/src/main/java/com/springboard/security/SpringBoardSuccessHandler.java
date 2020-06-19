package com.springboard.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class SpringBoardSuccessHandler 
	implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(
		HttpServletRequest request, HttpServletResponse response,
		Authentication authentication) throws IOException, ServletException {

		for(GrantedAuthority auth : authentication.getAuthorities()) {
			System.out.println(auth.getAuthority());
		}
		
		response.sendRedirect("/spring-board-b/home");
		

	}

}
