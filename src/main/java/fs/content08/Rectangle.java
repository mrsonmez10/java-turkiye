package fs.content08;

/**
 * This class calculates the area and perimeter of a rectangle.
 */
public class Rectangle {
	private double length;
	private double width;

	/**
	 * Constructor for the Rectangle class.
	 * @param length The length of the rectangle
	 * @param width The width of the rectangle
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	/**
	 * Calculates the area of the rectangle.
	 * @return The area of the rectangle
	 */
	public double calculateArea() {
		return length * width;
	}

	/**
	 * Calculates the perimeter of the rectangle.
	 * @return The perimeter of the rectangle
	 */
	public double calculatePerimeter() {
		return 2 * (length + width);
	}
}
