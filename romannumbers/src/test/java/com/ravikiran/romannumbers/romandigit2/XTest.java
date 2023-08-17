package com.ravikiran.romannumbers.romandigit2;

import static org.junit.Assert.*;

import org.junit.Test;

public class XTest {

	@Test
	public void testX() {
		X X = new X();
		DigitAssertions.RomanDigitAssertions(X, 1, false, 'X', 10, true, true, false);
	}

}
