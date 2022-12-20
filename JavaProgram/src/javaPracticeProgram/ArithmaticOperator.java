package javaPracticeProgram;

public class ArithmaticOperator 
{
	public void method()
	{
		int a=10,b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

	
	public static void main(String []args)
	{
		ArithmaticOperator obj = new ArithmaticOperator();
		obj.method();
	}
}
