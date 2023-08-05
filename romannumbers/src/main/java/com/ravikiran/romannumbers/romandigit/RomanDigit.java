package com.ravikiran.romannumbers.romandigit;

import com.ravikiran.romannumbers.Position;
import com.ravikiran.romannumbers.RomanException;

public class RomanDigit {
	
	private char letter;
	private Integer value;
	//Can Decrement: it can reduce the value by preceding another digit - e.g. IX
	//Increment - specifies whether multiple increments is possible - e.g. XII
	//For V, L, D, will be false. 
	private boolean canDecrementIncrement; 
	private Position position;
	public char getLetter() {
		return letter;
	}
	public Integer getValue() {
		return value;
	}
	public boolean isCanDecrementIncrement() {
		return canDecrementIncrement;
	}
	public Position getPosition() {
		return position;
	}
	protected void setLetter(char letter) {
		this.letter = letter;
	}
	protected void setValue(Integer value) {
		this.value = value;
	}
	protected void setCanDecrementIncrement(boolean canDecrementIncrement) {
		this.canDecrementIncrement = canDecrementIncrement;
	}
	protected void setPosition(Position position) {
		this.position = position;
	}
	public Integer decrement(RomanDigit r) throws IllegalArgumentException{
		if( r.canDecrementIncrement) {
			if (r.getPosition().isFinal()) {
				throw new RomanException();
			}
			else {
				if (this.getPosition().getValue()-r.getPosition().getValue()==1) {
					value=value-r.getValue();
					position.setFinal(true);
					position.setValue(position.getValue()-1);
					return value;
				}
				else {
					throw new RomanException();
				}
					
			}
		}
		else {
			
			throw new RomanException();
		}
	}
	

}
