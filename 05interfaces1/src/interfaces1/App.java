package interfaces1;

public class App {

	public static void main(String[] args) {

		Coche c1 = new Coche();

		c1.ruedas = 2;
		c1.modelo = "Porsche";

		c1.arrancar();
		
		Anfibio anf1= new Anfibio();
		
		anf1.arrancar();
		anf1.ruedas=2;
		
		
	}

}
