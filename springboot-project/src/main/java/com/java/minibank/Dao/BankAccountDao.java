package com.java.minibank.Dao;

import java.util.List;

import com.java.minibank.model.BankAccount;

public interface BankAccountDao {
	
	void insertDeposit(BankAccount amountDeposit);
	void insertWithdraw(BankAccount amountWithdraw);
    List<BankAccount> getAllUserNames();
    BankAccount getUserById(String userId);
    
}
