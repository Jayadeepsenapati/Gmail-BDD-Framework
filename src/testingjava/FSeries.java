package testingjava;

import java.util.Scanner;

public class FSeries 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int x=Integer.parseInt(sc.nextLine());
		int a=0;
		int b=1;
		System.out.println(a+" "+b);
		int c=a+b;
		do
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}while(c<=x);
		
	}

}
