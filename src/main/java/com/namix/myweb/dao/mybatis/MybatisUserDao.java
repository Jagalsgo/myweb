package com.namix.myweb.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.namix.myweb.dao.UserDao;
import com.namix.myweb.entity.User;

@Repository
public class MybatisUserDao implements UserDao {
	
	private UserDao userDaoMapper;
	
	@Autowired
	public MybatisUserDao(SqlSession sqlSession) {
		userDaoMapper = sqlSession.getMapper(UserDao.class);
	}
	
	@Override
	public User login(String userId, String userPassword) {
		return userDaoMapper.login(userId, userPassword);
	}

	@Override
	public int reg(User user) {
		return userDaoMapper.reg(user);
	}

}
