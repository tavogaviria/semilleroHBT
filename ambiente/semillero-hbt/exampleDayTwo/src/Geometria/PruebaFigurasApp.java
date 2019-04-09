package Geometria;

public class PruebaFigurasApp {

	public static void main(String[] args) {
		
		Rectangulo rectangulo = new Rectangulo(3, 4);
		
		System.out.println(rectangulo.obtenerNombreFigura());
		System.out.println(rectangulo.calcularArea());
		System.out.println(rectangulo.calcularPerimetro());
		
		Circulo circulo = new Circulo(2);
		
		System.out.println(circulo.obtenerNombreFigura());
		System.out.println(circulo.calcularArea());
		System.out.println(circulo.calcularPerimetro());

	}

}
