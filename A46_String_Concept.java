
public class A46_String_Concept {
	public static void main(String[] args) {
		String a="Tutor Joes";
		String b="tutor Joes";
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		
		System.out.println("A Hashcode "+a.hashCode());
		System.out.println("B hashcode "+b.hashCode());
		System.out.println("Equals : "+a.equals(b));
		System.out.println("Equals Ignore Case: "+a.equalsIgnoreCase(b));
		System.out.println("Length : "+a.length());
		System.out.println("CharAt: "+a.charAt(0));
		System.out.println("UpperCase: "+a.toUpperCase());
		System.out.println("LowerCase:"+a.toLowerCase());
		System.out.println("Replace: "+a.replace("Joes", "Stanley"));
		System.out.println("Contains : "+a.contains("Joes"));
		System.out.println("Empty : "+a.isEmpty());
		System.out.println("EndWith: "+a.endsWith("es"));
		System.out.println("Startswith:"+a.startsWith("Tut"));
		System.out.println("Substring : "+a.substring(5));
		System.out.println("Substring : "+a.substring(0, 5));
		
		char[]carray=a.toCharArray();
		for (char c : carray) {
			System.out.println(c+" ");
		}
		String c=" Tutor ";
		System.out.println("Length: "+c.length());
		System.out.println("C: "+c);
		System.out.println("C Trim : "+c.trim());
		System.out.println("C Trim Length:"+c.trim().length());
		 
		
	}

}
