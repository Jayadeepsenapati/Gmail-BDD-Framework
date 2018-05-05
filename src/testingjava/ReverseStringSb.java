package testingjava;

import java.util.Scanner;

public class ReverseStringSb {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		/*String y="";
		for (int i=x.length()-1;i>=0;i--)
		{
			char c=x.charAt(i);
			y=y+c;
		}
		System.out.println(y);*/
		StringBuffer sb=new StringBuffer(x);
		System.out.println(sb.reverse());
	}

}
