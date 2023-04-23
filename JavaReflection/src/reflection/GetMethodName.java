package reflection;

import java.lang.reflect.Method;

public class GetMethodName {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		MyClass myObject = new MyClass();
		Method method = myObject.getClass().getMethod("myMethodName");
		String methodName = method.getName();
		System.out.println(methodName);
	}

}
