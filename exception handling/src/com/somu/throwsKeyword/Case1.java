package com.somu.throwsKeyword;


//WE CANNOT USE THROWS KEYWORD WITH CLASS
class Test //throws Exception
{
//	WE CAN USE THROWS KEYWORD WITH CONSTRUCTOR
	public Test()throws Exception {
		
	}
//	WE CAN USE THROWS KEYWORD WITH METHOD
	public void m1()throws Exception {
		
	}
}

public class Case1 {
	public static void main(String[] args) {
		
//		THROWS CONSTRUCTOR YOU HAVE TO HANDLE EXCEPTION AT CREATING TIME OF OBJECT 
		try {
			Test t = new Test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
