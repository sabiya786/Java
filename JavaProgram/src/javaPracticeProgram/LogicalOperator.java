package javaPracticeProgram;

public class LogicalOperator 
{
	public void method()
	{
		int a=10,b=20;

		//logical && operator
		if(a>b && a!=b)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}

		//logical || operator
		if(a>b || a!=b)
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
		LogicalOperator obj = new LogicalOperator();
		obj.method();
	}

}
