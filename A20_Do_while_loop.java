import java.util.Scanner;

public class A20_Do_while_loop {

	public static void main(String[] args) {
		System.out.println("Enter The Limit : ");
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		int i=2;
		do {
			System.out.println(i);
			i=i+2;
		} while (i<=n);
		in.close();
	}
}
