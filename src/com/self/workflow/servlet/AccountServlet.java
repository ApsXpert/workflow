package com.self.workflow.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.self.workflow.model.Account;
import com.self.workflow.service.AccountServiceImpl;


@WebServlet("/auth/AccountServlet")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/account.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String companyName = request.getParameter("companyName");
		String primaryAdminEmail = request.getParameter("primaryAdminEmail");
		String companyLogoPath = request.getParameter("companyLogoPath");
		String maximumUser = request.getParameter("maxUser");
		
		Account account = new Account();
		account.setCompanyName(companyName);
		account.setPrimaryAdminEmail(primaryAdminEmail);
		account.setCompanyLogoPath(companyLogoPath);
		account.setMaxUser(maximumUser);
		
		AccountServiceImpl accountService = new AccountServiceImpl();
		String createAccount = accountService.registerAccount(account);
		
		if(createAccount.equals("SUCCESS")) {
			System.out.println("SUCCESS");
			 request.getRequestDispatcher("/user.jsp").forward(request, response);
		}else
		{
			request.setAttribute("errMessage", createAccount);
			 request.getRequestDispatcher("WEB-INF/account.jsp").forward(request, response);
			System.out.println("error");
		}
		
	}

}
