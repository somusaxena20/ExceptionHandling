package com.somu.userDefinedException;

import java.util.Scanner;

public class UserDefinedException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		if (age > 60) {
			throw new TooYoungException("YOU ARE TOO OLD...");
		} else if(age < 18){
			throw new TooOldException("YOU ARE TOO YOUNG...");
		}
		else {
			System.out.println("THANKS FOR REGISTERING...");
		}
		
	}
}
