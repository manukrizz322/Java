import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectDemo{
	private void method1() {
		System.out.println("Method-1 in Private");
	}
	private void method2(String name) {
		System.out.println("Method-2 in Private "+name);
	}
}
public class A96_Calling_Private_Method_using_Reflection_API {
public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
	ReflectDemo o=new ReflectDemo();
	Class c=o.getClass();
	
	Method m1 = c.getDeclaredMethod("method1", null);
	m1.setAccessible(true);
	m1.invoke(o, null);
	
	Method m2=c.getDeclaredMethod("method2", String.class);
	m2.setAccessible(true);
	m2.invoke(o, "Tutor Joes");//object,parameter
}
}
