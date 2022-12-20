package javaPracticeProgram;

public class ControlStatement_WhileLoop 
{
	public void method()
	{
		int i=10;
		while(i<=15)
		{
			System.out.println(i);
			i++;
		}
	}

	public static void main(String []args)
	{
		ControlStatement_WhileLoop obj = new ControlStatement_WhileLoop();
		obj.method();
	}

}
