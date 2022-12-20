package javaPracticeProgram;

public class InstantVariable 
{
	int a=10;

	public void method()
	{
		System.out.println(a);
	}

	public static void main(String []args)
	{
		InstantVariable obj = new InstantVariable();
		obj.method();
	}

}
