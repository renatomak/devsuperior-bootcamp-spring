package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTests {
	
	@Test
	public void depositShouldIncreaseBalanceandDiscountFeeWhenPositiveAmount() {
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = AccountFactory.createEmptyAccount();
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	@Test
	public void depositShoudDoNothingWhenNegativeAmount() {
		double amount = -200.0;
		double expectedValue = 100.0;
		Account acc = AccountFactory.createAccount(expectedValue);
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	@Test
	public void fullWithdrowShouldClearBalanceAndReturnFullBalance() {
		double amount = -200.0;
		double expectedValue = 0.0;
		double initialBalance = 800.00;
		Account acc = AccountFactory.createAccount(initialBalance);
		
		double result = acc.fullWithdraw();
		
		Assertions.assertTrue(expectedValue == acc.getBalance());
		Assertions.assertTrue(result == initialBalance);
	}
	
	@Test
	public void withdrawShouldDecreaseBalanceWhenSufficientBalance() {		
		double expectedValue = 300.0;
		double initialBalance = 800.00;
		
		Account acc = AccountFactory.createAccount(initialBalance);
		
		acc.withdraw(500.0);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	@Test
	public void withdrawShouldThrowExceptionWhenInsufficientBalance() {		
		double initialBalance = 800.00;	
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Account acc = AccountFactory.createAccount(initialBalance);
			acc.withdraw(801.0);
		});
	}
}
