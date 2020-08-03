package com.org.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.org.bank.model.LedgerEntity;
import com.org.bank.service.LedgerService;

@Controller
public class LedgerController {
	
	
	@Autowired
	LedgerService ledgerServiceImpl;
	

	 @RequestMapping("MoneyTransfer")
	 public ModelAndView getForm(@ModelAttribute("moneyTransfer") LedgerEntity moneyTransfer) {
	  return new ModelAndView("MoneyTransfer");
	 }
	 
	 @RequestMapping(value="/moneyTransfer")
	 public ModelAndView moneyTransfer(LedgerEntity moneyTransfer) {
		 System.out.println(moneyTransfer);
		 int status = ledgerServiceImpl.addLedger(moneyTransfer);
	  return new ModelAndView("redirect:showLedgerDetails");
	 }
	
	@RequestMapping("showLedgerDetails")
	 public ModelAndView getList() {
	  List<LedgerEntity> ledgerList = ledgerServiceImpl.getAllLedgerDetails();
	  return new ModelAndView("LedgerList", "ledgerList", ledgerList);
	 }
	

}
