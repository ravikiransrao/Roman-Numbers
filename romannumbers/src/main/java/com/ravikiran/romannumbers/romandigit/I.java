package com.ravikiran.romannumbers.romandigit;

import com.ravikiran.romannumbers.Position;

public class I extends RomanDigit {
	
	public I() {
		//super();
		Position p = new Position(0, false);
		super.setLetter('I');
		super.setValue(1);
		super.setCanDecrementIncrement(true);
		super.setPosition(p);
	}

}
