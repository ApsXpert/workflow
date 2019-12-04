package com.self.workflow.service;

import com.self.workflow.dao.AccountDao;
import com.self.workflow.dao.AccountDaoImpl;
import com.self.workflow.model.Account;
import com.self.workflow.model.User;

public class AccountServiceImpl implements AccountService {
	
	AccountDao accountDao = new AccountDaoImpl();
	UserService userService = new UserServiceImpl();
	
	public int createAccount(Account account) {
		
		int accountId = accountDao.createAccount(account);
		int userId = userService.createUser(accountId);
		int adminAccountId = accountDao.createAdminAccount(accountId, userId);
		System.out.println("Here is Admin Account Id in service method : " + adminAccountId);
		return accountId;
		
		//User userReg = userService.createUser(user);
		
	}
}
