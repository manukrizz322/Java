import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



public class A98_Annotations {
	
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Gio{
		int hh() default 2;
		String hi() default "jifrjijr";
		
	}
	
	@Gio(hh = 3,hi = "hjdhhje")
	public static void puiufijuef() throws NoSuchMethodException, SecurityException {
		 A98_Annotations.Gio annotation = new A98_Annotations().getClass().getMethod("puiufijuef",null).getAnnotation(Gio.class);
	     int hh = annotation.hh();
	     String hi = annotation.hi();
	     System.out.println(hh);
	     System.out.println(hi);
    
	}
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		puiufijuef();
		
		
	}
	
	
	
	

}
