package javaPracticeProgram;

public class ConstructorCalling 
{
	public ConstructorCalling()
	{
		System.out.println("welcome");
	}
	public void method()
	{
		
	}
	
	public ConstructorCalling(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String []args)
	{
		ConstructorCalling obj = new ConstructorCalling();
		obj.method();
		
		new ConstructorCalling(10);
	}

}
