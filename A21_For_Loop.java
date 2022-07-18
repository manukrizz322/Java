import java.util.Scanner;

public class A21_For_Loop {
	public static void main(String[] args) {
		System.out.println("Enter The Limit : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
in.close();
	}

}
