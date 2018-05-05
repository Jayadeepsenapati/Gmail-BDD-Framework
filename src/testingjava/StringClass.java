package testingjava;

public class StringClass 
{

	public static void main(String[] args)
	{
		//length Method is used to find number of Charactors in given in String
		String x="testing class";
		System.out.println(x.length());
		
		//charAt Method To get charactor from given position
		String y="Chhak de India";
		System.out.println(y.charAt(3));
		
		// indexOf Method is used to get position number of given charactor/string in given string
		String z="Chhak de India";
		System.out.println(z.indexOf("a"));
		
		//split method is used to divide a string into two multiple sub-strings
		String a="Chhak de India";
		String[] b=a.split(" ");
		System.out.println("No. of Words is "+b.length);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
