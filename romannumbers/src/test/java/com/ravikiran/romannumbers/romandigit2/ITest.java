package com.ravikiran.romannumbers.romandigit2;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class ITest {

	//@Ignore
	@Test
	public void testI() {
		
		I I = new I();
		DigitAssertions.RomanDigitAssertions(I, 0, false, 'I', 1, true, true, false);
	}

}
