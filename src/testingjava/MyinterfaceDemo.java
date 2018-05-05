package testingjava;

import testingjava.Myinterface.Class4;

public class MyinterfaceDemo 
{

	public static void main(String[] args) 
	{
	//call method using Object of interface
	Myinterface obj1=new Class4();
	int r1=obj1.addition(10, 50);
	System.out.println(r1);
	int r2=obj1.multiply(50, 50);
	System.out.println(r2);
// call methods using Object of Concrete Class
	Class4 obj2=new Class4();
	int r3=obj2.addition(10,40);
	System.out.println(r3);
	long r4=obj2.square(10);
	System.out.println(r4);
	}

}
