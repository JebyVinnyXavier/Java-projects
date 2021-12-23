package com.mars.returnship;

import java.util.Scanner;

public class MarsClass {
	
	public static void main(String[] args) {
		
		//System.out.println("Hello World");
		
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);//create object for scanner
		int number=sc.nextInt();
		
		int count=1;//number of trials
		
		final int LUCKYNUMBER= 8;
		while (true) {
			if( number==LUCKYNUMBER){
				System.out.println("You guessed it right");
				break;
				
			}
			System.out.println("Enter another number");
			number=sc.nextInt();
			count++;
		}
		
		
	}

}
