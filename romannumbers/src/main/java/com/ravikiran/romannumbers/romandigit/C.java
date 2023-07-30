package com.ravikiran.romannumbers.romandigit;

import com.ravikiran.romannumbers.Position;

public class C extends RomanDigit {
	public C() {
		Position p = new Position(0, false);
		super.setLetter('C');
		super.setValue(100);
		super.setCanDecrementIncrement(true);
		super.setPosition(p);
	}
}
