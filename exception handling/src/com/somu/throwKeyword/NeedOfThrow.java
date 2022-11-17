package com.somu.throwKeyword;

public class NeedOfThrow {
	
	public static void main(String[] args) {
		
//		NEED OF THROW : TO HANDOVER USER DEFINED EXCEPTION TO JVM THAT'S WHY WE NEED THROW KEYWORD
		
		
//		EXAMPLE WITHOUT THROW
		
//		methodWithoutThrow();
		
//		EXAMPLE WITH THROW	
		
		methodWithThrow();
		
	}

	private static void methodWithoutThrow() {
		System.out.println(10/0);
	}

	private static void methodWithThrow() {
		throw new ArithmeticException("/ by zero by somu");
	}
	
	
	
	
}
