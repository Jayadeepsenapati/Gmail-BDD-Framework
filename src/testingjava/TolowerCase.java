package testingjava;

public class TolowerCase 
{

	public static void main(String[] args) 
	{
		//to Lower Case convert the string into Lower Case
		String x="i LovE my iNDia";
		String y=x.toLowerCase();
		System.out.println(y);
		
		//to Upper Case Convert the String to Upper Case
		String a="i love MY india";
		String b=a.toUpperCase();
		System.out.println(b);
		
		//Equals method to compare two strings by considering case
		String c="i LovE my iNDia";
		String d="i love MY india";
		if(x.equals(d))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Not Same");
		}
		//Equals to Ignore Case method to compare two strings without Considering Case
		String e="i LovE my iNDia";
		String f="i love MY india";
		if(e.equalsIgnoreCase(f))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}

}
