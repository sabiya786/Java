package oopsProgram;

public class Implementationclass implements InterfaceProgram
{

	
	public void method() 
	{
		System.out.println("hello");
	}

	
	public void method1() 
	{
		System.out.println("welcome");
	}
	

	public static void main(String []args)
	{
		Implementationclass obj = new Implementationclass();
		obj.method();
		obj.method1();
		obj.method3();
		InterfaceProgram.method4();
	}
}
