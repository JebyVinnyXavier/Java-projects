package com.mars.returnship;
import java.util.Scanner;

public class ElectricityBill {
	
		
		public static void main(String[] args) 
		{
		
			double cost=0;
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" Please Enter the Units that you Consumed  : ");
			int Units = sc.nextInt();
	  
		  	if (Units < 200)
		  	{
		        cost = 50;
		  		 	
		  	} 
		  	 else if (201< Units && Units <= 500) 
		  	{
		  		
		  		 cost = (200 * 50) + (Units - 200) * 1.25;	
		  	}
		  	else if (501<Units && Units <=1000)
		  	{
		  		cost=(200*50)+(200*1.25)+(Units-500)*1;
		  	}
		  	else if(Units>1001)
		  	{
		  		cost=(200*50)+(200*1.25)+(200*1)+(Units-1001)*0.75;
			}
			
			
			System.out.println("total cost: " +cost );
		}


	}

