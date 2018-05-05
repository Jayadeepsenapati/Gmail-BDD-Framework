package testingjava;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int x=Integer.parseInt(sc.nextLine());
		for (int i=0;i<=x;i++)
		{
			
			System.out.println(i);
		}

	}

}
