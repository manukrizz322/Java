
public class A92_Converting_numeric_string_object_to_primitive_numbers {
public static void main(String[] args) {
	//Converting numeric string object to primitive numbers.
   /* String SI="25";
    Integer I =Integer.valueOf(SI);
    int i=I.intValue();
    System.out.println(i);*/
	
	
	String SI="25";
    int i=Integer.parseInt(SI);
    System.out.println("int Value : "+i);
    String SF="25.25f";
    float f=Float.parseFloat(SF);
    System.out.println("float Value : "+f);
    
    
    
}
}
