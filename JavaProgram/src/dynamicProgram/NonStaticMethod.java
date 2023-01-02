package dynamicProgram;

import java.util.Scanner;

public class NonStaticMethod 
{
	public void method()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value ");
		int a = s.nextInt();

		System.out.println("a = "+a);
		s.close();
	}

	public static void main(String []args)
	{
		NonStaticMethod obj = new NonStaticMethod();
		obj.method();
	}

}
