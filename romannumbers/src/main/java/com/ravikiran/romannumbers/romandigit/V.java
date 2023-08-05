package com.ravikiran.romannumbers.romandigit;

import com.ravikiran.romannumbers.Position;

public class V extends RomanDigit {
	public V() {
		Position p = new Position(1, true);
		super.setLetter('V');
		super.setValue(5);
		super.setCanDecrementIncrement(false);
		super.setPosition(p);
		
	}
}
