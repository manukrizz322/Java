
public class A91_Converting_string_object_to_primitive_numbers {
public static void main(String[] args) {
	//Converting string object to primitive numbers.
	String SI="25";
	Integer I =Integer.valueOf(SI);
	int i=I.intValue();
	System.out.println(i);
	String SD="25.25";
	Double D=Double.valueOf(SD);
	double d=D.doubleValue();
	System.out.println(d);
	
}
}
