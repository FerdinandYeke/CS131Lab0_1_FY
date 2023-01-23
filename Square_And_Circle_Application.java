/**
 * 
 */

/**
 * @author ferdi
 *
 */
public class Square_And_Circle_Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*This Imports the square and circle class and creates
		 * a new instance of them
		 */
		
		Square shape1 = new Square(3);
		Circle shape2 = new Circle(5);
		
		System.out.println("Shape 1 is a square, and its size is 3");
		System.out.println("Shape 2 is a circle, and its radius is 5");
		
		System.out.println("The area of shape 1 is: "+shape1.area());
		System.out.println("The area of shape 2 is: "+shape2.area());
		
		
	}

}
