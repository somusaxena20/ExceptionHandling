package com.somu.try_catch_finally_block;

public class FinallyVsSystemExit {

	public static void main(String[] args) {
		
//		NOTE : THIS IS A ONLY CASE WHEN FINALLY BLOCK WON'T BE EXECUTED
		
		try {
			System.out.println("try");
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
		}

	}

}
