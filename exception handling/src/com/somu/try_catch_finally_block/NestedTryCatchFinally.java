package com.somu.try_catch_finally_block;

public class NestedTryCatchFinally {
	public static void main(String[] args) {
		
//		CASE 1 : WHEN EXCEPTION OCCURE AT INNER TRY BLOCK & CAUGHT
		
//		try {
////			RISKY CODE
//			System.out.println("outer try block");
//			try {
//				System.out.println("inner try block");
//				System.out.println(10/0);
//			}
//			catch (ArithmeticException e) {
//				System.out.println("inner catch block");
//			}
//			finally {
//				System.out.println("inner finally block");
//			}
//		} catch (Exception e) {
//			System.out.println("outer catch block");
//		}
//		finally {
//			System.out.println("outer finally block");
//		}
		
//		CASE 2 : WHEN EXCEPTION RAISED AT INNER TRY BLOCK NOT CAUGHT
		
		try {
//			RISKY CODE
			System.out.println("outer try block");
			try {
//				MORE RISKY CODE
				System.out.println("inner try block");
				System.out.println(10/0);
			}
			catch (NullPointerException e) {
				System.out.println("inner catch block");
			}
			finally {
				System.out.println("inner finally block");
			}
		} catch (Exception e) {
			System.out.println("outer catch block");
		}
		finally {
			System.out.println("outer finally block");
		}
	}
}
