package chapter8;

/**
 * 静态分发
 * 测试在实例方法的结果
 * 这说明了只要是方法重载发生的就是静态分发
 * @author skywalker
 *
 */
public class StaticDispatch2 {

	static abstract class Human {}
	
	static class Man extends Human {}
	
	static class Woman extends Human {}
	
	public void sayHello(Human human) {
		System.out.println("human says hello");
	}
	
	public void sayHello(Man man) {
		System.out.println("man says hello");
	}
	
	public void sayHello(Woman woman) {
		System.out.println("woman says hello");
	}
	
	public static void main(String[] args) {
		Human man = new Man();
		Human woman = new Woman();
		StaticDispatch2 sd = new StaticDispatch2();
		
		sd.sayHello(man);//human says hello
		sd.sayHello(woman);//human says hello
	}
	
}
