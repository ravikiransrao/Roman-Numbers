package com.ravikiran.romannumbers2;

import java.io.*;

import com.ravikiran.romannumbers2.RomanIndian;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	String romanNumber="";
        
        	do {
    	
    			InputStreamReader isr = new InputStreamReader(System.in);
            	BufferedReader br = new BufferedReader(isr);
            	System.out.print("Enter a Roman Number. Type \"quit\" to exit: ");
            	romanNumber = br.readLine();
            	if(!romanNumber.equalsIgnoreCase("quit")) {
            		//RomanIndian r = new RomanIndian(romanNumber);
                	RomanIndian r = new RomanIndian (romanNumber);
            		if(r.getErrorMessage() == "") {
            			System.out.format("The number you entered is: %s%n", r.getIndianNumber());
            		}else {
            			System.out.format("There is an error: %s%n", r.getErrorMessage());
            		}
            	}
    		
    		
        	}
        	while(!romanNumber.equalsIgnoreCase("quit"));
        	
        	
        }catch (IOException ioe) {
        	System.out.format("Some error occurred. The message is: %s%n", ioe.getMessage());
        }
    	

    }
}
