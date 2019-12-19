package com.self.workflow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import com.self.workflow.connection.DatabaseConnection;
import com.self.workflow.model.Account;
import com.self.workflow.model.User;
import com.self.workflow.model.UserLog;
import com.self.workflow.model.UserLogin;

public class UserDaoImpl implements UserDao {
	
	int userId;
	public int createUser(int id) {
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			con = DatabaseConnection.createConnection();
			String query = "INSERT INTO user(accountId) VALUES(?)";			 
			preparedStatement = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
			//preparedStatement.setInt(1, AccountDaoImpl.id);
			preparedStatement.setInt(1, id);
//			preparedStatement.setString(2, account.getPrimaryAdminEmail());
//			preparedStatement.setString(3, account.getPassword());
			preparedStatement.executeUpdate();
			
			ResultSet rs = preparedStatement.getGeneratedKeys();
			if(rs.next()) {
				userId = rs.getInt(1);
			}
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userId; 
	}
	
	//register user by admin
	public int registerUser(UserLogin user) {
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			con = DatabaseConnection.createConnection();
			String query = "INSERT INTO userlogin(email,password)"
					+ "VALUES(?,?)";
			preparedStatement = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, user.getEmail());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.executeUpdate();
			
			ResultSet resultSet = preparedStatement.getGeneratedKeys();
			if(resultSet.next()) {
				userId = resultSet.getInt(1);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return userId;
	}
	
	
	
	
	
}
