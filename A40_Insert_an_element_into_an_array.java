import java.util.Arrays;

public class A40_Insert_an_element_into_an_array {
public static void main(String[] args) {
	int[]a= {10,20,30,40,50,60,70,80,90,100};
	int index=2;
	int value=55;
	System.out.println("Before Insert "+Arrays.toString(a));
	for (int i =a.length-1; i>index; i--) {
		a[i]=a[i-1];
	}
	a[index]=value;
	System.out.println("After Insert "+Arrays.toString(a));
}
}
