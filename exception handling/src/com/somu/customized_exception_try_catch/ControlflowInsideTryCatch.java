package com.somu.customized_exception_try_catch;

public class ControlflowInsideTryCatch {
	public static void main(String[] args) {
		
//		CASE 1 : IF NO EXCEPTION OCCURE 
//		O/P : 1 2 3 5 NT
		
//		CASE 2 : IF AN EXCEPTIONN OCCURE AT STATE 2 & CORRESPONDING CATCH BLOCK MATCHED
//		O/P : 1 4 5 NT
		
//		CASE 3 : IF AN EXCEPTIONN OCCURE AT STATE 2 & CORRESPONDING CATCH BLOCK NOT MATCHED
//		O/P : 1 AT
		
//		CASE 4 : IF EXCEPTION RAISED AT STATE 4 & STATE 5
//		O/P : AT
		try {
			System.out.println("Statement 1");
//			System.out.println(10/0);
			System.out.println("Statement 2");
//			System.out.println(10/0);
			System.out.println("Statement 3");
//			System.out.println(10/0);
		} catch (NullPointerException e) {
			System.out.println("Statement 4");
//			System.out.println(10/0);
		}
		System.out.println("Statement 5");
		System.out.println("NORMAL TERMINATION");
	}
}
