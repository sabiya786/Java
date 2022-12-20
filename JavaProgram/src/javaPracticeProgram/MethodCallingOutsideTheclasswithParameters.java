package javaPracticeProgram;

public class MethodCallingOutsideTheclasswithParameters 
{
	public static void main(String []args)
	{
		ParameterizeMethod obj = new ParameterizeMethod();
		obj.method(1000);
		
		ParameterizeMethod.method1(2000);
	}

}
