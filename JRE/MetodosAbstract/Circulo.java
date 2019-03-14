package MetodosAbstract;

public class Circulo extends Forma {

	private Double raios;

	public Circulo() {
		super();
	}

	public Circulo(Color cor, Double raios) {
		super(cor);
		this.raios = raios;
	}

	public Double getRaios() {
		return raios;
	}

	public void setRaios(Double raios) {
		this.raios = raios;
	}

	@Override
	public Double area() {
		return Math.PI * raios * raios;
	}

}
