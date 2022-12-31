package oopsProgram;

public class ConcreteClass extends AbstarctClass
{


	public void method() 
	{
		System.out.println("Hello");
	}


	public void method1() 
	{
		System.out.println("welcome");
	}


	public static void main(String []args)
	{
		ConcreteClass obj = new ConcreteClass();
		obj.method();
		obj.method1();
	}


}
