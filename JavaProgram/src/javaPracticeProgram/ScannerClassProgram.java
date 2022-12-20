package javaPracticeProgram;

import java.util.Scanner;

public class ScannerClassProgram 
{
	public void method()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value ");
		int a = s.nextInt();
		
		System.out.println(a);
		s.close();
	}
	
	public static void main(String []args)
	{
		ScannerClassProgram obj = new ScannerClassProgram();
		obj.method();
	}
	

}
