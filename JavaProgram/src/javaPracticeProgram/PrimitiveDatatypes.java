package javaPracticeProgram;

public class PrimitiveDatatypes 
{
	public void method()
	{
		boolean b =10>11;
		byte a = 10;
		short s = 12;
		char c = 's';
		int i = 22222;
		long l =11111;
		float g=1.2f;
		double f=11.22d;
		
		System.out.println(a+""+b+s+c+i+l+g+f);
	}
	
	public static void main(String []args)
	{
		PrimitiveDatatypes obj = new PrimitiveDatatypes();
		obj.method();
	}

}
