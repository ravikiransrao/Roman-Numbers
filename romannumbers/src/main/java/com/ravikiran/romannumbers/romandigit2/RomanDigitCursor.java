package com.ravikiran.romannumbers.romandigit2;

import com.ravikiran.romannumbers2.RomanException;

public class RomanDigitCursor extends RomanDigit {
	public RomanDigitCursor(RomanDigit r) {
		super(r.getId(), r.isMidDigit());
		this.indianValue=r.getValue();
		if(this.isMidDigit()) {
			this.prevIndianValue = r.getValue();
		}
	}
	private int incrementCounter =1;
	private Integer indianValue=0;
	private Integer prevIndianValue = 0;
	public int getIncrementCounter() {
		return incrementCounter;
	}
	
	public void UpdateCursor (RomanDigit r) throws RomanException {
		if (this.getId()-r.getId()<-1) {
			throw new RomanException();
		}
		if (this.getId()-r.getId()== -1) {
			if(!this.isCanDecrement()) {
				throw new RomanException();
			}else {
				this.indianValue= this.prevIndianValue+r.getValue()-this.getValue();
				this.prevIndianValue=this.indianValue;
				this.setCanDecrement(false);
				this.setCanIncrement(false);
				this.setValue(r.getValue());
				//this.setMidDigit(r.isMidDigit());
				this.setFinal(false);
				this.setLetter(r.getLetter());
			}
		}else if(this.getId()==r.getId()) 
		{
				//throw new RomanException();
				
			if( this.isFinal()) {
				throw new RomanException();
			}
			if(this.getLetter()== r.getLetter()) {
				if(!this.isCanIncrement()) {
					throw new RomanException();
				}
				
				this.incrementCounter+= 1;
				this.setCanDecrement(false);
				if(this.incrementCounter==3 && r.getId()!=3) {
					//this.setFinal(true);
					this.setCanIncrement(false);
				}
				this.indianValue+=r.getValue();
				this.prevIndianValue= this.indianValue;
				
			}else {
				if (!r.isMidDigit()) {
					throw new RomanException();
				}
				
				this.setCanDecrement(false);
				this.setCanIncrement(false);
				this.setValue(r.getValue());
				this.setFinal(true);
				this.setLetter(r.getLetter());
				this.setId(r.getId());
				this.setMidDigit(r.isMidDigit());
				this.indianValue+=r.getValue();
				this.prevIndianValue= this.indianValue;
			}
				
				
		}else if(this.getId()>r.getId()){
				this.incrementCounter=1;
				this.setCanIncrement(r.isCanIncrement());
				if(this.getId()-r.getId()==1) {
					this.setCanDecrement(!this.isMidDigit()&&r.isCanDecrement());
					
				}else {
					this.setCanDecrement(r.isCanDecrement());
				}
				this.setValue(r.getValue());
				this.setLetter(r.getLetter());
				this.setId(r.getId());
				
				this.setFinal(r.isFinal());
				this.setMidDigit(r.isMidDigit());
				this.prevIndianValue= this.indianValue;
				this.indianValue+=r.getValue();
				if(!this.isCanDecrement()) {
					this.prevIndianValue= this.indianValue;
				}
				
			}
			
		}
		
		
		


	public Integer getIndianValue() {
		return indianValue;
	}

	public Integer getPrevIndianValue() {
		return prevIndianValue;
	}
	

}
