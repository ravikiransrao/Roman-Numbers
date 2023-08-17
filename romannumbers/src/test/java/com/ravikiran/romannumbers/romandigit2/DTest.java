package com.ravikiran.romannumbers.romandigit2;

import static org.junit.Assert.*;

import org.junit.Test;

public class DTest {

	@Test
	public void testD() {
		D D = new D();
		DigitAssertions.RomanDigitAssertions(D, 3, true, 'D', 500, false, false, true);
	}

}
