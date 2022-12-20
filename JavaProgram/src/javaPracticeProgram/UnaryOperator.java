package javaPracticeProgram;

public class UnaryOperator 
{
	public void method()
	{
		int a=10;

		System.out.println(a++);
		System.out.println(a--);
		System.out.println(++a);
		System.out.println(--a);
		System.out.println(-a);
		System.out.println(+a);
		System.out.println(~a);
		boolean b = 20>30;
		System.out.println(!b);
	}

	public static void main(String []args)
	{
		UnaryOperator obj = new UnaryOperator();
		obj.method();
	}
}
