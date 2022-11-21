package com.somu.userDefinedException;

import java.io.IOException;

public class TooYoungException extends RuntimeException {
	
	public TooYoungException(String msg)
	{
		super(msg);
	}
}
	