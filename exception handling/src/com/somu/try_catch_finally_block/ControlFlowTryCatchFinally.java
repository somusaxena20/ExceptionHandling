package com.somu.try_catch_finally_block;

public class ControlFlowTryCatchFinally {
	
	public static void main(String[] args) {
		
//		CASE 1 : IF THERE IS NO EXCEPTION
		
//		try {
//			System.out.println("Statement 1");
//			System.out.println("Statement 2");
//			System.out.println("Statement 3");
//		} catch (ArithmeticException e) {
//			System.out.println("Statement 4");
//		}
//		finally {
//			System.out.println("Statement 5");
//		}
//		System.out.println("Statement 6");
		
//		CASE 2 : IF THERE IS EXCEPTION AT STATEMENT 2 & CAUGHT
		
//		try {
//			System.out.println("Statement 1");
//			System.out.println(10/0);
//			System.out.println("Statement 2");
//			System.out.println("Statement 3");
//		} catch (ArithmeticException e) {
//			System.out.println("Statement 4");
//		}
//		finally {
//			System.out.println("Statement 5");
//		}
//		System.out.println("Statement 6");
		
//		CASE 3 : IF THERE IS EXCEPTION AT STATEMENT 2 & NOT CAUGHT
		
//		try {
//			System.out.println("Statement 1");
//			System.out.println(10/0);
//			System.out.println("Statement 2");
//			System.out.println("Statement 3");
//		} catch (NullPointerException e) {
//			System.out.println("Statement 4");
//		}
//		finally {
//			System.out.println("Statement 5");
//		}
//		System.out.println("Statement 6");
		
//		CASE 4 : IF THERE IS EXCEPTION AT STATEMENT 4
		
//		try {
//			System.out.println(10/0);
//			System.out.println("Statement 1");
//			System.out.println("Statement 2");
//			System.out.println("Statement 3");
//		} catch (ArithmeticException e) {
//			System.out.println(10/0);
//			System.out.println("Statement 4");
//		}
//		finally {
//			System.out.println("Statement 5");
//		}
//		System.out.println("Statement 6");
		
//		CASE 5 : IF THERE IS EXCEPTION AT STATEMENT 5
		
		try {
//			System.out.println(10/0);
			System.out.println("Statement 1");
			System.out.println("Statement 2");
			System.out.println("Statement 3");
		} catch (ArithmeticException e) {
//			System.out.println(10/0);
			System.out.println("Statement 4");
		}
		finally {
			System.out.println(10/0);
			System.out.println("Statement 5");
		}
		System.out.println("Statement 6");
		
		
	}
}
