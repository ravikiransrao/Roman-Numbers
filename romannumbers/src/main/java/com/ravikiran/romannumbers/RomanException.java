package com.ravikiran.romannumbers;

public class RomanException extends IllegalArgumentException {

	public RomanException() {
		super("This is not a valid Roman Number");
	}

	protected RomanException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	protected RomanException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	protected RomanException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
}
