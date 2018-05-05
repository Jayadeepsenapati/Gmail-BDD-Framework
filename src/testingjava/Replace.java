package testingjava;

public class Replace 
{

	public static void main(String[] args) 
	{
		// Replace method is used to replace given sub string with other string in given string 
		String x="abcdefgh";
		String y="de";
		String z="55";
		String a=x.replace(y, z);
		System.out.println(a);
		
		//Substring method is used to get substring from given string
		String b="I Love my India";
		String c=b.substring(6);
		System.out.println(c);
		String d=b.substring(4, 12);
		System.out.println(d);
		
		//Replace Rs: and /- from given String i.e Rs:2345.990/-
		String e="Rs:2345.990/-";
		//String f=e.substring(3, 11);
		String f=e.substring(3, e.length()-2);
		System.out.println(f);
		
		//Concat Method is used to combine two strings
		String g="Odisha";
		String h="cuttack";
		String i=g.concat(h);
		System.out.println(i);
		
		//Contains Method is used to check the availability of substring in main string
		String j="mindq systems";
		String k="tem";
		if(j.contains(k))
		{
			System.out.println("Exists");
		}
		else
		{
			System.out.println("Does not Exists");
		}
		
		//trim method is used to remove Front-side spaces and back-side spaces
		String l="   mindq     ";
		String m=l.trim();
		System.out.println(m);
	// Compare to method is used to compare two strings chronological order. by character by character w.r.t ASCII
		String n="MindQ";
		String o="Mindq";
		int p=n.compareTo(o);
		System.out.println(p);
	}
		
}
