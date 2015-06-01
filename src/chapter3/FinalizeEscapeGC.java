package chapter3;

import java.util.concurrent.TimeUnit;

/**
 * 利用finalize方法自我拯救
 * 说明被可达性算法判断为没有引用的对象后并不是马上就死了，还有机会复活...
 * finalize只会执行一次
 * @author skywalker
 *
 */
public class FinalizeEscapeGC {

	/**
	 * 复活使用的钩子
	 */
	public static FinalizeEscapeGC hook = null;
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize被执行");
		hook = this;
	}
	
	public static void main(String[] args) throws InterruptedException {
		hook = new FinalizeEscapeGC();
		
		//第一次
		hook = null;
		System.gc();
		TimeUnit.MICROSECONDS.sleep(500);
		if(hook == null) {
			System.out.println("死了");
		}else {
			System.out.println("自救成功");
		}
		
		//第二次
		hook = null;
		System.gc();
		TimeUnit.MICROSECONDS.sleep(500);
		if(hook == null) {
			System.out.println("死了");
		}else {
			System.out.println("自救成功");
		}
	}
	
}
