package chapter3;

/**
 * 大对象直接进入老年区
 * 虚拟机参数：
 * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	-XX:+UseSerialGC -XX:PretenureSizeThreshold=3145728
	3145728是3MB
 * @author skywalker
 *
 */
public class SizeThreshold {
	
	private static int _MB = 1 << 20;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		byte []b = new byte[4 * _MB];
	}
	
}
