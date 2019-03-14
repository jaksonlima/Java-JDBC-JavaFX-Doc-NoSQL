package MetodosAbstract;

public abstract class Forma {

	private Color color;
	
	public Forma() {
	}
	
	public Forma(Color cor) {
		this.color = cor;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract Double area();

}
