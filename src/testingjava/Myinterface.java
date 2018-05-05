package testingjava;

public interface Myinterface 
{
public int addition(int x,int y);
public int substract(int x,int y);
public int multiply(int x,int y);
public int divide(int x,int y);
// The above interface having 4 method declarations

//Concrete Class
public class Class4 implements Myinterface
{
	public int addition(int x,int y)
	{
		int z;
		z=x+y;
		return(z);
	}
	public int substract(int x,int y)
	{
		int z;
		z=x-y;
		return(z);
	}
	public int multiply(int x,int y)
	{
		int z;
		z=x*y;
		return(z);
	}
	public int divide(int x,int y)
	{
		int z;
		z=x/y;
		return(z);
	}
	public long square(int x)
	{
		int z;
		z=x*x;
		return(z);
	}
	// From above code Class4 is concrete class to Myinterface and one extra method square()
	
}
}