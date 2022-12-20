package javaPracticeProgram;

public class MethodCallingWithinClass 
{
	public void method()
	{
		System.out.println("hello");
	}
	
	public static void method1()
	{
		System.out.println("welcome");
	}
	
	public static void main(String []args)
	{
		MethodCallingWithinClass obj = new MethodCallingWithinClass();
		obj.method();
		
		method1();
	}

}
