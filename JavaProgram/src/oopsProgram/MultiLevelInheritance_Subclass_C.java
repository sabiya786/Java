package oopsProgram;

public class MultiLevelInheritance_Subclass_C extends MultiLevelInheritance_Superclass_B
{
	public void method3()
	{
		System.out.println("to oops programming");
	}
	
	public static void main(String []args)
	{
		MultiLevelInheritance_Subclass_C obj = new MultiLevelInheritance_Subclass_C();
		obj.method();
		obj.method1();
		obj.method3();
	}
	

}
