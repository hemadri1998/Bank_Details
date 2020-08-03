package com.org.bank.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class LedgerDto {
	
	private int id;
	
	private String accountNo;
	
	private double creditAmount;
	
	private double debitAmount;
	
	private double balanceAmount;
	
	private Date createdDate;
	
	private Date updatedDate;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getAccountNo() {
		return accountNo;
	}

	protected void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	protected double getCreditAmount() {
		return creditAmount;
	}

	protected void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	protected double getDebitAmount() {
		return debitAmount;
	}

	protected void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	protected double getBalanceAmount() {
		return balanceAmount;
	}

	protected void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	protected Date getCreatedDate() {
		return createdDate;
	}

	protected void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	protected Date getUpdatedDate() {
		return updatedDate;
	}

	protected void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "LedgerDto [id=" + id + ", accountNo=" + accountNo + ", creditAmount=" + creditAmount + ", debitAmount="
				+ debitAmount + ", balanceAmount=" + balanceAmount + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + "]";
	}

	
}
