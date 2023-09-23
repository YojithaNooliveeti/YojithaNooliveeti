package mq.java;

public class RobotA 
{
	public void method1()
	{
		System.out.println("Robot is Walking");
	}
	
	public void method2()
	{
		System.out.println("Robot is Running");
	}

	public static void main(String[] args) {
		
		RobotA obj=new RobotA();
		obj.method1();
		obj.method2();

	}

}
