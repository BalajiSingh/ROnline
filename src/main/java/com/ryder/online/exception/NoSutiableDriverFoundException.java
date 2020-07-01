package com.ryder.online.exception;

/**
 * @author Madhu Golla
 *
 *02/05/2K19
 *
 */

public class NoSutiableDriverFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public NoSutiableDriverFoundException(String message) {
		super(message);
	}
	
	public NoSutiableDriverFoundException(){
		this("");
	}

}
