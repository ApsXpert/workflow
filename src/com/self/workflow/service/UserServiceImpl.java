package com.self.workflow.service;

import com.self.workflow.dao.UserDao;
import com.self.workflow.dao.UserDaoImpl;
import com.self.workflow.model.Account;
import com.self.workflow.model.User;
import com.self.workflow.model.UserLogin;


public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();

	
	public int createUser(int id) {
		int userId = userDao.createUser(id);
		//return userId;
		return userId;	
	}

	public int registerUser(UserLogin user) {
		int userId = userDao.registerUser(user); 
		return userId;
	}

}
