package chapter7;

public class SuperClass {

	static {
		System.out.println("SuperClass初始化");
	}
	
	public static int value = 7;
	
}

class SubClass extends SuperClass {
	
	static {
		System.out.println("SubClass初始化");
	}
	
}
