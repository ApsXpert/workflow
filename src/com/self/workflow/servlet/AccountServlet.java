package com.self.workflow.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.self.workflow.model.Account;
import com.self.workflow.model.User;
import com.self.workflow.service.AccountServiceImpl;
import com.self.workflow.service.UserServiceImpl;


@WebServlet("/auth/account")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/account.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("#####");
		
		String companyName = request.getParameter("companyName");
		String primaryAdminEmail = request.getParameter("primaryAdminEmail");
		String password = request.getParameter("password");
		String companyLogoPath = request.getParameter("companyLogoPath");
		String maximumUser = request.getParameter("maxUser");
		
		Account account = new Account();
		account.setCompanyName(companyName);
		account.setPrimaryAdminEmail(primaryAdminEmail);
		account.setPassword(password);
		account.setCompanyLogoPath(companyLogoPath);
		account.setMaxUser(maximumUser);
		
		AccountServiceImpl accountService = new AccountServiceImpl();
		String createAccount = accountService.registerAccount(account);
		
		UserServiceImpl userService = new UserServiceImpl();
		userService.account(account);
	
		
		
		if(createAccount.equals("SUCCESS")) {
			//System.out.println("SUCCESS");
			//request.getRequestDispatcher("/api/user").forward(request, response);
			request.getRequestDispatcher("/WEB-INF/user.jsp").forward(request, response);
		}else
		{
			 request.setAttribute("errMessage", createAccount);
			 request.getRequestDispatcher("/WEB-INF/account.jsp").forward(request, response);
			//System.out.println("error");
		}
		
	}

}
