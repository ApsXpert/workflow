package com.self.workflow.dao;

import com.self.workflow.model.Account;
import com.self.workflow.model.User;
import com.self.workflow.model.UserLog;
import com.self.workflow.model.UserLogin;

public interface UserDao {
	
	public int createUser(int id);
	public int registerUser(UserLogin user);
	
}
