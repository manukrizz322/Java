import java.util.Scanner;

public class A27_Reverse_n_digit_number {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter The Number : ");
		long n=in.nextInt();
		long reverse=0,rem;
		while (n!=0) {
			rem=n%10;
			reverse=(reverse*10)+rem;
			n=n/10;
		}
		System.out.println("Reversed Number : "+reverse);
		in.close();
	}

}
