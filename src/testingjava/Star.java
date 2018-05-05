package testingjava;

import java.util.Scanner;

public class Star {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Limit");
		int l=Integer.parseInt(sc.nextLine());
		for (int i=1;i<=l;i++)
		{
			for (int j=1;j<=l-i;j++)
			{
				System.out.print("");//Blank Space
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for (int m=l;m<=i;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
