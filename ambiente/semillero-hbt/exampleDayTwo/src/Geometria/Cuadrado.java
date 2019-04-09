package Geometria;

public class Cuadrado extends Figura {

	public Cuadrado(int lados,String nombre) {
		setNombre(nombre);
	}

	@Override
	public int dibujar() {
		return 4;
	}
}
