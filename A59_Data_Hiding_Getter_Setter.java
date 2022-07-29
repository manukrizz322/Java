class shapeRectangle{
	private int length,width;
	
	int getlength() {
		return length;
	}
	int getWidth() {
		return width;
	}
	void setLength(int l) {
		if (l>0) 
			length=l;
		else
			length=0;
		
	}
	void setWidth(int w) {
		if (w>0)
			width=w;
		else
			width=0;
			
		
	}
	int area() {
		int a=length*width;
		return a;
		
	}
	
}
public class A59_Data_Hiding_Getter_Setter {
	public static void main(String[] args) {
		shapeRectangle o=new shapeRectangle();
		o.setLength(10);
		o.setWidth(20);
		System.out.println("Length : "+o.getlength());
		System.out.println(String.format("Width : %d", o.getWidth()));
	System.out.println(String.format("Area of rectangle : %d", o.area()));
	}

}
