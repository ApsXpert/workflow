package com.self.workflow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.self.workflow.connection.DatabaseConnection;
import com.self.workflow.model.Account;

public class AccountDaoImpl implements AccountDao {
	 int id;
	 int adminAccountId;
	public int createAccount(Account account) {		
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			con = DatabaseConnection.createConnection();
			String query = "INSERT INTO account(companyName, primaryAdminEmail, password, companyLogoPath, maxUser)"
					+ "VALUES(?, ?, ?, ?, ?)";
			//preparedStatement = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
			preparedStatement = con.prepareStatement(query , preparedStatement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, account.getCompanyName());
			preparedStatement.setString(2, account.getPrimaryAdminEmail());
			preparedStatement.setString(3, account.getPassword());
			preparedStatement.setString(4, account.getCompanyLogo());
			preparedStatement.setString(5, account.getMaxUser());
			preparedStatement.executeUpdate();
			
			ResultSet rs = preparedStatement.getGeneratedKeys();
			if(rs.next()) { 
				id =	rs.getInt(1);
				System.out.println("this is account id : " + id);
				//account.setAccountId(id);
				return id;
			}
			rs.close();
			con.close();
			return id;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;	
		}
	}
	
	public int createAdminAccount(int accountId, int userId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DatabaseConnection.createConnection();
			String query1 = "INSERT INTO accountadmin(accountId,userId) VALUES (?,?)";
			pstmt = con.prepareStatement(query1 , pstmt.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, accountId);
			pstmt.setInt(2, userId);
			pstmt.executeUpdate();
			ResultSet resultSet = pstmt.getGeneratedKeys();
			if(resultSet.next()) {
				adminAccountId = resultSet.getInt(1);
				System.out.println("Admin Accunt ID : " + adminAccountId);
				}
			} catch(Exception e) {
			e.printStackTrace();
		}
		return adminAccountId;
	}
}
