package testingjava;

public class Wrapper 
{

	public static void main(String[] args) 
	{
		Integer i=new Integer(10);
		Float f=new Float(30.33);
		//Double d=new Double(i*f);
		Double d=new Double(i.intValue()*f.floatValue());
		System.out.println(d.doubleValue());

	}

}
