import java.util.Scanner;

public class A33_Number_is_Prime_Or_Not {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n = in.nextInt();
		int f = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				f++;

			}
		}
		if (f == 2) {
			System.out.println(n + " is a Prime Number");
		} else {
			System.out.println(n + "is not a Prime Number");
		}
		in.close();
	}

}
