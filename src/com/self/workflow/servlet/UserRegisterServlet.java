package com.self.workflow.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.self.workflow.model.UserLogin;
import com.self.workflow.service.UserService;
import com.self.workflow.service.UserServiceImpl;
import com.self.workflow.util.HttpUtil;

@WebServlet("/dashboard")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/dashboard.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			UserLogin user = HttpUtil.registerUser(request);
			UserService userService = new UserServiceImpl();
			userService.registerUser(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
