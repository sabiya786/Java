package javaPracticeProgram;

public class ConstructorOverloading 
{
	
	public ConstructorOverloading(int a)
	{
		System.out.println(a);
		
	}
	
	public ConstructorOverloading(String b)
	{
		System.out.println(b);

	}
	
	public ConstructorOverloading(int a,int b)
	{
		System.out.println(a+b);

	}
	
	public static void main(String []args)
	{
		new ConstructorOverloading(10);
		new ConstructorOverloading("welcome");
		new ConstructorOverloading(10,20);
	}
}
