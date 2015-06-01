package test;

/**
 * 马老师ppt上看到的两个面试题
 * @author skywalker
 *
 */
public class Test1 {

	public static void main(String[] args) {
		testB();
	}
	
	protected static void testA() {
		int count = 0;
		count += count++;
		System.out.println(count);//0
		
		//反编译字节码：
		  /*public static void main(java.lang.String[]);
		    Code:
		       0: iconst_0
		       1: istore_1
		       2: iload_1
		       3: iload_1
		       4: iinc          1, 1(关键在这里，iinc的意思是把di1个本地变量加1，造成的后果就是1被后来的0覆盖了)
		       7: iadd
		       8: istore_1
		       9: getstatic     #16                 // Field java/lang/System.out:Ljava/
		io/PrintStream;
		      12: iload_1
		      13: invokevirtual #22                 // Method java/io/PrintStream.printl
		n:(I)V
		      16: return*/
	}
	
	public static void testB() {
		try {
			System.exit(0);
		}finally {
			//不会执行
			System.out.println("finally");
		}
	}
	
}
