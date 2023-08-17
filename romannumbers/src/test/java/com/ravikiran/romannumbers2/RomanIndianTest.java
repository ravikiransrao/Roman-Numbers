package com.ravikiran.romannumbers2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanIndianTest {

	@Test
	public void testRomanIndianString() {
		String err = "This is not a valid Roman Number";
		
		//Error Scenarios
		romanAssertions("JOSSPPW", 0, "A Roman Number can only contain characters I, V, X, L, C, D, M");
		romanAssertions("IXIV", 0, err);
		romanAssertions("IVIX", 0, err);
		romanAssertions("IVV", 0, err);
		romanAssertions("XVV", 0, err);
		romanAssertions("IIII", 0, err);
		romanAssertions("XIIII", 0, err);
		romanAssertions("IC", 0, err);
		romanAssertions("CMIXIV", 0, err);
	
		
		//Valid Scenarios
		romanAssertions( "I", 1, "");
		romanAssertions("XX", 20, "");
		romanAssertions("XXIII", 23, "");
		romanAssertions("XIX", 19, "");
		romanAssertions("XXV", 25, "");
		romanAssertions("LXX", 70, "");
		romanAssertions("XL", 40, "");
		romanAssertions("XLV", 45, "");
		romanAssertions("XCV", 95, "");
		romanAssertions("CD", 400, "");
		romanAssertions("MCMLXXXIII", 1983, "");
		romanAssertions("MMMM", 4000, "");
		romanAssertions("CCXC", 290, "");
		
			//romanAssertions("IXIV", 0, err);
	}
	
	

	@Test
	public void testRomanIndianInteger() {
		RomanIndian r = new RomanIndian(1);
		assertNotNull(r);
	}
	
	private void romanAssertions( String romanNumber, Integer indianNumber, String errorMessage) {
		RomanIndian r = new RomanIndian(romanNumber);
		assertNotNull(r);
		
		assertTrue(r.getIndianNumber().compareTo(indianNumber)==0);
		assertEquals(r.getErrorMessage(), errorMessage);
		if(errorMessage.equalsIgnoreCase("")) {
			assertEquals(r.getRomanNumber(), romanNumber);
		}else {
			assertEquals(r.getRomanNumber(), "");
		}
		
		
	}

}
