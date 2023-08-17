package com.ravikiran.romannumbers.romandigit2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MTest {

	@Test
	public void testM() {
		M M = new M();
		DigitAssertions.RomanDigitAssertions(M, 3, false, 'M', 1000, true, true, false);
	}

}
