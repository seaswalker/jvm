package chapter8;

/**
 * ¾²Ì¬·Ö·¢
 * @author skywalker
 *
 */
public class StaticDispatch {

	static abstract class Human {}
	
	static class Man extends Human {}
	
	static class Woman extends Human {}
	
	public static void sayHello(Human human) {
		System.out.println("human says hello");
	}
	
	public static void sayHello(Man man) {
		System.out.println("man says hello");
	}
	
	public static void sayHello(Woman woman) {
		System.out.println("woman says hello");
	}
	
	public static void main(String[] args) {
		Human man = new Man();
		Human woman = new Woman();
		
		sayHello(man);//human says hello
		sayHello(woman);//human says hello
	}
	
}
