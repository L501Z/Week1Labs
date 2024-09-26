package labs;


public class Rectangle extends Shape{

	public int width;
	public int height;
	
	Rectangle(int width, int height) {
		super(4);
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;

	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getArea() {
		return height * width;
	}
	
	public String toString() {
		return "The width is: " + width + ". The height is : " + height + " and the area is : " + getArea();
	}
}
