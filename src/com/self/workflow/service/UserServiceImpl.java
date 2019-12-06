package com.self.workflow.service;

import com.self.workflow.dao.UserDao;
import com.self.workflow.dao.UserDaoImpl;
import com.self.workflow.model.Account;
import com.self.workflow.model.User;


public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();

	
	public int createUser(int id) {
		int userId = userDao.createUser(id);
		//return userId;
		return userId;	
	}


	@Override
	public int userLogin(int id) {
		//int userLoginId 
		return 0;
	}

}
