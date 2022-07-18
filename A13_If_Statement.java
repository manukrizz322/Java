import java.util.Scanner;

public class A13_If_Statement {
public static void main(String[] args) {
	int age;
	System.out.println("Enter Your Age : ");
	Scanner in =new Scanner(System.in);
	age=in.nextInt();
	if(age>=18)
	{
		System.out.println("you are Eligible For Vote...");
	}
	in.close();
}
}
