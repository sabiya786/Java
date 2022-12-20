package javaPracticeProgram;

public class ConditionalStatement_IfElseIf_LadderIfElse 
{

	public void method()
	{
		int a=100;
		
		if(a==10)
		{
			System.out.println("pass"+a);
		}
		else if(a==20)
		{
			System.out.println("pass"+a);
		}
		else if(a==30)
		{
			System.out.println("pass"+a);
		}	
		else if(a==40)
		{
			System.out.println("pass"+a);
		}		
		else if(a==60)
		{
			System.out.println("pass"+a);
		}		
		else if(a==100)
		{
			System.out.println("pass"+a);
		}
		else
		{
			System.out.println("Fail");
		}

	}

	public static void main(String []args)
	{
		ConditionalStatement_IfElseIf_LadderIfElse obj = new ConditionalStatement_IfElseIf_LadderIfElse();
		obj.method();
	}

}
