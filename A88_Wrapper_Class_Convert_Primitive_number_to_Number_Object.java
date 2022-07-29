
public class A88_Wrapper_Class_Convert_Primitive_number_to_Number_Object {
public static void main(String[] args) {
	//Converting primitive number to number object
    //Byte Number to Byte Object
	
	byte b=10;
	String s1="25";
	Byte bo1=new Byte(b);
	Byte bo2=Byte.valueOf(s1);
	System.out.println("Byte Object-1 : "+bo1);
	System.out.println("Byte Object-2 : "+bo2);
	
	//Short Number to Short Object
	short s=85;
	String s2="95";
	Short so1=new Short(s);
	Short so2=Short.valueOf(s2);
	System.out.println("Short Object-1 : "+so1);
	System.out.println("Short Object-2 : "+so2);
	
	 //Int Number to Integer Object
    int i=125;
    String s3="100";
    Integer io1 =new Integer(i);
    Integer io2 = Integer.valueOf(s3);
    System.out.println("Integer Object-1 : "+io1);
    System.out.println("Integer Object-2 : "+io2);
	
  //Long Number to Long Object
    long l=122525;
    String s4="100885";
    Long lo1 =new Long(l);
    Long lo2 = Long.valueOf(s4);
    System.out.println("Long Object-1 : "+lo1);
    System.out.println("Long Object-2 : "+lo2);
    
  //Float Number to Float Object
    float f=25.5f;
    String s5="23.25f";
    Float fo1 =new Float(f);
    Float fo2 = Float.valueOf(s5);
    System.out.println("Float Object-1 : "+fo1);
    System.out.println("Float Object-2 : "+fo2);
    
    //Double Number to Double Object
    double d=258.5555;
    String s6="223.25";
    Double do1 =new Double(d);
    Double do2 = Double.valueOf(s6);
    System.out.println("Double Object-1 : "+do1);
    System.out.println("Double Object-2 : "+do2);
}
}
