class Demo {
	private int m, n;

	Demo(int x, int y) {

		m = x;
		n = y;
	}

	int largest() {
		if (m > n)
			return m;
		else
			return n;

	}

	void display() {
		int large = largest();
		System.out.println("The Greatest Number is : " + large);
	}
}

public class A64_Nesting_Of_Methods {
	public static void main(String[] args) {
		Demo o = new Demo(10, 20);
		o.display();
	}

}
