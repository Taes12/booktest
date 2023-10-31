package com.projectbook.web.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projectbook.web.domain.Book;

@Repository
public class BookDaoDImpl implements BookDao {
	
	private final String NAME_SPACE = "com.projectbook.web.mapper.BookMapper";
	
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	// 메인 페이지(책 리스트)
	@Override
	public List<Book> bookList() {
		return sqlSession.selectList(NAME_SPACE+".bookList");
	}
	// 책 상세보기
	@Override
	public Book bookDetail(int no) {
		return sqlSession.selectOne(NAME_SPACE+".bookDetail", no);
	}

}
