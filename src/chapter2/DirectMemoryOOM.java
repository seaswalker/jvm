package chapter2;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * 直接内内存溢出
 * 虚拟机参数
 * -Xmx20m -XX:MaxDirectMemorySize=10m
 * 默认情况下第二个参数的大小就是java heap的大小，即第一个参数
 * @author skywalker
 *
 */
public class DirectMemoryOOM {

	private static final int _1MB = 1024 * 1024;
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		//只有BootstrapClassLoader才可以使用
		//Unsafe unsafe = Unsafe.getUnsafe();
		Field field = Unsafe.class.getDeclaredFields()[0];
		field.setAccessible(true);
		Unsafe unsafe = (Unsafe) field.get(null);
		while(true) {
			unsafe.allocateMemory(_1MB);
		}
	}
	
}
