class Father {
	public void house() {
		System.out.println("have Own 2BHK House");
	}
}

class son extends Father {
	public void car() {
		System.out.println("Have Own Audi car");
	}
}

public class A65_Single_Inheritance {
	
	public static void main(String[] args) {
		
	
son o=new son();
o.car();
o.house();
}}
