package javaPracticeProgram;

public class ConditionalStatement_IfElse 
{
	public void method()
	{
		int a=10;
		
		if(a>=10)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	public static void main(String []args)
	{
		ConditionalStatement_IfElse obj = new ConditionalStatement_IfElse();
		obj.method();
	}

}
