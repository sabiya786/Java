package oopsProgram;

public class Primitive_Alpha_ImplicitCasting
{
	public void method()
	{
		int a=10;
		long l = a;
		System.out.println(l);
	}


	public static void main(String []args)
	{
		Primitive_Alpha_ImplicitCasting obj = new Primitive_Alpha_ImplicitCasting();
		obj.method();
	}
}
