package chapter3;

/**
 * 验证jvm的回收算法不是引用计数法
 * 虚拟机参数，输出日志：
 * -Xloggc:D:/gc.log
 * @author skywalker
 *
 */
public class ReferenceCountingGC {
	
	@SuppressWarnings("unused")
	private ReferenceCountingGC instance;
	
	public static void main(String[] args) {
		ReferenceCountingGC rA = new ReferenceCountingGC();
		ReferenceCountingGC rB = new ReferenceCountingGC();
		rA.instance = rB;
		rB.instance = rA;
		
		rA = null;
		rB = null;
		System.gc();
	}

}
