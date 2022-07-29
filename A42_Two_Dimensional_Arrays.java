
public class A42_Two_Dimensional_Arrays {
	public static void main(String[] args) {
		int a[][]= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
			
		}
		
		int [][]b=new int[10][10];
		@SuppressWarnings("unused")
		int [][][]c=new int[10][10][10];
		
		
		b[0][0]=10;
		System.out.println("***************");
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {
				System.out.print(" "+b[i][j]);
			}
			System.out.println("");
			
		}
	}

}
