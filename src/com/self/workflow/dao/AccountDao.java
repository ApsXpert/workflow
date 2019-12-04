package com.self.workflow.dao;

import com.self.workflow.model.Account;

public interface AccountDao {
	public int createAccount(Account account);
	public int createAdminAccount(int accountId, int userId);
	
}
