package com.example.demo.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.example.demo.model.User;

@Component
public class UserDao {
	
	private final SqlSession sqlSession;
	
	public UserDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public User selectUserById(long id) {
		return this.sqlSession.selectOne("selectUserById", id);
	}

}
