class Designation{
	String role;
	@Override
	public String toString() {
		return role;
	}
}
class Employee implements Cloneable{
	String name;
	int age;
	Designation deg=new Designation();
	public void display() {
System.out.println("Name      : "+name);
System.out.println("Age       : "+age);
System.out.println("Department: "+deg);
System.out.println("---------------------");
	}
	@Override
	public  Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class A93_Shallow_Copy_Object_Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1=new Employee();
		e1.name="Ram Kumar";
		e1.age=25;
		e1.deg.role="Manager";
		System.out.println("Before Changing Role : ");
		e1.display();
		
		System.out.println("Cloning and Printing E2 object : ");
		Employee e2=(Employee) e1.clone();
		e2.deg.role="HR";
		e2.display();
		
		System.out.println("After Changing Role : ");
        e1.display();
		
		
		
		
		
	}

}
