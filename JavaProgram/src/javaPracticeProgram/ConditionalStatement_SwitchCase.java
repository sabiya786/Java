package javaPracticeProgram;

public class ConditionalStatement_SwitchCase 
{
	public void method()
	{
		int ch=12;

		switch(ch)
		{
		case 1:
		{
			System.out.println("pass" +ch);
		}break;
		case 13:
		{
			System.out.println("pass" +ch);
		}break;
		case 11:
		{
			System.out.println("pass" +ch);
		}break;
		case 12:
		{
			System.out.println("pass" +ch);
		}break;

		default:
		{
			System.out.println("Fail");
		}
		}
	}

	public static void main(String []args)
	{
		ConditionalStatement_SwitchCase obj = new ConditionalStatement_SwitchCase();
		obj.method();
	}

}
