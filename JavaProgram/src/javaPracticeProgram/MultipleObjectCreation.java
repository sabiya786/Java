package javaPracticeProgram;

public class MultipleObjectCreation 
{
	int b;
	public MultipleObjectCreation(int a)
	{
		this.b = a;
	}
	public void method()
	{
		System.out.println(b);
	}
	
	public static void main(String []args)
	{
		MultipleObjectCreation obj = new MultipleObjectCreation(20);
		obj.method();
		
		MultipleObjectCreation obj1 = new MultipleObjectCreation(30);
		obj1.method();
	}

	
}
