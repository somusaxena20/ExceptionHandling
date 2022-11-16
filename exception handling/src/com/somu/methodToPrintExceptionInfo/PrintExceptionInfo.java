package com.somu.methodToPrintExceptionInfo;

public class PrintExceptionInfo {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			
//			e.printStackTrace(); // FULL STACK TRACE
			
//			System.out.println(e); 
//			
			System.out.println(e.toString()); 
			
			System.out.println(e.getMessage());
		}
		System.out.println("NORMAL TERMINATION");
	}
}
