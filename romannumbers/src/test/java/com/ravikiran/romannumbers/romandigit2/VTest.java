package com.ravikiran.romannumbers.romandigit2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VTest {

	@Test
	public void testV() {
		V V= new V();
		DigitAssertions.RomanDigitAssertions(V, 1, true, 'V', 5, false, false, true);;
	}

}
