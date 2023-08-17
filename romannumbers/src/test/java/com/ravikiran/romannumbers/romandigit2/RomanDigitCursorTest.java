package com.ravikiran.romannumbers.romandigit2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ravikiran.romannumbers2.RomanException;

import junit.framework.Assert;

public class RomanDigitCursorTest {

	@Test
	public void testRomanDigitCursor() {
		//fail("Not yet implemented");
		I I = new I();
		RomanDigitCursor r = new RomanDigitCursor(I);
		DigitAssertions.RomanDigitAssertions(r, I.getId(), I.isMidDigit(), I.getLetter(), I.getValue(), I.isCanIncrement(), I.isCanDecrement(), I.isFinal());
		assertTrue(I.getValue().compareTo(r.getIndianValue())==0);
		assertTrue(r.getPrevIndianValue().compareTo(0)==0);
		
		V V = new V();
		RomanDigitCursor r1 = new RomanDigitCursor(V);
		DigitAssertions.RomanDigitAssertions(r1, V.getId(), V.isMidDigit(), V.getLetter(), V.getValue(), V.isCanIncrement(), V.isCanDecrement(), V.isFinal());
		assertTrue(V.getValue().compareTo(r1.getIndianValue())==0);
		assertTrue(V.getValue().compareTo(r1.getPrevIndianValue())==0);
		
		
	}
	
	@Test
	public void testUpdateCursorToLowerID() {
		RomanDigitCursor r = new RomanDigitCursor(new X());
		I I = new I();
		r.UpdateCursor(I);
		DigitAssertions.RomanDigitAssertions(r, 0, false, 'I', 1, true, true, false);
		assertEquals(1, r.getIncrementCounter());
		assertTrue(r.getIndianValue().compareTo(11)==0);
		assertTrue(r.getPrevIndianValue().compareTo(10)==0);
		
		RomanDigitCursor r1 = new RomanDigitCursor(new V());
		r1.UpdateCursor(I);
		DigitAssertions.RomanDigitAssertions(r1, 0, false, 'I', 1,true , false, false);
		assertEquals(1, r1.getIncrementCounter());
		assertTrue(r1.getIndianValue().compareTo(6)==0);
		assertTrue(r1.getPrevIndianValue().compareTo(6)==0);
		
		RomanDigitCursor r2 = new RomanDigitCursor(new M());
		r2.UpdateCursor(I);
		DigitAssertions.RomanDigitAssertions(r2, 0, false, 'I', 1, true, true, false);
		assertEquals(1, r2.getIncrementCounter());
		assertTrue(r2.getIndianValue().compareTo(1001)==0);
		assertTrue(r2.getPrevIndianValue().compareTo(1000)==0);
		
		RomanDigitCursor r3 = new RomanDigitCursor(new M());
		L L = new L();
		r3.UpdateCursor(L);
		DigitAssertions.RomanDigitAssertions(r3, 2, true, 'L', 50, false,false, true);
		assertEquals(1, r3.getIncrementCounter());
		assertTrue(r3.getIndianValue().compareTo(1050)==0);
		assertTrue(r3.getPrevIndianValue().compareTo(1050)==0);

	}
	
	@Test
	public void testUpdateCursorDecrement() {
		RomanDigitCursor r = new RomanDigitCursor(new I());
		X X = new X();
		r.UpdateCursor(X);
		DigitAssertions.RomanDigitAssertions(r, 0, false, 'X', 10, false, false, false);
		assertTrue(r.getIndianValue().compareTo(9)==0);
		assertTrue(r.getPrevIndianValue().compareTo(9)==0);
	}
	
	@Test
	public void testUpdateCursorDecrement2() {
		RomanDigitCursor r = new RomanDigitCursor(new X());
		L L = new L();
		r.UpdateCursor(L);
		I I = new I();
		r.UpdateCursor(I);
		V V = new V();
		r.UpdateCursor(V);
		DigitAssertions.RomanDigitAssertions(r, 0, false, 'V', 5, false, false, false);
		assertTrue(r.getIndianValue().compareTo(44)==0);
		assertTrue(r.getPrevIndianValue().compareTo(44)==0);
	}
	
	@Test
	public void testUpdateCursorSameLevelIncrement() {
		testIncrement(new I());
		testIncrement (new X());
		testIncrement (new C());
		testIncrement (new M());
				
	}
	
