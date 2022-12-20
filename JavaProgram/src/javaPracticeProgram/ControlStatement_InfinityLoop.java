package javaPracticeProgram;

public class ControlStatement_InfinityLoop 
{
	public void method()
	{
		int i=10;
		while(i!=0)
		{
			System.out.println(i);
			i++;
		}
	}

	public static void main(String []args)
	{
		ControlStatement_InfinityLoop obj = new ControlStatement_InfinityLoop();
		obj.method();
	}

}
