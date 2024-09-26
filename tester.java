package labs;


public class tester {
	
	public static void main(String[] args) {
		
		//rectangle tests
		
		Rectangle test1 = new Rectangle(10, 5);
		System.out.println(test1.getArea());
		Rectangle test2 = new Rectangle(10, 5);
		System.out.println(test2.getArea());
		
		//circle tests
		
		Circle test3 = new Circle(10);
		System.out.println(test3.getArea());
		test3.setRadius(102);
		System.out.println(test3.getRadius());
		
		Circle test4 = new Circle(10);
		System.out.println(test4.getArea());
		test4.setRadius(102);
		System.out.println(test4.getRadius());
		
		//Ellipse tests
		
		Ellipse test5 = new Ellipse(10, 20);
		System.out.println(test5.getArea());
		
		Ellipse test6 = new Ellipse(15, 30);
		System.out.println(test6.getArea());
		
		//ToString tests
		
		Rectangle test7 = new Rectangle(6, 3);
		System.out.println(test7.toString());
		
		Circle test8 = new Circle(15);
		System.out.println(test8.toString());
		
		Ellipse test9 = new Ellipse(15, 30);
		System.out.println(test9.toString());
		
	}
}
