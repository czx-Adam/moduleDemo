package com.czx.dao.impl;

import org.springframework.stereotype.Repository;

import com.czx.dao.UserDao;
import com.czx.dto.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public User showUser() {
		// TODO Auto-generated method stub
		return new User();
	}

}
