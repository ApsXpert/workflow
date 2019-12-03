package com.self.workflow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.self.workflow.connection.DatabaseConnection;
import com.self.workflow.model.Account;
import com.self.workflow.model.User;

public class UserDaoImpl implements UserDao {

	public int accountId;
	public int userId;
	
	@Override
	public void createUser(Account account) {
		String primaryAdminEmail = account.getPrimaryAdminEmail();
		Connection con = null;
		PreparedStatement preparedStatementQuery1 = null;
		PreparedStatement psQuery2 = null;
		PreparedStatement psQuery3 = null;
		try {
			con = DatabaseConnection.createConnection();
			String query1 = "SELECT accountId FROM account WHERE primaryAdminEmail=?";
			preparedStatementQuery1 = con.prepareStatement(query1);
			preparedStatementQuery1.setString(1, primaryAdminEmail);
			ResultSet rs = preparedStatementQuery1.executeQuery();
			if(rs.next()) {
				accountId = rs.getInt(1);
			}
			String query2 = "INSERT INTO user(accountId) VALUES(?)";
			psQuery2 = con.prepareStatement(query2);
			psQuery2.setInt(1, accountId);
			psQuery2.executeUpdate();
			
			ResultSet resultS = psQuery2.getGeneratedKeys();
			if(resultS.next()) {
				userId = rs.getInt(1);
			}
			
			String query3 = "INSERT INTO adminaccount(accountId, userId) VALUES (?,?)";
			psQuery3 = con.prepareStatement(query3);
			psQuery3.setInt(1, accountId);
			psQuery3.setInt(2, userId);
			psQuery3.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
