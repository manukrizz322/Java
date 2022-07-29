class Rectangle{
	int length,width;
	
	void getDetails(int length,int width) {
		this.width =length;
		this.width=width;
	}
	int area() {
		int a=length*width;
		return a;
	}
	
	
}
public class A58_Class_Object {
	public static void main(String[] args) {
		Rectangle o1=new Rectangle();
		o1.length=10;
		o1.width=20;
		System.out.println("Area of Rectangle : "+o1.area());
		
		Rectangle o2=new Rectangle();
		o2.getDetails(20, 30);
		System.out.println("Area of Rectangle : "+o2.area());
	}

}
