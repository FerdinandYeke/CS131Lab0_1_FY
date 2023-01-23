/**
 * 
 */

/**
 * @author ferdi
 *
 */
public class Circle {

	private double radius;
	
	//default constructor
	public Circle()
	{
		this.radius = radius;
	}
	//Default constructor concludes here
	
	//Preferred constructor
	public Circle(double radius)
	{
		this.radius = radius;
	}
	//Preferred constructor concludes here
	
	public void setRadius(double radius) //This method sets up the radius
	{
		this.radius = radius;
	}
	//Set radius method concludes here
	
	public double getRadius() //This method gets and the radius
	{
		return radius;
	}
	//Get radius method concludes here
	
	public double area() /*The Area method calculates the given radius
						of the circle with the area formula, then stores
						the result in the area variable
						*/
	{
		double area = Math.PI * Math.pow(radius, 2);
		return area; 
	}
	//Area method ends here
}
