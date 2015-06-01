package chapter9;

public class GrandFather {

	void thinking() {
		System.out.println("grandfather thinking");
	}
	
	public static void main(String[] args) {
		new Son().thinking();
	}
	
}

class Father extends GrandFather {
	
	void thinking() {
		System.out.println("Father thinking");
	}
	
}

class Son extends Father {
	
	void thinking() {
		new GrandFather().thinking();
		System.out.println("son thinking");
	}
	
}
