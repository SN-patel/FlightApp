package com.godzila.flight.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Table(name = "users")
@Entity
public class User {
	@Id
	private int id;
	private String userName;
	private String password;
	private byte[] image;
	private String imagePath;
	private Date accountCreationDate;
	private Date lastPasswordChangeDate;
	private boolean isPasswordExp;
	private int failedLoginAttempt;
	private boolean isAccessDenied;
	
	@ManyToOne
	@JoinColumn(name = "userTypeId",nullable = false)
	@JsonBackReference
	private UserType userType;
	
	
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Date getAccountCreationDate() {
		return accountCreationDate;
	}
	public void setAccountCreationDate(Date accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}
	public Date getLastPasswordChangeDate() {
		return lastPasswordChangeDate;
	}
	public void setLastPasswordChangeDate(Date lastPasswordChangeDate) {
		this.lastPasswordChangeDate = lastPasswordChangeDate;
	}
	public boolean isPasswordExp() {
		return isPasswordExp;
	}
	public void setPasswordExp(boolean isPasswordExp) {
		this.isPasswordExp = isPasswordExp;
	}
	public int getFailedLoginAttempt() {
		return failedLoginAttempt;
	}
	public void setFailedLoginAttempt(int failedLoginAttempt) {
		this.failedLoginAttempt = failedLoginAttempt;
	}
	public boolean isAccessDenied() {
		return isAccessDenied;
	}
	public void setAccessDenied(boolean isAccessDenied) {
		this.isAccessDenied = isAccessDenied;
	}
	
}
