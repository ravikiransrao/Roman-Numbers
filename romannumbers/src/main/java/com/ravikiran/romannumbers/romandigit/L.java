package com.ravikiran.romannumbers.romandigit;

import com.ravikiran.romannumbers.Position;

public class L extends RomanDigit {
	public L() {
		Position p = new Position(0, true);
		super.setLetter('L');
		super.setValue(50);
		super.setCanDecrementIncrement(false);
		super.setPosition(p);	
	}
}
