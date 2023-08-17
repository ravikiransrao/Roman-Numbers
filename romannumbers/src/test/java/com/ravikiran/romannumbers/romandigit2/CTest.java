package com.ravikiran.romannumbers.romandigit2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CTest {

	@Test
	public void testC() {
		C C= new C();
		DigitAssertions.RomanDigitAssertions(C, 2, false, 'C', 100, true, true, false);
	}

}
