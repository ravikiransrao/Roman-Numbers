package com.ravikiran.romannumbers;
/* Position  
 * 
 */
public class Position   {
	
	public Position (int value, boolean isFinal)  {
		super();
		
		setValue (value);
		this.isFinal = isFinal;
	}
	/* 0: I and V
	 * 1: X and L
	 * 2: C and D
	 * 3: M
	 */
	private int value;
	private boolean isFinal;
	public int getValue() {
		return value;
	}
	public void setValue(int value)throws  IllegalArgumentException {
		if (value<0 || value >3) {
			throw new IllegalArgumentException("Position must be an integer between 0 and 3");
		}
		this.value = value;
	}
	public boolean isFinal() {
		return isFinal;
	}
	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	
}
