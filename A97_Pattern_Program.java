
public class A97_Pattern_Program {
	
	
	@org.testng.annotations.Test(priority = -2)
	private void ThreePattern() {
		for (int i = 1; i <=9; i++) {
			
			for (int j = 1; j <=8; j++) {
				
				if(i==1||i==5||i==9||j==8)
				 System.out.print("*");
				else
				 System.out.print(" ");	
			}
			System.out.println("");
		}

	}
	
	@org.testng.annotations.Test(priority = -1)
	private void SevenPattern() {

		for (int i = 0; i <5; i++) {
			
			for (int j = 0; j <5; j++) {
				
				if((i==0||(i==2&&(j>=1&&j<=3))||((i+j==4))))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println("");
			
		}

	}
	@org.testng.annotations.Test(priority = 0)
	private void DiagonalShape() {
		for (int i = 0; i <10; i++) {
			
			for (int j = 0; j <10; j++) {
				if(i==0||j==0||i==9||j==9||i+j==9||i-j==0) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println("");
			
		}

	}




}
