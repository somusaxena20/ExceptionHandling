package com.somu.try_catch_finally_block;

public class FinallyBlock {
	public static void main(String[] args) {
		
//		CASE 1 : IF THERE IS NO EXCEPTION
		
//		try {
//			System.out.println("try");
//		} catch (Exception e) {
//			System.out.println("catch");
//		}
//		finally {
//			System.out.println("finally");
//		}
		
//		CASE 2 : IF THERE IS EXCEPTION
		
//		try {
//			System.out.println("try");
//			System.out.println(10/0);
//		} catch (ArithmeticException e) {
//			System.out.println("catch");
//		}
//		finally {
//			System.out.println("finally");
//		}
		
//		CASE 3 : IF THERE IS EXCEPTION RAISED BUT NOT HANDLE
		
		try {
			System.out.println("try");
			System.out.println(10/0);
		} catch (NullPointerException e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
		}
//		AFTER FINALLY NOT A SINGLE STATEMENT GONNA EXECUTE IF TERMINATION IS ABNORMAL
		System.out.println("after finally");
		
	}
}
