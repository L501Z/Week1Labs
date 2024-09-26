package labs;


public class Circle extends Shape {

	public double radius;
	
	
	public Circle (int radius){
		super(1);
		this.radius = radius;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		double radiusSquared = radius * radius;
		double area = radiusSquared * 3.14;
		return (int) area;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return (int) radius;
	}
	
	public String toString() {
		return "The radius is: " + radius + ". The Area is : " + getArea();
	}
}
