package testingjava;

import java.util.Scanner;

public class FibonasiSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Limit");
		int l=Integer.parseInt(sc.nextLine());
		int x=0;
		int y=1;
		System.out.println("Value of x="+x+" Value of y="+y);
		int z=x+y;
		do
		{
			System.out.println(z+" ");
			x=y;
			y=z;
			z=x+y;
		}while(z<=l);

	}

}
