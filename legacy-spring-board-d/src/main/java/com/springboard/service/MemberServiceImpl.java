package com.springboard.service;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.springboard.mapper.MemberMapper;
import com.springboard.vo.MemberRoleVO;
import com.springboard.vo.MemberVO;

import lombok.Setter;

public class MemberServiceImpl implements MemberService {

	@Setter
	private MemberMapper memberMapper;
	
	@Setter
	private PasswordEncoder passwordEncoder;
	
	@Override
	public void registerMember(MemberVO member) {
		String hashedPasswd = passwordEncoder.encode(member.getPasswd());
		member.setPasswd(hashedPasswd);
		memberMapper.insertMember(member);
		
//		for (MemberRoleVO role : member.getRoles()) {
//			memberMapper.insertMemberRole(role);
//		}
		MemberRoleVO role = new MemberRoleVO();
		role.setEmail(member.getEmail());
		role.setRoleName("ROLE_MEMBER");
		memberMapper.insertMemberRole(role);
		
	}

	@Override
	public MemberVO findMemberByEmailAndPasswd(MemberVO member) {
		String hashedPasswd = passwordEncoder.encode(member.getPasswd());
		member.setPasswd(hashedPasswd);
		return memberMapper.selectMemberByEmailAndPasswd(member);
		
	}

}
