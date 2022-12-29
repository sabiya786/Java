package oopsProgram;

public class NonPrimitive_Beta_DownCasting 
{
	public static void main(String []args)
	{
		NonPrimitive_Beta_UpCasting_Superclass obj = new NonPrimitive_Beta_UpCasting_Subclass();
		NonPrimitive_Beta_UpCasting_Subclass obj1 = (NonPrimitive_Beta_UpCasting_Subclass)obj;
		obj1.method();
		obj1.method1();
	}

}
