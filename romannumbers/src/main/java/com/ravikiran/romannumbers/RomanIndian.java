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
		
		
	}
	
	RomanIndian(Integer indianNumber ){
		
	}
	private String romanNumber =null;
	private Integer indianNumber = -1;
	private List<RomanDigit> romanDigits = new ArrayList<RomanDigit>();
	
	public String getRomanNumber() {
		return romanNumber;
	}

	private Integer getIndianNumber() {
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
					throw new IllegalArgumentException("A Roman Number can only contain characters I, V, X, L, C, D, M");
				
				
				
			
			}
			
		}
		
		
	}
	private void validateAndBuildIndian() throws IllegalArgumentException{
		boolean initialize=true;
		for(RomanDigit romanDigit : romanDigits) {
			
			
		}
		
	}
	
	
}
