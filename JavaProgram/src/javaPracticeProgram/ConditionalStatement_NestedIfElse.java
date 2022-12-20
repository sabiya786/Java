package javaPracticeProgram;

public class ConditionalStatement_NestedIfElse 
{
	public void method()
	{
		int a=10;

		if(a>=10)
		{
			if(a==10)
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("Fail");
			}

		}
		else
		{
			System.out.println("Fail");
		}
	}

	public static void main(String []args)
	{
		ConditionalStatement_NestedIfElse obj = new ConditionalStatement_NestedIfElse();
		obj.method();
	}

}
