import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

public class CustomClassLoader extends ClassLoader {
	
	private Hashtable<String,Class> classes = new Hashtable<String,Class>();
	
	public CustomClassLoader() {
		super(CustomClassLoader.class.getClassLoader());
	}

	public Class loadClass(String className) {
		
		Class c = null;
		
		try{
			c = super.loadClass(className);
		}catch (ClassNotFoundException e){
			c = findClass(className);
		}
		
		return c;
	}

	public Class findClass(String className) {
		
		
		byte classByte[];
		Class result = null;
		
		result = (Class) classes.get(className);
		
		if (result != null) {
			return result;
		}

		try {
			return findSystemClass(className);
		} catch (Exception e) {
		}
		try {
			String classPath = ((String) ClassLoader.getSystemResource(className.replace('.', File.separatorChar) + ".class").getFile()).substring(1);
			classByte = loadClassData(classPath);
			result = defineClass(className, classByte, 0, classByte.length,null);
			classes.put(className, result);
			return result;
		} catch (Exception e) {
			return null;
		}
	}

	private byte[] loadClassData(String className) throws IOException {

		File f;
		f = new File(className);
		int size = (int) f.length();
		byte buff[] = new byte[size];
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		dis.readFully(buff);
		dis.close();
		return buff;
	}


}
