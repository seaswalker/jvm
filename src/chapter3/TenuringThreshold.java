package chapter3;

/**
 * 测试对象进入老年区的年龄(默认15)
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	-XX:MaxTenuringThreshold=15 -XX:+UseSerialGC
	-XX:+PrintTenuringDistribution
	此实验没有成功 why? 不知道...
 * @author skywalker
 *
 */
public class TenuringThreshold {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte []b1 = new byte[Constants._MB / 4];
		byte []b2 = new byte[Constants._MB * 4];
		byte []b3 = new byte[Constants._MB * 4];
		b3 = null;
		b3 = new byte[Constants._MB * 4];
	}
	
}
