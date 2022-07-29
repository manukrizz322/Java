abstract class shpe {
	abstract void draw();

	void message() {
		System.out.println("Message From Shape");
	}
}

class recgleShape extends shpe {

	@Override
	void draw() {
		System.out.println("Draw Rectangle Using Length & Breadth..");
	}

}

public class A71_Abstract_Class {
public static void main(String[] args) {
	recgleShape o=new recgleShape();
	o.draw();
	o.message();
}
}
