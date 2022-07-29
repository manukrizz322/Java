
public class A68_Methods_With_Varargs {
	public static void getNames(String...names) {
		for (String name : names) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		getNames("Ram","Sam","Kumar","Sara");
	}

}
