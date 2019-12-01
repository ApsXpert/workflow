package com.self.workflow.service;

import com.self.workflow.dao.UserDaoImpl;
import com.self.workflow.model.Account;
import com.self.workflow.model.User;


public class UserServiceImpl implements UserService {

	UserDaoImpl userDao = new UserDaoImpl();
	
	
	@Override
	public void account(Account account) {
		userDao.createUser(account);
		
	}

}
