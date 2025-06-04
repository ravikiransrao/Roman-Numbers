package com.ravikiran.romannumbers2;

import java.util.HashMap;
import java.util.Map;


public class RomanIndian {
	
    private String romanNumber = "";
    private Integer indianNumber = 0;
    private String errorMessage = "";
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
                if (romanNumber == null) {
                        this.errorMessage = "This is not a valid Roman Number";
                        return;
                }

                romanNumber = romanNumber.toUpperCase();

                if (!romanNumber.matches("^[IVXLCDM]+$")) {
                        this.errorMessage = "A Roman Number can only contain characters I, V, X, L, C, D, M";
                        return;
                }

                String validRegex = "^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
                if (!romanNumber.matches(validRegex)) {
                        this.errorMessage = "This is not a valid Roman Number";
                        return;
                }

                this.indianNumber = romanToInt(romanNumber);
                this.romanNumber = romanNumber;
        }

        public RomanIndian(Integer indianNumber) {
                if (indianNumber != null) {
                        this.indianNumber = indianNumber;
                }
        }

        private int romanToInt(String roman) {
                Map<Character, Integer> values = new HashMap<Character, Integer>();
                values.put('I', 1);
                values.put('V', 5);
                values.put('X', 10);
                values.put('L', 50);
                values.put('C', 100);
                values.put('D', 500);
                values.put('M', 1000);

                int total = 0;
                int prev = 0;
                for (int i = roman.length() - 1; i >= 0; i--) {
                        int value = values.get(roman.charAt(i));
                        if (value < prev) {
                                total -= value;
                        } else {
                                total += value;
                                prev = value;
                        }
                }
                return total;
        }
	

}
