import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectDemo {
	@SuppressWarnings("unused")
	private void method1() {
		System.out.println("Method-1 in Private");
	}

	@SuppressWarnings("unused")
	private void method2(String name, String nkjj) {
		System.out.println("Method-2 in Private " + name + nkjj);
	}
}

public class A96_Calling_Private_Method_using_Reflection_API {

	public static Method getMethod(Object o, String methodnme, @SuppressWarnings("rawtypes") Class... paratypes)
			throws NoSuchMethodException, SecurityException {
		Method declaredMethod = o.getClass().getDeclaredMethod(methodnme, paratypes);
		declaredMethod.setAccessible(true);
		return declaredMethod;

	}

	public static void main(String[] args)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		ReflectDemo o = new ReflectDemo();

		getMethod(o, "method1", null).invoke(o, null);

		getMethod(o, "method2", String.class, String.class).invoke(o, "sdkjds", "hjdslkslksl");

		
	}
}
