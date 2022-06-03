package com.bank;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EverestBankTest {
	private EverestBank bank = null;
	
	@Before
	public void setup() {
		bank = new EverestBank();
		bank.setName("EverestBank");
		bank.setAddress("Baneshwor");
		bank.setType("Commerical");
		
	}
	@Test
	public void getLoanPercentageTest() {
		int loanPercentage = bank.getLoanPercentage();
		assertTrue(loanPercentage > 0);
	}
	@Test
	public void getDepositInterestTest() {
		int depositInterest = bank.getDepositInterest();
		assertTrue(depositInterest > 0);
	}
	
	

}
