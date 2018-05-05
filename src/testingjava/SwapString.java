package testingjava;

public class SwapString {

	public static void main(String[] args) 
	{
		String a="Hello";
		String b="World";
		System.out.println("Original String value:"+a+"  "+b);
		a=a+b;
		
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After Swap String value:"+a+"  "+b);
	}

}
