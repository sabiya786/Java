package dynamicProgram;

import java.util.Scanner;

public class StaticMethod 
{
	public static void method()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value = ");
		
		int a = s.nextInt();
		System.out.println(a);
		
		s.close();
	}
	
	public static void main(String []args)
	{
		method();
	}

}
