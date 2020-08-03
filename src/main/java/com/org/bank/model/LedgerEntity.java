package com.org.bank.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ledger_details")
public class LedgerEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "account_no")
	private String accountNo;
	
	@Column(name = "credit_amount")
	private double creditAmount;
	
	@Column(name = "debit_amount")
	private double debitAmount;
	
	@Column(name = "balance_amount")
	private double balanceAmount;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "updated_date")
	private Date updatedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public double getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "LedgerEntity [id=" + id + ", accountNo=" + accountNo + ", creditAmount=" + creditAmount
				+ ", debitAmount=" + debitAmount + ", balanceAmount=" + balanceAmount + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}

}