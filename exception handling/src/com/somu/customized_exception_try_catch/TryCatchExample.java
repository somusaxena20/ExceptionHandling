package com.somu.customized_exception_try_catch;

public class TryCatchExample {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("YOU HAVE TO DELETE WITH NON-ZERO NUMBER");
		}
		
	}
}
