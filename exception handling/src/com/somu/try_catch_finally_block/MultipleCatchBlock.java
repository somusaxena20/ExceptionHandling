package com.somu.try_catch_finally_block;

public class MultipleCatchBlock {
	
	public static void main(String[] args) {
		
//		HOW WE CAN RIGHT TRY WITH MULTIPLE CATCH BLOCK
		
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		
//		NOTE : THE ORDER OR CATCH BLOCK MATTERS IN MULTIPLE CATCH BLOCK IT SHOULD GOES FROM CHILD TO PARENT
		
		
//		try {
//			System.out.println(10/0);
//		} catch (Exception e) {
//			System.out.println("Arithmetic Exception");
//		}
//		THIS BLOCK GIVE AN ERROR
//		catch (ArithmeticException e) {
//			System.out.println("Exception");
//		}
		
	}
}
