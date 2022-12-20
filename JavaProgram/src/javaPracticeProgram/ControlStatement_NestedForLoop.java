package javaPracticeProgram;

public class ControlStatement_NestedForLoop 
{
	public void method()
	{
		int i;

		for(i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println(i+" "+j);
			}
		}
	}

	public static void main(String []args)
	{
		ControlStatement_NestedForLoop obj = new ControlStatement_NestedForLoop();
		obj.method();
	}

}
