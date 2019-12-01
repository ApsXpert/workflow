package com.self.workflow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.self.workflow.connection.DatabaseConnection;
import com.self.workflow.model.Account;
import com.self.workflow.model.User;

public class UserDaoImpl implements UserDao {

	public int accountId;
	
	@Override
	public void createUser(Account account) {
		String primaryAdminEmail = account.getPrimaryAdminEmail();
		Connection con = null;
		PreparedStatement preparedStatement = null;
		PreparedStatement ps = null;
		try {
			con = DatabaseConnection.createConnection();
			String query = "SELECT accountId FROM account WHERE primaryAdminEmail=?";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, primaryAdminEmail);
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				accountId = rs.getInt(1);
			}
			String query1 = "INSERT INTO user(accountId) VALUES(?)";
			ps = con.prepareStatement(query1);
			ps.setInt(1, accountId);
			ps.executeUpdate();

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
