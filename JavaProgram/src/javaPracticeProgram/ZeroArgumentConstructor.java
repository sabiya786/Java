package javaPracticeProgram;

public class ZeroArgumentConstructor 
{
	int a;

	public ZeroArgumentConstructor()
	{
		a=100;
	}

	public void method()
	{
		System.out.println(a);
	}

	public static void main(String []args)
	{
		ZeroArgumentConstructor obj = new ZeroArgumentConstructor();
		obj.method();
	}

}
