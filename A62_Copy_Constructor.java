import java.util.Scanner;

public class A62_Copy_Constructor {
	int age;
	String name;
	 A62_Copy_Constructor(int a,String n) {
		age=a;
		name=n;
		
	}
	 public A62_Copy_Constructor(A62_Copy_Constructor cc) {
	age=cc.age;
	name=cc.name;
	 
	 }
	 void display() {
		 System.out.println("Your name is : "+name+"\nAge is : "+age);
	 }
	 
	 
	 public static void main(String[] args) {
		System.out.println("Enter Your name and age : ");
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		int age=scan.nextInt();
		A62_Copy_Constructor cc=new A62_Copy_Constructor(age,name);
		A62_Copy_Constructor c2=new A62_Copy_Constructor(cc);
		cc.display();
		c2.display();
		scan.close();
		
	}
	

}
