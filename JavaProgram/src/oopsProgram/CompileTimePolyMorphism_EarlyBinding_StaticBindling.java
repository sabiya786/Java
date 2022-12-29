package oopsProgram;

public class CompileTimePolyMorphism_EarlyBinding_StaticBindling 
{
	public void method(int a)
	{
		System.out.println(a);
	}

	public void method(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String []args)
	{
		CompileTimePolyMorphism_EarlyBinding_StaticBindling obj = new CompileTimePolyMorphism_EarlyBinding_StaticBindling();
		obj.method(10);
		obj.method(10, 20);
	}

}
