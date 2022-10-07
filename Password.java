package corejava;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
	//string input
		String username;
		//integer password
		int Password;
		//create the scanner object to take input from the user
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the username:");//to get the user name
		username=sc.nextLine();
		System.out.print("Enter password:");//to get the password
		Password=sc.nextInt();
		System.out.println("password");
		{
			if(Password==12345)//Condition for check the correct password
			{
				System.out.println(username+ "login successful:");//print password successful
			}	
			else
			{
				System.out.println(username+ "login denied:");
			}
		
		}
		
		
		

	}

}

