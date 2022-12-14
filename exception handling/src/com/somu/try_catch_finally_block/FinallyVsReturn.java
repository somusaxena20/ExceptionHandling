package com.somu.try_catch_finally_block;

public class FinallyVsReturn {
	public static void main(String[] args) {
		
//		CASE 1 : WHEN TRY BLOCK HAVEING RETURN STATEMENT THEN FIRST IT EXECUTE FINALLY BLOCK THEN RETURN
		
//		try {
//			System.out.println("try");
//			return;
//		}
//		catch(Exception e)
//		{
//			System.out.println("catch");
//		}
//		finally {
//			System.out.println("finally");
//		}
		
		System.out.println(method1());
	}

//	CASE 2 : WHICH VALUE SHOULD BE RETURN
	
	@SuppressWarnings("finally")
	private static int method1() {
		
		try {
			System.out.println("inside try block");
			return 100;
		}
		catch (Exception e) {
			System.out.println("inside catch block");
			return 200;
		}
		finally {
			System.out.println("inside finally block");
			return 300;
		}
		
	}
	

}
