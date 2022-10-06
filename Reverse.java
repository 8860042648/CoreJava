package corejava;

import java.util.Scanner;

public class Reverse 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		//create the object of scanner to take input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to reverse");
		int n,reverse=0;
		n=sc.nextInt();
		//using while loop
		while(n!=0)
		{
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
			//create the concatenate for reverse
			System.out.println("reverse of entered number is"+reverse);
			
		}
		
		
	}
	

}
