package HerançaEinterface;

import MetodosAbstract.Color;

public class TesteHerançaInterface {
	public static void main(String[] args) {

		AbstractForma s1 = new Circulo(Color.preto, 2.0);
		AbstractForma s2 = new Retangulo(Color.azul, 3.0, 4.0);

		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}
}
