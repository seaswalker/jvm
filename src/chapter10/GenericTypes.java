package chapter10;

import java.util.List;

/**
 * 泛型与重载
 * 测试把方法名改成一样的
 * @author skywalker
 *
 */
public class GenericTypes {

	protected int methodA(List<Integer> list) {
		return 1;
	}
	
	protected String methodB(List<String> list) {
		return "";
	}
	
}
