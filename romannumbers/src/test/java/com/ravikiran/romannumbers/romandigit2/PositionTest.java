package com.ravikiran.romannumbers.romandigit2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {

	@Test
	public void testPosition() {
		RomanDigit p0f = new RomanDigit(0,false);
		RomanDigit p1f  = new RomanDigit (1,false);
		RomanDigit p1t= new RomanDigit (1, true);
		RomanDigit p2f= new RomanDigit (2, false);
		RomanDigit p2t= new RomanDigit (2, true);
		RomanDigit p3f= new RomanDigit (3, false);
		RomanDigit p3t= new RomanDigit (3, true);

		DigitAssertions.RomanDigitAssertions(p0f, 0, false, 'I', 1, true, true, false);
		DigitAssertions.RomanDigitAssertions(p1f, 1, false,'X', 10, true, true, false);
		DigitAssertions.RomanDigitAssertions(p1t, 1, true, 'V', 5,  false, false, true);
		DigitAssertions.RomanDigitAssertions(p2f, 2, false,'C', 100, true, true, false);
		DigitAssertions.RomanDigitAssertions(p2t, 2, true,'L', 50, false, false, true);
		DigitAssertions.RomanDigitAssertions(p3f, 3, false, 'M', 1000, true, true, false);
		DigitAssertions.RomanDigitAssertions(p3t, 3, true, 'D', 500, false, false, true);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPosition0t() {
		RomanDigit p = new RomanDigit (0,true);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPosition4t () {
		RomanDigit p = new RomanDigit (4,true);
		
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testPosition4f () {
		
		RomanDigit p1 = new RomanDigit (4,false);
		
	}
	

}
