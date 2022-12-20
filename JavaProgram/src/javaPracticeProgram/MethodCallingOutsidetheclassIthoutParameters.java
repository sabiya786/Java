package javaPracticeProgram;

public class MethodCallingOutsidetheclassIthoutParameters 
{
	public static void main(String []args)
	{
		MethodCallingWithinClass.method1();
		
		MethodCallingWithinClass obj = new MethodCallingWithinClass();
		obj.method();
	}

}
