package com.self.workflow.model;

import java.util.Date;

public class Account {
	
	private int accountId;
	private String companyName;
	private String primaryAdminEmail;
	private Date createTimeStamp;
	private String companyLogo;
	private String companyLogoPath;
	private String maxUser;
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPrimaryAdminEmail() {
		return primaryAdminEmail;
	}
	public void setPrimaryAdminEmail(String primaryAdminEmail) {
		this.primaryAdminEmail = primaryAdminEmail;
	}
	public Date getCreateTimeStamp() {
		return createTimeStamp;
	}
	public void setCreateTimeStamp(Date createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}
	public String getCompanyLogo() {
		return companyLogo;
	}
	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}
	public String getCompanyLogoPath() {
		return companyLogoPath;
	}
	public void setCompanyLogoPath(String companyLogoPath) {
		this.companyLogoPath = companyLogoPath;
	}
	public String getMaxUser() {
		return maxUser;
	}
	public void setMaxUser(String maximumUser) {
		this.maxUser = maximumUser;
	}

}
