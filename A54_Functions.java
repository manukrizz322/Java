class Methods {
	public void add() {
		int a = 123;
		int b = 10;
		System.out.println("Addition : " + (a + b));
	}

	public void sub(int x, int y) {
		System.out.println("Subtraction : " + (x - y));
	}

	public int mul() {
		int a = 123;
		int b = 10;
		return a * b;

	}

	public int div(int x, int y) {
		return (x / y);
	}

	public int factorial(int n) {
		if (n == 1) {
			return 1;
		} else
			return (n * factorial(n - 1));
	}

}

public class A54_Functions {
	public static void main(String[] args) {
		Methods o=new Methods();
		o.add();
		o.sub(123, 10);
		System.out.println("Muli : "+o.mul());
		System.out.println("Division : "+o.div(123, 10));
	}

}
