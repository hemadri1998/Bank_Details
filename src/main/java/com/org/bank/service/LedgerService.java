package com.org.bank.service;

import java.util.List;

import com.org.bank.model.LedgerEntity;

public interface LedgerService {

	List<LedgerEntity> getAllLedgerDetails();

	int addLedger(LedgerEntity moneyTransfer);

}
