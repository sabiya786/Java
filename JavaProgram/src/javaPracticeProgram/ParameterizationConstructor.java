package javaPracticeProgram;

public class ParameterizationConstructor 
{
	
	public ParameterizationConstructor(int c,int d)
	{
		System.out.println(c+d);
	}
	
	public static void main(String []args)
	{
		new ParameterizationConstructor(10,20);
	}
}
