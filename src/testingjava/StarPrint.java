package testingjava;

import java.util.Scanner;

public class StarPrint 
{


	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int x=Integer.parseInt(sc.nextLine());
	for(int i=0;i<=x;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
