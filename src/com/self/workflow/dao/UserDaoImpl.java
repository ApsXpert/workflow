package com.self.workflow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.self.workflow.connection.DatabaseConnection;
import com.self.workflow.model.Account;
import com.self.workflow.model.User;

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
			preparedStatement.executeUpdate();
			
			ResultSet rs = preparedStatement.getGeneratedKeys();
			if(rs.next()) {
				userId = rs.getInt(1);
				System.out.println("your user id : " + userId);
			}
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userId; 
	}

	
	
	
	
}
