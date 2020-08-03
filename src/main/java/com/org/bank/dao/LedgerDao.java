package com.org.bank.dao;

import java.util.List;

import com.org.bank.model.LedgerEntity;

public interface LedgerDao {

	List<LedgerEntity> getAllLedgerDetails();

	LedgerEntity getledgerBalance();

	int saveLedgerDetails(LedgerEntity moneyTransfer);

}
