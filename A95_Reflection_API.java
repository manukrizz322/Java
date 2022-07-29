import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;

class userDetails {
	private String name, city;
	private int age;
	public int rollno;

	public userDetails() {
		name = "Ram Kumar";
		age = 25;
		city = "Salem";
	}

	public userDetails(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
		System.out.println("City : " + city);
		System.out.println("--------------------------");
	}

	private void Salary() {
		System.out.println("This is Private Salary Method");
	}
}

public class A95_Reflection_API {
	public static void main(String[] args) {
		// Class o =student.class;

		System.out.println("------------Class Details-----------");
		userDetails o = new userDetails("Raja", 25, "Salem");
		Class c = o.getClass();
		System.out.println("Class Name             : " + c.getName());
		System.out.println("Check its is Interface : " + c.isInterface());
		System.out.println("Check its is Array     : " + c.isArray());

		System.out.println("-------------Constructor Details----------");
		Constructor[] constructors = c.getConstructors();
		for (Constructor co : constructors) {
			System.out.println("Constructor Name : " + co.getName());
			System.out.println("\tConstructor Parameters");
			if (co.getParameterCount() == 0) {
				System.out.println("\t\tNo Arg Constructor");

			} else {
				Parameter[] parameters = co.getParameters();
				for (Parameter p : parameters) {
					System.out.println("\t\t" + p.getName() + " " + p.getType());
				}
			}
		}
		System.out.println("----Method Details------------");
		Method[] methods = c.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println("Method " + (i + 1) + " : " + Modifier.toString(methods[i].getModifiers()) + " "
					+ methods[i].getReturnType().getName() + " " + methods[i].getName() + " - "
					+ Arrays.toString(methods[i].getParameters()));
		}
		System.out.println("-----------Declared Method Details-------------");
		Method[] decmethods = c.getDeclaredMethods();
		for (int i = 0; i < decmethods.length; i++) {
			System.out.println("Method "+(i+1)+" : "+
		Modifier.toString(decmethods[i].getModifiers())+" "+
					decmethods[i].getReturnType().getName()+" "+
		decmethods[i].getName()+" - "+
					Arrays.toString(decmethods[i].getParameters()));
		}
		System.out.println("---------Fields Details-----------------");
		
		//Field[] fields=c.getFields();  //Public Fields
		Field[] fields = c.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(
					Modifier.toString(f.getModifiers())+" "+
			f.getType().getName()+" "+
							f.getName());
			
		}
	}

}
