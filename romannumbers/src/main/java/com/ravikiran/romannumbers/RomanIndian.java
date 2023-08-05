package com.ravikiran.romannumbers;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;

import com.ravikiran.romannumbers.romandigit.C;
import com.ravikiran.romannumbers.romandigit.D;
import com.ravikiran.romannumbers.romandigit.I;
import com.ravikiran.romannumbers.romandigit.L;
import com.ravikiran.romannumbers.romandigit.M;
import com.ravikiran.romannumbers.romandigit.RomanDigit;
import com.ravikiran.romannumbers.romandigit.V;
import com.ravikiran.romannumbers.romandigit.X;

public class RomanIndian {
	
	RomanIndian(String romanNumber ){
		buildRomanDigitsList(romanNumber);
		indianNumber= validateAndBuildIndian();
		this.romanNumber= romanNumber;
	}
	
	RomanIndian(Integer indianNumber ){
		
	}
	private String romanNumber =null;
	private Integer indianNumber = -1;
	private List<RomanDigit> romanDigits = new ArrayList<RomanDigit>();
	
	public String getRomanNumber() {
		return romanNumber;
	}

	public Integer getIndianNumber() {
		return indianNumber;
	}
	
	private void buildRomanDigitsList (String romanNumber) throws IllegalArgumentException{
		romanNumber = romanNumber.toUpperCase();
		CharacterIterator it = new StringCharacterIterator(romanNumber);
		char currChar;
		RomanDigit r;
		while (it.current()!=CharacterIterator.DONE) {
			currChar=it.current();
			switch (currChar) {
				case 'I':
					r = new I();
					romanDigits.add(r);
					break;
				case 'V':
					r = new V();
					romanDigits.add(r);
					break;
				case 'X':
					r = new X();
					romanDigits.add(r);
					break;
				case 'L':
					r = new L();
					romanDigits.add(r);
					break;
				case 'C':
					r = new C();
					romanDigits.add(r);
					break;
				case 'D':
					r = new D();
					romanDigits.add(r);
					break;
				case 'M':
					r = new M();
					romanDigits.add(r);
					break;
				default:
					throw new RomanException("A Roman Number can only contain characters I, V, X, L, C, D, M");
				
			}
			it.next();
		}
		
		
	}
	private Integer validateAndBuildIndian() throws IllegalArgumentException{
		//initialize position
		Position p = new Position(romanDigits.get(0).getPosition());
		int posDiff =0;
		Integer prevIndianValue=0;
		Integer indianValue= romanDigits.get(0).getValue();
		try {
			for(int i =1; i<romanDigits.size(); i++) {
				
				posDiff= romanDigits.get(i).getPosition().getValue()-romanDigits.get(i-1).getPosition().getValue();
			//	System.out.println(posDiff);
				if ((posDiff>1)||((posDiff ==1)&& (p.isFinal()||p.getPositionCounter()>1)))   {
					throw new RomanException();
				}
				if (posDiff ==1) {
					romanDigits.get(i).decrement(romanDigits.get(i-1));
					indianValue = prevIndianValue + romanDigits.get(i).getValue() ;
					prevIndianValue=indianValue;
					p.setFinal(true);
					p.setValue(romanDigits.get(i).getPosition().getValue());
				}
				if(posDiff==0) {
					
					if(romanDigits.get(i).getLetter()== romanDigits.get(i-1).getLetter()) {
						if (romanDigits.get(i).getLetter()=='M') {
							p.incrementPositionCounter(true);
						}
						else {
							p.incrementPositionCounter(false);
						}
		
							
					}
						
					indianValue+=romanDigits.get(i).getValue();
					prevIndianValue =indianValue;
					p.setFinal(romanDigits.get(i).getPosition().isFinal());
					p.setValue(romanDigits.get(i).getPosition().getValue());
				}
				
				if(posDiff<0) {
					if(!romanDigits.get(i).getPosition().isFinal()) {
						prevIndianValue=indianValue;
					}
					indianValue+=romanDigits.get(i).getValue();
					p.setFinal(romanDigits.get(i).getPosition().isFinal());
					
					p.setValue(romanDigits.get(i).getPosition().getValue());
				}
				
				
			}
		}catch (RomanException e) {
			throw new RomanException(e);
		}
		
		return indianValue;
		
	}
	
	
	
	
}
