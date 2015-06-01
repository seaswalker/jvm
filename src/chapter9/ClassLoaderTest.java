package chapter9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 根据类加载器的class还是实例来区分?
 * @author skywalker
 *
 */
public class ClassLoaderTest {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		MyClassLoader m1 = new MyClassLoader();
		MyClassLoader m2 = new MyClassLoader();
		Class<?> c1 = m1.loadClass("C:/Users/xsdwe_000/Desktop/Person.class");
		Class<?> c2 = m2.loadClass("C:/Users/xsdwe_000/Desktop/Person.class");
		/*Class<?> c2 = m2.loadClass("chapter9.Person");
		Class<?> c2 = m2.loadClass("chapter9.Person");*/
		System.out.println(c1.equals(c2));//false
	}
	
}

class MyClassLoader extends ClassLoader {
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		InputStream is = null;
		try {
			is = getInputStream(name);
			if(is == null) {
				return super.loadClass(name);
			}
			byte[] b = new byte[is.available()];
			is.read(b);
			String className = name.endsWith(".class") ?
					name.substring(name.lastIndexOf("/") + 1, name.lastIndexOf(".")) : name;
			return defineClass(className, b, 0, b.length);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * 获取class文件输入流
	 */
	private InputStream getInputStream(String name) throws FileNotFoundException {
		InputStream is = null;
		if(name.endsWith(".class")) {
			File file = new File(name);
			if(file.exists()) {
				is = new FileInputStream(file);
			}
		}else {
			String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
			is = getClass().getResourceAsStream(fileName);
		}
		return is;
	}
	
}
