package javaPracticeProgram;

public class ControlStatement_DoWhileLoop 
{
	public void method()
	{
		int i=1;

		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
	}

	public static void main(String []args)
	{
		ControlStatement_DoWhileLoop obj = new ControlStatement_DoWhileLoop();
		obj.method();
	}

}
