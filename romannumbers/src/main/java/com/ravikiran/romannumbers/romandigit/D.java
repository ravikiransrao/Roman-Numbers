package com.ravikiran.romannumbers.romandigit;

import com.ravikiran.romannumbers.Position;

public class D extends RomanDigit {
	public D() {
		Position p = new Position(3, true);
		super.setLetter('D');
		super.setValue(500);
		super.setCanDecrementIncrement(false);
		super.setPosition(p);
	}
}
