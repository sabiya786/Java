package oopsProgram;

public class HierachicalInheritance_Subclass_C extends HierachicalInheritance_Superclass 
{
	public void method1()
	{
		System.out.println("to programming world");
	}

	public static void main(String []args)
	{
		HierachicalInheritance_Subclass_C obj = new HierachicalInheritance_Subclass_C();
		obj.method();
		obj.method1();
	}
}
