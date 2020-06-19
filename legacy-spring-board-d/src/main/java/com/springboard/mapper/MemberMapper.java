package com.springboard.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.springboard.vo.MemberRoleVO;
import com.springboard.vo.MemberVO;

@Mapper
public interface MemberMapper {

	void insertMember(MemberVO member);

	MemberVO selectMemberByEmailAndPasswd(MemberVO member);

	MemberVO selectMemberByEmail(String username);

	void insertMemberRole(MemberRoleVO role);

}
