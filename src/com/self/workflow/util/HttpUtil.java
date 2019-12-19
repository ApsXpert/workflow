package com.self.workflow.util;

import javax.servlet.http.HttpServletRequest;

import com.self.workflow.model.Account;
import com.self.workflow.model.UserLogin;

public class HttpUtil {

	public static Account constructAccount(HttpServletRequest request){
		String companyName = request.getParameter("companyName");
		String primaryAdminEmail = request.getParameter("primaryAdminEmail");
		String password = request.getParameter("password");
		String companyLogoPath = request.getParameter("companyLogoPath");
		String maximumUser = request.getParameter("maxUser");
		Account account = new Account(companyName, primaryAdminEmail, password, 
				companyLogoPath, maximumUser);
		return account;
		}
	
	public static UserLogin registerUser(HttpServletRequest request) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserLogin user = new UserLogin(email,password);
		return user;
	}
}
