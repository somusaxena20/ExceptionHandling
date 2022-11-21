package com.somu.userDefinedException;

public class TooOldException extends RuntimeException {
	
	public TooOldException(String msg)
	{
		super(msg);
	}
}
