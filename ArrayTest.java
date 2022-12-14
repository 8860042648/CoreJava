package Array;

import java.util.Scanner;

public class ArrayTest {
		public static void main(String[] args)
		{
			//create Scanner class object to take input from the user
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			//read the size of array
			System.out.println("Enter the size of the array:");
			int n =sc.nextInt();
			//create an integer array of size N
			int numbers[]=new int[n];
			//take input for the array
			System.out.println("Enter the array elements:");
			//using for loop
			for(int i=0;i<=n;i++)
			{
				numbers[i]=sc.nextInt();
			}
			//calculate the sum of positive numbers
			int sum = positiveSum(numbers);
			//display result
			System.out.println("Sum of positive numbers = "+sum);
		}
			public static int positiveSum(int[] numbers) 
			{
				//declare variable
				int sum=0;
				{
				//traverse through the array
				for(int i:numbers) 
				{
					if(i>=0)sum+=i;
				}
				return sum;
			}
			
					
		
		

	}


}
