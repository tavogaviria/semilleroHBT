package ejemploDiaDos;

public class ClasePrueba {
	
	public final static int CONSTANTE=2;//CONSTANTE QUE NO CAMBIA EN TODA LA EJECUCION

	/**
	 * Este campo es valor de la clase
	 */
	private int valor;

	public ClasePrueba(int valor) {
		super();
		this.valor = valor;
	}

	public int obtenerValor() {
		return valor;
	}
	
}
