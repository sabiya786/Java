package javaPracticeProgram;

public class ParameterizeMethod 
{
	public void method(int a)
	{
		System.out.println(a);
	}
	
	public static void method1(int b)
	{
		System.out.println(b);
	}
	
	public static void main(String []args)
	{
		ParameterizeMethod obj = new ParameterizeMethod();
		obj.method(10);
		
		method1(100);
	}

}
