package com.ravikiran.romannumbers2;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;

import com.ravikiran.romannumbers.romandigit2.*;

public class RomanIndian {
	
	private String romanNumber = "";
	private Integer indianNumber = 0;
	private String errorMessage = "";
	private List<RomanDigit> romanDigits = new ArrayList<RomanDigit>();
	public String getRomanNumber() {
		return romanNumber;
	}
	public Integer getIndianNumber() {
		return indianNumber;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public RomanIndian(String romanNumber) {
		try {
			buildRomanDigitsList(romanNumber);
			validateAndBuildIndian();
			if(this.errorMessage=="") {
				this.romanNumber= romanNumber;
			}
			
		}catch (RomanException e){
			this.errorMessage = e.getMessage();
		}
	}
	public RomanIndian(Integer indianNumber) {
		
	}
	private void buildRomanDigitsList (String romanNumber) throws IllegalArgumentException{
		romanNumber = romanNumber.toUpperCase();
		//CharacterIterator it = new StringCharacterIterator(romanNumber);
		char[] ch = romanNumber.toCharArray();
		char currChar;
		RomanDigit r;
		
		for (int i = 0;i<ch.length;i++) {
			
			//currChar=it.current();
			currChar = ch[i];
			
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
			
			
			//System.out.println("Hi: " + it.current());
		}
		
		
	}
	
	private void validateAndBuildIndian() {
		//Integer indianNumber = 0;
		try {
		
			RomanDigitCursor c= new RomanDigitCursor(romanDigits.get(0));
			for (int i = 1; i< romanDigits.size();i++) {
				c.UpdateCursor(romanDigits.get(i));
			}
			
			this.indianNumber= c.getIndianValue();
		}catch (RomanException e) {
			
			
			this.indianNumber = 0;
			this.errorMessage= e.getMessage();
		}
		
		
	}
	

}
