package com.ravikiran.romannumbers.romandigit2;

import com.ravikiran.romannumbers2.RomanException;

public class RomanDigit {
	protected RomanDigit(int id,  boolean isMidDigit)  throws IllegalArgumentException{
		super();
		if(id<0 ||id>3) {
			throw new IllegalArgumentException("Position ID can only be 0, 1, 2 or 3");
		}
		if (id ==0 && isMidDigit) {
			throw new IllegalArgumentException("Not a valid digit");
		}
		if (isMidDigit) {
			this.canDecrement= false;
			this.canIncrement= false;
			this.isFinal= true;
			switch (id) {
				case 1:
					this.value= 5;
					this.letter='V';
					break;
				case 2:
					this.value= 50;
					this.letter='L';
					break;
				case 3:
					this.value= 500;
					this.letter = 'D';
					break;				
			}
			
		}else {
			this.canDecrement= true;
			this.canIncrement= true;
			this.isFinal= false;
			switch(id) {
				case 0:
					this.value= 1;
					this.letter= 'I';
					break;
				case 1:
					this.value= 10;
					this.letter= 'X';
					break;
				case 2:
					this.value= 100;
					this.letter= 'C';
					break;
				case 3:
					this.value= 1000;
					this.letter= 'M';
					
					break;
			}
			
		}
		
		
		this.id = id;
		
		this.isMidDigit = isMidDigit;
	}
	private char letter;
	private int id;
	private Integer value;
	private boolean isFinal;
	private boolean canIncrement;
	private boolean canDecrement;
	private boolean isMidDigit;
	public char getLetter() {
		return letter;
	}
	public int getId() {
		return id;
	}
	
	public Integer getValue() {
		return value;
	}
	public boolean isFinal() {
		return isFinal;
	}
	public boolean isCanIncrement() {
		return canIncrement;
	}
	public boolean isCanDecrement() {
		return canDecrement;
	}
	public boolean isMidDigit() {
		return isMidDigit;
	}
	protected void setLetter(char letter) {
		this.letter = letter;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected void setValue(Integer value) {
		this.value = value;
	}
	protected void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	protected void setCanIncrement(boolean canIncrement) {
		this.canIncrement = canIncrement;
	}
	protected void setCanDecrement(boolean canDecrement) {
		this.canDecrement = canDecrement;
	}
	protected void setMidDigit(boolean isMidDigit) {
		this.isMidDigit = isMidDigit;
	}
	
	
}
