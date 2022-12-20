package javaPracticeProgram;

public class NonStaticMethod 
{
	public void method()
	{
		System.out.println("hello");
	}

	public static void main(String []args)
	{
		NonStaticMethod obj = new NonStaticMethod();
		obj.method();
	}
}
