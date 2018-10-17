package com.cg.mobshop.dto;

import java.time.LocalDate;
import java.util.Date;

public class PurchaseDetails {
	
	private int purchaseId;
	private int mobileId; 
	private String custname;
	private String mailId; 
	private String  phoneNo;
	private LocalDate purchaseDate;
	
	
	public int getPurchaseId() {
		return purchaseId;
	}
	
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	
	public int getMobileId() {
		return mobileId;
	}
	
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	
	public String getCustname() {
		return custname;
	}
	
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	public String getMailId() {
		return mailId;
	}
	
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


}
