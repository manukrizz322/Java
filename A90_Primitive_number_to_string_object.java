
public class A90_Primitive_number_to_string_object {
public static void main(String[] args) {
	//Converting primitive number to string object.
	short s=25;
	String S=Short.toString(s);//"25"
	System.out.println("Short String Object : "+S);
	byte b=25;
	String B=Byte.toString(b);
	System.out.println("Byte String Object  : "+B);
	int i=25;
	String I=Integer.toString(i);
	System.out.println("Integer String Object : "+I);
    long l=25;
    String L=Long.toString(l);
    System.out.println("Long String Object : "+L);
    float f=25.5f;
    String F=Float.toString(f);
    System.out.println("Float String Object : "+F);
    double d=25.525;
    String D=Double.toString(d);
    System.out.println("Double String Object : "+D);
	
}
}
