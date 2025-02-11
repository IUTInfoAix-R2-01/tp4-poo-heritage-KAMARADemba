package YAIP6;

public class Rectangle implements GeometricObject {
	private double width;
	private double lenght;
	
	public Rectangle (double width, double lenght) {
		this.width = width;
		this.lenght = lenght;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", lenght=" + lenght + "]";
	}
	
	@Override
	public double getArea() {
		return lenght * width;
	}
	
	@Override
	public double getPerimeter() {
		return lenght * 2 + width * 2;
	}
}
