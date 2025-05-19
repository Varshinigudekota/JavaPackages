package com.bank.app;

import com.bank.accounts.BankAccount;

import com.bank.customers.Customer;

public class BankApp 
{
	public static void main(String[] args) 
	{
		BankAccount b = new BankAccount();
		b.setAccountNumber("UN00002323923");
		b.setbalance(25000);
		

		Customer cus = new Customer();
		cus.setCustomerName("Indhu");
		cus.setCustomerId(234);

		b.showAccountDetails();
		System.out.println();
		cus.showCustomerDetails() ;
	}
}