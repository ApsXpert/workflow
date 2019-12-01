package com.self.workflow.model;

import java.util.Date;

public class AccountAdmin {
	private int accountAdminId;
	private Date createTimeStamp;
	private boolean enable;
	private boolean isAdmin;
	
	
	public int getAccountAdminId() {
		return accountAdminId;
	}
	public void setAccountAdminId(int accountAdminId) {
		this.accountAdminId = accountAdminId;
	}
	public Date getCreateTimeStamp() {
		return createTimeStamp;
	}
	public void setCreateTimeStamp(Date createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
