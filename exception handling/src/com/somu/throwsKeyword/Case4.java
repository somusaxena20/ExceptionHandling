package com.somu.throwsKeyword;

import java.io.IOException;
import java.io.PrintWriter;

public class Case4 {
	public static void main(String[] args) {

//		GUESS IT COMPILE OR NOT

//		1 : IT IS UNCHECKED EXCEPTION SO PROGRAM COMPILE FINE

		try {

		} catch (ArithmeticException e) {

		}

//		2 : IT IS PARTIALLY CHECKED EXCEPTION SO IT ALSO COMPILE

		try {

		} catch (Exception e) {

		}

//		3 : IF YOU DID'NT WRITE THAT CODE WHOES THROWING IOEXCETION OR IT'S CHILD EXCEPTION SO IT WILL GIVE YOU AN ERROR TRY BLOCK NEVER THROW IOEXCEPTION

//		NOTE : THIS ONLY APPLICABLE FOR FULLY CHECKED EXCEPTION
		try {
			PrintWriter pw = new PrintWriter("abc.txt");

		} catch (IOException e) {

		}

//		4 : IT IS FULLY CHECKED EXCEPTION SO CODE WON'T COMPILE

//		try {
//			
//		} catch (InterruptedException e) {
//
//		}
		
		
	}
}
