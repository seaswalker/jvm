package chapter3;

/**
 * ²âÊÔMinorGC
 * ÐéÄâ»ú²ÎÊý£º
 * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	-XX:+UseSerialGC
 * @author skywalker
 *
 */
public class MinorGC {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte []a1 = new byte[2 * Constants._MB];
		byte []a2 = new byte[2 * Constants._MB];
		byte []a3 = new byte[2 * Constants._MB];
		//Minor GC
		byte []a4 = new byte[2 * Constants._MB];
	}
	
}
