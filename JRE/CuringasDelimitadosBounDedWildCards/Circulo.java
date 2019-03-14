package CuringasDelimitadosBounDedWildCards;

public class Circulo implements Shape {

	private double radius;

	public Circulo(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}