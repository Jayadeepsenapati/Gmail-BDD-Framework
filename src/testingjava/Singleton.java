package testingjava;

public class Singleton 
{
//Data Members
	public int x;
	//Methods
	private Singleton() // Private Constructor
	{
		x=10;
	}
	public static Singleton method1() //Static Method return Object
	{
		Singleton obj=new Singleton();
		return(obj);
	}
	public void method2() //Non-Static Method
	{
		System.out.println("I Am from Singleton Class");
	}
	
}
