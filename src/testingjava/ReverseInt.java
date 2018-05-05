package testingjava;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Number");
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