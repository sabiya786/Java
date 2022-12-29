package oopsProgram;

public class HierachicalInheritance_Subclass_A extends HierachicalInheritance_Superclass 
{
	public void method1()
	{
		System.out.println("to java programming language");
	}

	public static void main(String []args)
	{
		HierachicalInheritance_Subclass_A obj = new HierachicalInheritance_Subclass_A();
		obj.method();
		obj.method1();
	}
}
