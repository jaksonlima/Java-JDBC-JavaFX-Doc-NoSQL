package CuringasDelimitadosBounDedWildCards;

import java.util.ArrayList;
import java.util.List;

public class TesteDelimiter {
	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Retangulo(3.0, 2.0));
		myShapes.add(new Circulo(2.0));

		List<Circulo> myCircles = new ArrayList<>();
		myCircles.add(new Circulo(2.0));
		myCircles.add(new Circulo(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
