package corejava;

import java.util.Scanner;

public class leapyear
{
	@SuppressWarnings("null")
	public static void main(String args[])
	{
		int year;
		System.out.println("Enter the year:");
		year=.nextInt();
		//create the object of scanner to take input from the user
		Scanner sc=new Scanner(System.in);
		//using if else condition
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
			System.out.println( year+"is a leap year");
		else
			System.out.println(year+"is not aleap year");
	}
}
