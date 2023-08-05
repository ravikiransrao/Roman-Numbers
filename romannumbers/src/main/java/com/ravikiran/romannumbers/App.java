package com.ravikiran.romannumbers;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	InputStreamReader isr = new InputStreamReader(System.in);
        	BufferedReader br = new BufferedReader(isr);
        	System.out.print("Enter a Roman Number: ");
        	String romanNumber = br.readLine();
        	RomanIndian r = new RomanIndian(romanNumber);
        	System.out.format("The number you entered is: %s%n", r.getIndianNumber());
        	
        }catch( RomanException e) {
        	System.out.format("The string you entered could not be converted. The error is: %s%n", e.getMessage());
        }catch (IOException ioe) {
        	System.out.format("Some error occurred. The message is: %s%n", ioe.getMessage());
        }
    	

    }
}
