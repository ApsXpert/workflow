package com.self.workflow.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.self.workflow.model.Account;
import com.self.workflow.model.User;
import com.self.workflow.service.AccountService;
import com.self.workflow.service.AccountServiceImpl;
import com.self.workflow.service.UserService;
import com.self.workflow.service.UserServiceImpl;
import com.self.workflow.util.HttpUtil;

@WebServlet("/auth/account")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/account.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			
			Account account = HttpUtil.constructAccount(request);
			AccountService accountService = new AccountServiceImpl();
			  
			int accountReg = accountService.createAccount(account);
			
			if(accountReg != 0) {
				
				//int accountId = accountReg.getAccountId(); 
			}
			  
			UserService userService = new UserServiceImpl();
			//User userReg = userService.createUser(user);
			
			
			  //String createAccount =  accountService.registerAccount(account);
			  
			  //UserServiceImpl userService = new UserServiceImpl();
			  //userService.account(account);
			 
			 response.sendRedirect(request.getContextPath()+"/api/user");
		} catch (Exception e) {
			response.sendRedirect(request.getContextPath() + "/auth/account");
			e.printStackTrace();
			System.out.println("error a gya jy");
			
		}
		/*
		 * if(createAccount.equals("SUCCESS")) { //System.out.println("SUCCESS");
		 * request.getRequestDispatcher("/api/user").forward(request, response);
		 * //request.getRequestDispatcher("/WEB-INF/user.jsp").forward(request,
		 * response); }else { request.setAttribute("errMessage", createAccount);
		 * request.getRequestDispatcher("/WEB-INF/account.jsp").forward(request,
		 * response); //System.out.println("error"); }
		 */
		//response.sendRedirect(request.getContextPath() + "/auth/account");
	}
}
