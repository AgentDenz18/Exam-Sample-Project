package com.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.java.minibank.model.BankAccount;
import com.java.minibank.service.BankAccountService;


@SpringBootApplication
public class SpringbootProjectApplication {
	
	@Autowired
	BankAccountService bankAccountService;

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootApplication.class, args);
		BankAccountService bankAccountService = context.getBean(BankAccountService.class);
		
		BankAccount bankAcc = new BankAccount();
		bankAcc.setUserName("David john");
		bankAcc.setBalance(50000);
		bankAcc.setPassword("sample");
		
		BankAccount bankAcc1 = new BankAccount();
		bankAcc1.setUserName("Cristine Dera");
		bankAcc1.setBalance(30000);
		bankAcc1.setPassword("sample1");
		
		BankAccount bankAcc2 = new BankAccount();
		bankAcc.setUserName("Demi Novato");
		bankAcc.setBalance(10000);
		bankAcc.setPassword("sample2");

		
	}

}
