package com.cg.doctor.exception;

/** This class is to list error details 
 * 
 * @author Amrutha and Sandhya
 *
 */
public class ErrorDetails {
	
	private String message;
	

	public ErrorDetails( String message) {
		super();
		
		this.message = message;
	
	}
  
	
	public String getMessage() {
		return message;
	}

}