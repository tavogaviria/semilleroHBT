package Geometria;

public class Triangulo extends Figura {

	public Triangulo(int lados,String nombre) {
		setNombre(nombre);
	}

	@Override
	public int dibujar() {
		return 3;
	}
}
