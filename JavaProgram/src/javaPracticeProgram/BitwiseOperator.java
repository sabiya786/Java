package javaPracticeProgram;

public class BitwiseOperator 
{
	public void method()
	{
		int a=10,b=20;

		//Bitwise & operator
		if(a>b & a!=b)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}

		//Bitwise | operator
		if(a>b | a==b)
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
		BitwiseOperator obj = new BitwiseOperator();
		obj.method();
	}
	

}
