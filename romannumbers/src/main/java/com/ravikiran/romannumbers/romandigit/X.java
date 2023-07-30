package com.ravikiran.romannumbers.romandigit;

import com.ravikiran.romannumbers.Position;

public class X extends RomanDigit {
	
	public X() {
		Position p = new Position(1, false);
		super.setLetter('X');
		super.setValue(10);
		super.setCanDecrementIncrement(true);
		super.setPosition(p);
	}

}
