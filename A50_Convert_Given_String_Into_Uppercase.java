
public class A50_Convert_Given_String_Into_Uppercase {
public static void main(String[] args) {
	StringBuilder a=new StringBuilder("abc");
	System.out.println("Original Input : "+a);
	for (int i = 0; i <a.length(); i++) {
		if (a.charAt(i)>='a'&&a.charAt(i)<='z') {
			int c=(int)a.charAt(i)-32;
			a.setCharAt(i, (char)c);
		}
	}
	System.out.println("Uppercase Output : "+a);
	
	
	StringBuilder b = new StringBuilder("ABCD");
    System.out.println("Original Input : "+a);
    for(int i=0;i<b.length();i++)//97-122
    {
        if (b.charAt(i) >= 65 && b.charAt(i) <= 90) {
            int d=(int)b.charAt(i)+32;//65+32=97  66+32=98  67+32=99 68+32=100
            b.setCharAt(i,(char)d);//abcd
        }
    }
    System.out.println("Lowercase Output: "+b);
}
}
