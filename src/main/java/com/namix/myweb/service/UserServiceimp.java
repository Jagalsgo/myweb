package com.namix.myweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namix.myweb.dao.UserDao;
import com.namix.myweb.entity.User;

@Service
public class UserServiceimp implements UserService {

	@Autowired
	private UserDao userDao;
	
	// 로그인 요청
	@Override
	public User login(String userId, String userPassword) {
		return userDao.login(userId, userPassword);
	}

	// 회원가입 요청
	@Override
	public int reg(User user) {
		return userDao.reg(user);
	}

}
