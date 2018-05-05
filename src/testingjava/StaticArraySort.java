package testingjava;

import java.util.Scanner;

public class StaticArraySort 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Number");
		int x[]=new int[5];
		for(int i=0;i<5;i++)
		{
			x[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(x[j]>x[j+1])
				{
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
	
		for(int i=0;i<5;i++)
		System.out.println(x[i]);
	}
}
