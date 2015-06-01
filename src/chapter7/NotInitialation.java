package chapter7;

/**
 * 测试被动引用不会致使初始化
 * @author skywalker
 *
 */
public class NotInitialation {

	public static void main(String[] args) {
		//System.out.println(SubClass.value);
		
		//SuperClass[] superClasses = new SuperClass[10];
		
		System.out.println(ConstClass.STR);
	}
	
}
