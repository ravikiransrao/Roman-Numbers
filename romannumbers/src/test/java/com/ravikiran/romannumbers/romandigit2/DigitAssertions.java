package com.ravikiran.romannumbers.romandigit2;

import org.junit.Test;
import static org.junit.Assert.*;

public class DigitAssertions {

	
	@Test
	public static void RomanDigitAssertions(RomanDigit p, int id, boolean isMidDigit, char letter,  Integer value, boolean canIncrement, boolean canDecrement, boolean isFinal  ) {
		assertEquals(letter, p.getLetter());
		assertNotNull(p);
		assertEquals(id, p.getId());
		assertTrue(p.getValue().compareTo(value)==0);
		assertEquals(isMidDigit, p.isMidDigit());
		assertEquals(canDecrement, p.isCanDecrement());
		assertEquals(canIncrement, p.isCanIncrement());
		assertEquals(isFinal, p.isFinal());
	}
	
}
