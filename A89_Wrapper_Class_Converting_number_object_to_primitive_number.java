
public class A89_Wrapper_Class_Converting_number_object_to_primitive_number {
public static void main(String[] args) {
	//Converting number object to primitive number.
	 
    // Byte B= new Byte((byte) 65);
	Byte B=Byte.valueOf((byte)65);
	byte b=B.byteValue();
	System.out.println(b);
	
	 // Short S= new Short((short) 25);
    Short S= Short.valueOf((short) 25);
    short s= S.shortValue();
    System.out.println(s);

    // Integer I= new Integer((int) 45);
    Integer I= Integer.valueOf((int) 45);
    int i= I.intValue();
    System.out.println(i);

    // Float F= new Float(45.25f);
    Float F= Float.valueOf(45.25f);
    float f= F.floatValue();
    System.out.println(f);

    Long L= Long.valueOf(1052695);
    long l= L.longValue();
    System.out.println(l);

    Double D= Double.valueOf(45.25);
    double d= D.doubleValue();
    System.out.println(d);
	
}
}
