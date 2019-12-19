package com.self.workflow.service;

import com.self.workflow.model.Account;
import com.self.workflow.model.User;
import com.self.workflow.model.UserLogin;

public interface UserService {
	
	//public void createUser(Account account);
	public int createUser(int id);
	public int registerUser(UserLogin user);
}
