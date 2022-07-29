
public class A44_Jagged_Array_For {
	public static void main(String[] args) {
		int a[][]= {
				{10,20,30,40},
				{10,20,30},
				{10,20,30,50}
		};
		for (int[] k : a) {
			for (int l : k) {
				System.out.print(" "+l);
			}
			System.out.println("");
		}
	}

}
