package chapter2;

/**
 * 测试java虚拟机栈的StackOverFlowError
 * @author skywalker
 *
 */
public class JavaVMStackSOF {

	/**
	 * 堆栈深度
	 */
	private int stackLength = 1;
	
	public void stackLeak() {
		stackLength ++;
		stackLeak();
	}
	
	public static void main(String[] args) {
		JavaVMStackSOF sof = new JavaVMStackSOF();
		try {
			sof.stackLeak();
		}catch(Throwable t) {
			System.out.println("深度:" + sof.stackLength);
			t.printStackTrace();
		}
	}
	
}
