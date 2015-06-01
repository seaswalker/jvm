package chapter8;

/**
 * 239页,slot对GC的影响
 * JVM参数-verbose:gc
 * @author skywalker
 *
 */
public class SlotGC {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		{
			byte[] placeholder = new byte[8 * 1024 * 1024];
			placeholder = null;
		}
		//int a = 0;
		System.gc();
	}
	
}
