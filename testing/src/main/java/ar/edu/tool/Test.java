package ar.edu.tool;

public class Test {

	public Test() {

		super();
	}

	/**
	 * 
	 * @param texto
	 */
	public void escribir(final String texto) {

		if (texto == null) {
			System.out.println("El texto esta vacio para escribir");
		} else {
			System.out.println("El texto no esta vacio");
		}
	}

	/**
	 * 
	 * @param texto
	 */
	public void leer(final String texto) {

		if (texto == null) {
			System.out.println("El texto esta vacio para leer");
		} else {
			System.out.println("El texto no esta vacio");
		}
	}

}
