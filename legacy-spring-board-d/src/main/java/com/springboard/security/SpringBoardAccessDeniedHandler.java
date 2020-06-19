package com.springboard.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

// Spring Security의 접근 거부 이벤트 처리기 구현 
// (권한 없는 사용자가 리소스를 요청했을 때 실행되는 처리기) 
public class SpringBoardAccessDeniedHandler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		
		response.sendRedirect("/spring-board-b/access-denied");
	}

}











