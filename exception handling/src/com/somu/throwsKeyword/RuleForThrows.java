package com.somu.throwsKeyword;

public class RuleForThrows {
	public static void main(String[] args)throws InterruptedException {

//		NOTE : THIS WAY YOU GET AN ERROR BECAUSE YOU HAVE TO DECLARE FROM THROWING METHOD NEED TO BE DECLARE AS THROWN OR SRROUND WITH TRY AND CATCH

		doStuff();
		
		
	}
	private static void doStuff()throws InterruptedException {
		doMoreStuff();

	}
	private static void doMoreStuff()throws InterruptedException {
		Thread.sleep(1000);
	}
}