	private void testIncrement(RomanDigit d) {
		RomanDigitCursor r = new RomanDigitCursor(d);
		r.UpdateCursor(d);
		DigitAssertions.RomanDigitAssertions(r, d.getId(), false, d.getLetter(), d.getValue(), true, false, false);
		assertEquals(r.getIncrementCounter(),2);
		assertTrue(r.getIndianValue().compareTo(d.getValue()*2)==0);
		assertTrue(r.getPrevIndianValue().compareTo(d.getValue()*2)==0);
		
		r.UpdateCursor(d);
		if (d.getLetter()=='M') {
			DigitAssertions.RomanDigitAssertions(r, d.getId(), false, d.getLetter(), d.getValue(), true, false, false);
		}else {
			DigitAssertions.RomanDigitAssertions(r, d.getId(), false, d.getLetter(), d.getValue(), false, false, false);
		}
		
		assertEquals(r.getIncrementCounter(),3);
		assertTrue(r.getIndianValue().compareTo(d.getValue()*3)==0);
		assertTrue(r.getPrevIndianValue().compareTo(d.getValue()*3)==0);
	}
	
	@Test
	public void testUpdateCursorMidDigit() {
		RomanDigitCursor r = new RomanDigitCursor(new X());
		r.UpdateCursor(new L());
		DigitAssertions.RomanDigitAssertions(r, 1, false, 'L', 50, false, false, false);
		assertTrue(r.getIndianValue().compareTo(40)==0);
		assertTrue(r.getPrevIndianValue().compareTo(40)==0);
		
	}
	
	@Test
	public void testUpdateCursorMidDigit2() {
		RomanDigitCursor r = new RomanDigitCursor(new X());
		r.UpdateCursor(new C());
		DigitAssertions.RomanDigitAssertions(r, 1, false, 'C', 100, false, false, false);
		assertTrue(r.getIndianValue().compareTo(90)==0);
		assertTrue(r.getPrevIndianValue().compareTo(90)==0);
		
		r.UpdateCursor(new V());
		DigitAssertions.RomanDigitAssertions(r, 1, true, 'V', 5, false, false, true);
		assertTrue(r.getIndianValue().compareTo(95)==0);
		assertTrue(r.getPrevIndianValue().compareTo(95)==0);
		
	}
	@Test
	public void testUpdateCursorMidDigit3() {
		RomanDigitCursor r = new RomanDigitCursor(new X());
		r.UpdateCursor(new V());
		DigitAssertions.RomanDigitAssertions(r, 1, true, 'V', 5, false, false, true);
		assertTrue(r.getIndianValue().compareTo(15)==0);
		assertTrue(r.getPrevIndianValue().compareTo(15)==0);
	}
	
	
	@Test(expected = RomanException.class)
	public void testUpdateCursorIllegalDecrement(){
		RomanDigitCursor r = new RomanDigitCursor(new I());
		r.UpdateCursor(new C());
	}
	
	@Test(expected = RomanException.class)
	public void testUpdateCursorIllegalDecrement2(){
		RomanDigitCursor r = new RomanDigitCursor(new V());
		r.UpdateCursor(new X());
	}
	
	@Test(expected = RomanException.class)
	public void testUpdateCursorIllegalDecrement3(){
		RomanDigitCursor r = new RomanDigitCursor(new V());
		r.UpdateCursor(new I());
		r.UpdateCursor(new X());
	}
	
	@Test(expected = RomanException.class)
	public void testUpdateCursorIllegalDecrement4(){
		RomanDigitCursor r = new RomanDigitCursor(new I());
		r.UpdateCursor(new I());
		r.UpdateCursor(new X());
	}
	
	@Test(expected = RomanException.class)
	public void testUpdateCursorIllegalDecrement5(){
		RomanDigitCursor r = new RomanDigitCursor(new I());
		r.UpdateCursor(new X());
		r.UpdateCursor(new I());
	}
	
	@Test(expected = RomanException.class)
	public void testUpdateCursorIllegalDecrement6(){
		RomanDigitCursor r = new RomanDigitCursor(new I());
		r.UpdateCursor(new X());
		r.UpdateCursor(new X());
	}
	
	
	@Test(expected = RomanException.class)
	public void testUpdateCursorIllegalSameLevel1(){
		RomanDigitCursor r = new RomanDigitCursor(new V());
		r.UpdateCursor(new V());
		
	}
	
	@Test(expected = RomanException.class)
	public void testUpdateCursorIllegalSameLevel2(){
		RomanDigitCursor r = new RomanDigitCursor(new I());
		for(int i=1;i<=3;i++) {
			r.UpdateCursor(new I());
		}
	}
	
}
