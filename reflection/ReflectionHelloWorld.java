

import java.lang.reflect.Method;

public class ReflectionHelloWorld {
	
	public static void main(String[] args) {
		Foo f = new Foo();

		Method method;
		try {
			method = f.getClass().getMethod("print", new Class<?>[0]);
			method.invoke(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Foo {
	public void print() {
		System.out.println("abc");
	}

}
