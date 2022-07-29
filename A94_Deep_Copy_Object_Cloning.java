class Designatio{
	String role;
	@Override
	public String toString() {
		
		return role;
	}
}
class Employe implements Cloneable{
	String name;
	int age;
	Designatio deg=new Designatio();
	
	public void display() {
		System.out.println("Name    : "+age);
		System.out.println("Age     : "+age);
		System.out.println("Department : "+deg);
		System.out.println("---------------------");
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// Assign the shallow copy to new reference variable e
	Employe e=(Employe)super.clone();
	
	// Creating a deep copy for deg (Designation)
	e.deg=new Designatio();
	e.deg.role=deg.role;
	
	// Create a new object for the field e
    // and assign it to shallow copy obtained,
    // to make it a deep copy
	return e;
	
	
	}
}
public class A94_Deep_Copy_Object_Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employe e1=new Employe();
		e1.name="Ram Kumar";
		e1.age=25;
		e1.deg.role="Manager";
		System.out.println("Before Changing Role : ");
		e1.display();
		
		System.out.println("Cloning and Printing E2 object : ");
		Employe e2=(Employe)e1.clone();
		e2.deg.role="HR";
        e2.display();
 
        System.out.println("After Changing Role : ");
        e1.display();
	}

}
