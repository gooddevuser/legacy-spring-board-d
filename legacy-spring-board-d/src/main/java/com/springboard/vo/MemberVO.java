package com.springboard.vo;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class MemberVO {
	
	private String email;
	private String passwd;
	private boolean enabled;
	private Date regdate;
	
	private List<MemberRoleVO> roles;

}
