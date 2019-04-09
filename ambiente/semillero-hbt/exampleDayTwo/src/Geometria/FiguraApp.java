package Geometria;

public class FiguraApp {

	public static void main(String[] args) {
		Figura triangulo = new Triangulo(31,"Isoceles");
		Figura circulo = new Ciculo(0,"Grande");
		Figura cuadrado = new Cuadrado(4, "Rectangulo");
		
		Figura[] figuras = new Figura[3];
		figuras[0]=triangulo;
		figuras[1]=circulo;
		figuras[2]=cuadrado;
		
		for (Figura figurita : figuras) {
			System.out.println(figurita.getNombre());
			System.out.println(figurita.dibujar());
			System.out.println("--");
		}
		

	}

}
