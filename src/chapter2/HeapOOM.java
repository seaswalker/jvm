package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * java堆内存溢出测试
 * 虚拟机参数：
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError(生成内存堆转储快照)
 * @author skywalker
 *
 */
public class HeapOOM {

	public static void main(String[] args) {
		List<OOMObject> objects = new ArrayList<HeapOOM.OOMObject>();
		while(true) {
			objects.add(new OOMObject());
		}
	}
	
	static class OOMObject {
	}
	
}
