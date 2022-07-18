public class A30_Armstrong_Number_between_100_999 {
public static void main(String[] args) {
	for (int i = 100; i <=999; i++) {
		
		
		int temp = i, a = 0, rem;

		while (temp != 0) {
			rem = temp % 10;
			a = a + (rem * rem * rem);
			temp = temp / 10;

		}
		if (i == a) {
			System.out.println(i + " is armstrong number");

		} 
	}
}
}
