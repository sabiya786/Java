package oopsProgram;

public class NonPrimitive_Beta_UpCasting_Subclass extends NonPrimitive_Beta_UpCasting_Superclass
{
	public void method1()
	{
		System.out.println("welcome");
	}
	
	public static void main(String []args)
	{
		NonPrimitive_Beta_UpCasting_Superclass obj = new NonPrimitive_Beta_UpCasting_Subclass();
		obj.method();
	}

}
