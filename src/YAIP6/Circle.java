package YAIP6;

public class Circle implements GeometricObject {
	protected static double radius;
	
	public Circle( double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double getPerimeter() {
		return radius * 2;
	}
	
	
	
}
