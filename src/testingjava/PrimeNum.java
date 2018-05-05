package testingjava;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int x=Integer.parseInt(sc.nextLine());
		int flag=0;
		for(int i=2;i<=x;i++)
		{
			if(x%i==0)
			{
				flag=1;
			}
		}
			if(flag==0)
			{
				System.out.println("Number is Prime");
			}
			else
			{
				System.out.println("Number is Not Prime");
			}
		}

	}

