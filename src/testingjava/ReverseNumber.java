package testingjava;

import java.util.Scanner;

public class ReverseNumber {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int x=Integer.parseInt(sc.nextLine());
		int y=0;
		while(x!=0)
		{
			int d=x%10;
			y=y*10+d;
			x=(int)x/10;
		}
		System.out.println(y);
	}

}
