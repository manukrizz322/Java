import java.util.Scanner;

public class A29_Armstrong_Number {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 Digit Number : ");
		int num = in.nextInt();
		int temp = num, a = 0, rem;

		while (temp != 0) {
			rem = temp % 10;
			a = a + (rem * rem * rem);
			temp = temp / 10;

		}
		if (num == a) {
			System.out.println(num + " is armstrong number");

		} else {
			System.out.println(num + " is not an armstrong Number");
		}
		in.close();
	}

}
