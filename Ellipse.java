package labs;

public class Ellipse extends Rectangle{

	Ellipse(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public int getArea() {
		double area = 3.14 * width * height;
		return (int) area;
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
	
	public String toString() {
		return "The width is: " + width + ". The height is : " + height + " and the area is : " + getArea();
	}
}
