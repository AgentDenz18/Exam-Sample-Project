package com.java.minibank.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.minibank.Dao.BankAccountDao;
import com.java.minibank.model.BankAccount;
import com.java.minibank.service.BankAccountService;

@Service
public class BankAccountServiceImpl implements BankAccountService{
	
	@Autowired
	BankAccountDao bankAccountDao;

//	@Override
//	public void getPreviousTransaction(String transaction, int amountTransact) {
//		BankAccountDao.getPreviousTransact(transaction, amountTransact);
//	}
    
	
	@Override
	public void insertDeposit(BankAccount deposit) {
		// TODO Auto-generated method stub
		BankAccountDao.insertDeposit(deposit);
	}

	@Override
	public void insertWithDraw(BankAccount withdraw) {
		// TODO Auto-generated method stub
		BankAccountDao.insertWithdraw(withdraw);	
	}

	@Override
	public void getAllUsernames() {
		// TODO Auto-generated method stub
		List<BankAccount> bankUsername = BankAccountDao.getAllUserNames();
		for (BankAccount bankName : bankUsername) {
			System.out.println(bankName.toString());
		}
	}

	@Override
	public void getUserById(String userId) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = BankAccountDao.getUserById(userId);
		System.out.println(bankAccount);
	}
	
}
