package HerançaEinterface;

import MetodosAbstract.Color;

public abstract class AbstractForma implements Forma {

	private Color color;

	public AbstractForma(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
