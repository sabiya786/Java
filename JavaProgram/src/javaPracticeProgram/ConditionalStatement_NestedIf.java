package javaPracticeProgram;

public class ConditionalStatement_NestedIf 
{
	public void method()
	{
		int a=10;

		if(a<11)
		{
			if(a==10)
			{
				System.out.println("pass");
			}
		}
	}

	public static void main(String []args)
	{
		ConditionalStatement_NestedIf obj = new ConditionalStatement_NestedIf();
		obj.method();
	}

}
