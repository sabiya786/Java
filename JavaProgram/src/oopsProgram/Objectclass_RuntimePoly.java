package oopsProgram;

public class Objectclass_RuntimePoly 
{
	public static void main(String []args)
	{
		RuntimePoly_LateBinding_DynamicBinding_Subclass obj = new RuntimePoly_LateBinding_DynamicBinding_Subclass();
		obj.method(10);


		RuntimePoly_LateBinding_DynamicBinding_Superclass obj1 = new RuntimePoly_LateBinding_DynamicBinding_Superclass();
		obj1.method(100);

	}

}
