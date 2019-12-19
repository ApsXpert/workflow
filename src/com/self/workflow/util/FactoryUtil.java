package com.self.workflow.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import com.self.workflow.connection.DatabaseConnection;
import com.self.workflow.model.Account;

public class FactoryUtil {
	public static boolean adminLogin(String email, String password) {
		boolean statment = false;
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			con = DatabaseConnection.createConnection();
			String query = ("SELECT * FROM account WHERE primaryAdminEmail=? and password=?");
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			statment = resultSet.next();
		} catch(Exception e) {
			e.printStackTrace();
		}		
		return statment;
	}
	
}
