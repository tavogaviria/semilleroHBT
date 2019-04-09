package Geometria;

public class Circulo extends Figura implements IFigura {
	
	public int radio;
	public double PI = 3.1416;

	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	@Override
	public int dibujar() {
		return 0;
	}

	@Override
	public String obtenerNombreFigura() {
		return "Circulo";
	}

	@Override
	public double calcularArea() {
		return this.PI*this.radio;
	}

	@Override
	public double calcularPerimetro() {
		return (this.PI*this.radio)*2;
	}

}
