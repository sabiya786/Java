package javaPracticeProgram;

public class RelationalOperator 
{
	public void method()
	{
		int a=10,b=20;
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
	}
	
	public static void main(String []args)
	{
		RelationalOperator obj = new RelationalOperator();
		obj.method();
		System.out.println( obj instanceof RelationalOperator);
	}

}
