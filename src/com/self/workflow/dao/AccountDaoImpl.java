package com.self.workflow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.self.workflow.connection.DatabaseConnection;
import com.self.workflow.model.Account;

public class AccountDaoImpl implements AccountDao {

	public int accountId;
	@Override
	public void createAccount(Account account) {
		
		String companyName = account.getCompanyName();
		String primaryAdminEmail = account.getPrimaryAdminEmail();
		String password = account.getPassword();
		String companyLogoPath = account.getCompanyLogoPath();
		String maxUser = account.getMaxUser();
		
		
		
		Connection con = null;
		PreparedStatement preparedStatement = null;
		
		try {
			con = DatabaseConnection.createConnection();
			String query = "INSERT INTO account(companyName, primaryAdminEmail, password, companyLogoPath, maxUser)"
					+ "VALUES(?, ?, ?, ?, ?)";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, companyName);
			preparedStatement.setString(2, primaryAdminEmail);
			preparedStatement.setString(3, password);
			preparedStatement.setString(4, companyLogoPath);
			preparedStatement.setString(5, maxUser);
			preparedStatement.executeUpdate();
			//int i= preparedStatement.executeUpdate();
			
			/*
			 * String query1 = "SELECT accountId FROM account WHERE primaryAdminEmail=?";
			 * preparedStatement = con.prepareStatement(query1);
			 * preparedStatement.setString(1, primaryAdminEmail); ResultSet rs =
			 * preparedStatement.executeQuery();
			 * 
			 * if(rs.next()) { int accountId = rs.getInt(1); }
			 */
			
			/*
			 * if (i!=0) return "SUCCESS";
			 */
			} catch (Exception e) {
				e.printStackTrace();
			}
		//return "Not register";
	}

}
