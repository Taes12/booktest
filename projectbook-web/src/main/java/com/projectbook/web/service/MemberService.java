package com.projectbook.web.service;

import com.projectbook.web.domain.Member;

public interface MemberService {
	//로그인 처리 메서드
	public int login(String id, String pass);
	//회원정보 반환 메서드
	public Member getMember(String id);
}
