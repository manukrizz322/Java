import java.util.Scanner;

public class A12_Getting_Inputs {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		float a,b,c;
		System.out.println("Enter 2 Nos : ");
		a=in.nextFloat();
		b=in.nextFloat();
		c=(a*a)+(b*b)+(2*a*b);
		System.out.println("Result : "+c);
		in.close();
		
	}

	/*
	in.nextInt();
	in.nextFloat();
	in.nextDouble();
	in.next();
	in.nextLine();
	 */
}
