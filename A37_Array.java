import java.util.Scanner;

public class A37_Array {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		System.out.println(a[2]);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int element : a) {
			System.out.println(element);
		}
		int b[];
		b=new int[10];
		int[]c=new int[10];
		
		for (int element : b) {
			System.out.println(element);
		}
		Scanner in = null;
		for (int i = 0; i <3; i++) {
			 in =new Scanner(System.in);
			System.out.println("Enter The Number");
			c[i]=in.nextInt();
			
		}
		for (int element : c) {
			System.out.println(element);
		}
		in.close();
	}

}
