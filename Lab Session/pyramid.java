

import java.util.Scanner;
//create a class pyramid
public class pyramid
{
	public static void main(String args[])
	{
		//create an object of scanner to take input from the user
		Scanner sc=new Scanner(System.in);
		//using for loop
		for(int i=5;i<=0;i--)
		{
			for(int j=5-i;j>=1;j--)
			{
				System.out.print(" ");
				{
					for(int k=1; k<=2*i-1;k++)
					{
						System.out.print("*");
					}
					// To move the cursor to new line
					System.out.println();
				}
			}
		}
	}
	

}
