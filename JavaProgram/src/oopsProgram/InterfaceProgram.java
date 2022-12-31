package oopsProgram;

public interface InterfaceProgram 
{
	int a=10;

	public void method();
	void method1();

	private void method2()
	{
		System.out.println("I am private method present in interface");
	}

	default void method3()
	{
		method2();
	}

	public static void method4()
	{
		System.out.println("I am static method present in interface");
	}

}
