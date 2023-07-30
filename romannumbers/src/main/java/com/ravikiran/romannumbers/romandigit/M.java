package com.ravikiran.romannumbers.romandigit;

import com.ravikiran.romannumbers.Position;

public class M extends RomanDigit {
	public M() {
		Position p = new Position(0, false);
		super.setLetter('M');
		super.setValue(1000);
		super.setCanDecrementIncrement(false);
		super.setPosition(p);
	}
}
