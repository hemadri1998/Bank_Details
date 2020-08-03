package com.org.bank.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.bank.dao.LedgerDao;
import com.org.bank.model.LedgerEntity;

@Service
public class LedgerServiceImpl implements LedgerService {
	
	@Autowired
	LedgerDao ledgerDaoImpl;

	public List<LedgerEntity> getAllLedgerDetails() {
		return ledgerDaoImpl.getAllLedgerDetails();
	}

	public int addLedger(LedgerEntity moneyTransfer) {
		LedgerEntity ledgerDetails = ledgerDaoImpl.getledgerBalance();
		System.out.println(ledgerDetails);
		moneyTransfer.setCreditAmount(0);
		moneyTransfer.setCreatedDate(new Date());
		moneyTransfer.setUpdatedDate(new Date());
		moneyTransfer.setBalanceAmount(ledgerDetails.getBalanceAmount() - moneyTransfer.getDebitAmount());
		return ledgerDaoImpl.saveLedgerDetails(moneyTransfer);
	}
	
	
	

}
