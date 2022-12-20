package javaPracticeProgram;

public class ThisKeyword
{
	int a=10,b,c;
	
	public ThisKeyword(int d)
	{
		this.b = d;
	}
	
	public void method(int e)
	{
		int a=100;
		System.out.println(this.a);
		System.out.println(a);
		System.out.println(this.c=e);
		System.out.println(b);
	}

	
	public static void main(String []args)
	{
		ThisKeyword obj = new ThisKeyword(1000);
		obj.method(200);
	}
}
