package com.somu.throwKeyword;

//1st

//O/P : CE : EXCPTION MUST BE A SUBCLASS OF THROWABLE

//public class Case3 {
//	public static void main(String[] args) {
//		throw new Case3();
//	}
//}

//2nd

//O/P : RE : THROW CASE3 EXCEPTION
public class Case3 extends RuntimeException{
	public static void main(String[] args) {
		throw new Case3();
	}
}