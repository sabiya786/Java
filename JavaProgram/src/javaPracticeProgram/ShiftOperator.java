package javaPracticeProgram;

public class ShiftOperator 
{
	public void method()
	{
		int a=10;

		System.out.println(a<<2);
		System.out.println(a>>3);
	}

	public static void main(String []args)
	{
		ShiftOperator obj = new ShiftOperator();
		obj.method();
	}

}
