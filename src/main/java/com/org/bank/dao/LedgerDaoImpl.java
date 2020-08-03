package com.org.bank.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.bank.model.LedgerEntity;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

@Component
public class LedgerDaoImpl implements LedgerDao{

	private Logger logger = Logger.getLogger(LedgerDaoImpl.class);

 @Autowired
 SessionFactory sessionFactory;

	public List<LedgerEntity> getAllLedgerDetails() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<LedgerEntity> ledgerList = session.createQuery("from LedgerEntity").list();
		session.close();
		return ledgerList;
	}

	@SuppressWarnings("unchecked")
	public LedgerEntity getledgerBalance() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from LedgerEntity ORDER BY id DESC");
		query.setMaxResults(1);
		List<LedgerEntity> ledgerList = query.list();
		return ledgerList.get(0);
	}

	public int saveLedgerDetails(LedgerEntity moneyTransfer) {
		Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  session.saveOrUpdate(moneyTransfer);
		  tx.commit();
		  Serializable id = session.getIdentifier(moneyTransfer);
		  session.close();
		  return (Integer) id;
	}
	
}
