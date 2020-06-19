package com.springboard.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.springboard.common.Util;

public class SpringBoardPasswordEncoder implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {		
		return Util.getHashedString(rawPassword.toString(), "SHA-256");
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		
		boolean valid = encode(rawPassword).equals(encodedPassword);		
		return valid;
	}

}
