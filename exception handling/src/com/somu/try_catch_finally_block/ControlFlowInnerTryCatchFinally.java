package com.somu.try_catch_finally_block;

public class ControlFlowInnerTryCatchFinally {
	public static void main(String[] args) {

//		CASE 1 : IF NO EXCEPTION
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (Exception e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
		
//		CASE 2 : IF EXCEPTION AT STATE 2 & CAUGHT
		
		try {
			System.out.println("statement 1");
			System.out.println(10/0);
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (ArithmeticException e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
		
//		CASE 3 : IF EXCEPTION AT STATE 2 & NOT CAUGHT
		
		try {
			System.out.println("statement 1");
			System.out.println(10/0);
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (NullPointerException e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
		
//		CASE 4 : IF EXCEPTION AT STATE 5 & CAUGHT
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println(10/0);
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (Exception e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
//		CASE : 5 IF EXCEPTIONN AT STATE 5 AND NOT CAUGHT BY INNER BUT CAUGHT BY OUTER
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println(10/0);
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (NullPointerException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (ArithmeticException e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
		
//		CASE 6 : IF EXCEPTION AT STATE 5c & NOT CAUGHT BY INNER & OUTER
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println(10/0);
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (NullPointerException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (ClassCastException e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
		
//		CASE 7 : IF EXCEPTION AT STATE 7 & CAUGHT
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println(10/0);
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (Exception e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
		
//		CASE : 8 IF EXCEPTION AT STATE 7 & NOT CAUGHT
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println(10/0);
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (NullPointerException e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
//		CASE : 9 IF EXCEPTION AT STATE 8 & CAUGHT
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println(10/0);
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (Exception e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
//		CASE : 10 IF EXCEPTION AT STATE 8 & NOT CAUGHT
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println(10/0);
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (ClassCastException e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
//		CASE : 11 EXCEPTION AT 9 & CAUGHT
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			System.out.println(10/0);
			System.out.println("statement 9");
			
		} catch (Exception e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
		
//		CASE : 12 EXCEPTION AT 9 & NOT CAUGHT
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			System.out.println(10/0);
			System.out.println("statement 9");
			
		} catch (ClassCastException e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
//		CASE : 13 EXCEPTION AT STATE 10
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (Exception e) {
			System.out.println(10/0);
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		
		System.out.println("statement 12");
		
//		CASE : 14 EXCEPTION AT STATE 11 & STATE 12
		
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			try {
				System.out.println("statement 4");
				System.out.println("statement 5");
				System.out.println("statement 6");
			} catch (ArithmeticException e) {
				System.out.println("statement 7");
			} finally {
				System.out.println("statement 8");
			}
			
			System.out.println("statement 9");
			
		} catch (Exception e) {
			System.out.println("statement 10");
		} finally {
			System.out.println("statement 11");
		}
		System.out.println(10/0);
		System.out.println("statement 12");
		
	}
}
