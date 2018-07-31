package com.czx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czx.dao.UserDao;
import com.czx.dto.User;
import com.czx.service.UserSerevice;

@Service
public class UserServiceImpl implements UserSerevice {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User searchUser() {
		// TODO Auto-generated method stub
		return userDao.showUser();
	}

}
