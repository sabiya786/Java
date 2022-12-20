package javaPracticeProgram;

public class ControlStatement_ForLoop 
{
	public void method()
	{
		int i;

		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String []args)
	{
		ControlStatement_ForLoop obj = new ControlStatement_ForLoop();
		obj.method();
	}

}
