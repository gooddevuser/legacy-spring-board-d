package com.springboard.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springboard.mapper.MemberMapper;
import com.springboard.vo.MemberVO;

import lombok.Data;

@Data
public class SpringBoardUserDetailsService implements UserDetailsService {

	private MemberMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		MemberVO member = memberMapper.selectMemberByEmail(username);
		SpringBoardUserDetails details = null;
		if (member != null) {
			details = new SpringBoardUserDetails();
			details.setMember(member);
		}
		
		return details;
	}

}
