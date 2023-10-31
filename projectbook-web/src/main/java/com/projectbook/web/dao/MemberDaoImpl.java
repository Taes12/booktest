package com.projectbook.web.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projectbook.web.domain.Member;
@Repository
public class MemberDaoImpl implements MemberDao {
	private SqlSessionTemplate sqlSession;
	
	private final String NAME_SPACE = "com.projectbook.web.mapper.MemberMapper";
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public Member getmember(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAME_SPACE + ".getMember", id);
	}

}
