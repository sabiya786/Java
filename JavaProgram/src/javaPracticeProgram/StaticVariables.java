package javaPracticeProgram;

public class StaticVariables 
{
	static int a = 10;

	public void method()
	{
		System.out.println(a);
	}

	public static void main(String []args)
	{
		StaticVariables obj = new StaticVariables();
		obj.method();
	}
}
