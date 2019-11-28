package com.self.workflow.service;

import com.self.workflow.dao.AccountDaoImpl;
import com.self.workflow.model.Account;

public class AccountServiceImpl implements AccountService {
	
	AccountDaoImpl accountDao = new AccountDaoImpl();
	public String registerAccount(Account account) {
		return accountDao.createAccount(account);
	}
}
