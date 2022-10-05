package com.java;
import java.util.Scanner;

/* Program: Find the largest number.
 *  
 *  @author:-Pooja Gautam
 *  @date:-01-10-2022
 */

//  create  main  class

class LargestNumber {
	public static void main(String[] args) 
	{
		
		// scanner object.
		
		Scanner sc=new Scanner(System.in);
		
		// Take input from the user.
		
		System.out.println("  first number.");
		int num1=sc.nextInt();
		
		System.out.println(" second number.");
		int num2=sc.nextInt();
		
		//  condition for Largest number.
		
		if(num1>num2)
		{
		  System.out.println("Largest number is  "+ num1);
		}
		else
		{
		  System.out.println("Largest number is  "+ num2);	
		}
	}
	

}

