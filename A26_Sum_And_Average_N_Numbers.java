import java.util.Scanner;

public class A26_Sum_And_Average_N_Numbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Limit : ");
		float n = in.nextInt();
		float sum = 0, a;
		for (int i = 0; i <= n; i++) {
			System.out.println("Enter The Number " + i + ": ");
			a = in.nextInt();
			sum += a;

		}
		
		float avg=sum / n;
		System.out.println("The Sum of given numbers is :" + sum);
		System.out.println("The Average of given numbers is : " +avg );
	in.close();
	}

}
