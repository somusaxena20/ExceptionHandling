package com.somu.throwKeyword;

import java.io.FileNotFoundException;

public class Case1 {
	
//	static ArithmeticException e = new ArithmeticException(); // THROW ARITHMETIC EXCEPTION
	
	static ArithmeticException e;  // NULL POINTER EXCEPTION BECUASE BY DEFAULT VALUE FOR OBJECT IS NULL SET B JVM
	
	public static void main(String[] args) {
		
		throw new ArithmeticException();
	}
}
