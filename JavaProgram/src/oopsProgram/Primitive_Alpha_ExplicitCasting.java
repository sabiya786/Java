package oopsProgram;

public class Primitive_Alpha_ExplicitCasting 
{

	public void method()
	{
		int a=10;
		byte s=(byte)a;

		System.out.println(s);
	}

	public static void main(String []args)
	{
		Primitive_Alpha_ExplicitCasting obj = new Primitive_Alpha_ExplicitCasting();
		obj.method();
	}
}
