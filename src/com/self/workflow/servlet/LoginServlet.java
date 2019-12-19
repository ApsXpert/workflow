package com.self.workflow.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.self.workflow.util.FactoryUtil;


@WebServlet("/api/user")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email= request.getParameter("email");
		String password = request.getParameter("password");
		
		if(FactoryUtil.adminLogin(email, password)) {
			response.sendRedirect(request.getContextPath()+"/dashboard");
			//request.getRequestDispatcher("/WEB-INF/dashboard.jsp").forward(request, response);
		} else {
//			System.out.println("Else part excuted");
//			response.sendRedirect(request.getContextPath()+"/api/user");
			request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
		}
		
		
	}

}
