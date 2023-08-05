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
	public Position (Position p) {
		setValue(p.getValue());
		this.isFinal= p.isFinal();
		
	}
	/* 0: I 
	 * 1: V and X
	 * 2: L and C
	 * 3: D and M
	 */
	private int value;
	private boolean isFinal;
	private int positionCounter=1;
	public int getValue() {
		return value;
	}
	public void setValue(int value)throws  IllegalArgumentException {
		if (value<0 || value >3) {
			throw new RomanException("Position must be an integer between 0 and 3");
		}
		this.value = value;
	}
	public boolean isFinal() {
		return isFinal;
	}
	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	
	public int getPositionCounter() {
		return positionCounter;
		
		
	}
	public void incrementPositionCounter(boolean override) throws IllegalArgumentException{
		if(isFinal) {
			throw new RomanException("This position cannot either not be incremented at all or has been incremented 3 times already");
		}
		
		if (!override) {
			
			if (positionCounter<3) {
				positionCounter++;
				
			}
			else {
				//Note that this block cannot be reached. 
				throw new RomanException("More than 3 consecutive digits detected");
				
			}
			if(positionCounter==3) {
				isFinal = true;
			}
		}
		else {
			positionCounter++;
		}
		
	}
}
