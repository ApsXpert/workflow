package com.self.workflow.service;

import com.self.workflow.dao.UserDaoImpl;
import com.self.workflow.model.Account;
import com.self.workflow.model.User;


public class UserServiceImpl implements UserService {

	UserDaoImpl userDao = new UserDaoImpl();
	
	
	@Override
	***** Change method name to createUser
	public void createUser(int accountId, String email, String password) {
	 int userId = userDao.createUser(accountId);
	 userLoginService.createUserLogin(userId, email, password);
	
	}
	
	***********
	public void account(Account account) {
		userDao.createUser(account);
		
	}

}
