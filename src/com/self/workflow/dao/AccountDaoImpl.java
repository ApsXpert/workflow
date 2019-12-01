package com.self.workflow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.self.workflow.connection.DatabaseConnection;
import com.self.workflow.model.Account;

public class AccountDaoImpl implements AccountDao {

	@Override
	public String createAccount(Account account) {
		
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
			
			int i= preparedStatement.executeUpdate();
			
			if (i!=0)  //Just to ensure data has been inserted into the database
				 return "SUCCESS";
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return "Not register";
	}

}
