package Geometria;

public class Rectangulo extends Figura implements IFigura {
	
	public int base;
	public int altura;

	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public int dibujar() {
		return 0;
	}

	@Override
	public String obtenerNombreFigura() {
		return "Rectangulo";
	}

	@Override
	public double calcularArea() {
		return this.base*this.altura;
	}

	@Override
	public double calcularPerimetro() {
		return (this.base*this.altura)*2;
	}

}
