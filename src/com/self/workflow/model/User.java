package com.self.workflow.model;

import java.util.Date;

public class User {
	private int userId;
	private int accountId;
	private Date createTimeStamp;
	private boolean addedBy;
	private boolean active;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAccountId() {
		return accountId;
	}
	public int setAccountId(int accountId) {
		return this.accountId = accountId;
	}
	public Date getCreateTimeStamp() {
		return createTimeStamp;
	}
	public void setCreateTimeStamp(Date createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}
	public boolean isAddedBy() {
		return addedBy;
	}
	public void setAddedBy(boolean addedBy) {
		this.addedBy = addedBy;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
