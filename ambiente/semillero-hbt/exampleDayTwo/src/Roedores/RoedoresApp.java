package Roedores;

public class RoedoresApp {

	public static void main(String[] args) {
		Roedores raton = new Raton("Raton");
		Roedores gerbo = new Gerbo("Gerbo");
		Roedores hamster = new Hamster("Hamster");
		
		Roedores[] roedor = new Roedores[3];
		roedor[0]=raton;
		roedor[1]=gerbo;
		roedor[2]=hamster;
		
		for (Roedores roedores : roedor) {
			System.out.println(roedores.getNombre());
			System.out.println(roedores.comer());
			System.out.println("--");
		}
	}

}
