package com.java.minibank.service;

import java.util.List;

import com.java.minibank.model.*;

public interface BankAccountService {
		
		void insertDeposit(BankAccount deposit);
		void insertWithDraw(BankAccount withdraw);
		void getAllUsernames();
		void getUserById(String userId);
//		void getPreviousTransaction(String transaction, int amountTransac);
	
}
