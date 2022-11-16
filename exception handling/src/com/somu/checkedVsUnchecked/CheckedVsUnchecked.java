package com.somu.checkedVsUnchecked;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckedVsUnchecked {
	public static void main(String[] args)throws Exception{
		
//		EXAMPLE OF CHECKED EXCEPTION : FileNotFoundException
		
		PrintWriter pw=null;
		try {
			pw = new PrintWriter("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("Hello");
		
//		IntruptedException
		
		Thread.sleep(1000);
		
	}
}
