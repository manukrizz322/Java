
class Granddaddy {
	public void house() {
		System.out.println("3 BHK House.");
	}
}

class Daddy extends Granddaddy {
	public void land() {
		System.out.println("5 Arcs of Land..");
	}
}

class Daughter extends Daddy {
	public void car() {
		System.out.println("Own Audi Car..");
	}
}

public class A66_Multilvel {
	public static void main(String args[]) {
		Daughter o = new Daughter();
        o.car();
        o.house();
        o.land();
    }

}
