package javaPracticeProgram;

public class Constructor 
{
	int a;

	public Constructor()
	{
		a=10;
	}


	public void method()
	{
		System.out.println(a);
	}

	public static void main(String []args)
	{
		Constructor obj = new Constructor();
		obj.method();
	}
}
