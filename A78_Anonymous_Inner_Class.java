abstract class testDemo {
	abstract void display();

}

class outerDemo {
	public void outerDisplay() {
		testDemo o = new testDemo() {

			@Override
			void display() {

				System.out.println("Test Display");

			}
		};
		o.display();
	}

}

public class A78_Anonymous_Inner_Class {
	public static void main(String[] args) {
		outerDemo o=new outerDemo();
		o.outerDisplay();
	}

}
