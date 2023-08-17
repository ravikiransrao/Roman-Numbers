package com.ravikiran.romannumbers.romandigit2;

import static org.junit.Assert.*;

import org.junit.Test;

public class LTest {

	@Test
	public void testL() {
		L L = new L();
		DigitAssertions.RomanDigitAssertions(L, 2, true, 'L', 50, false, false, true);
	}

}
