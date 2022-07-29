import java.util.Scanner;

public class A35_Perfect_Number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n = in.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			System.out.println(n + " is a Perfect Number");

		} else {
			System.out.println(n + " is not a perfect Number");

		}
		in.close();
	}

}
