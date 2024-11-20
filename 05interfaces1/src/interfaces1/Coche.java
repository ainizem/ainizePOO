package interfaces1;

public class Coche extends Terrestre implements ITerrestre {

	public Coche(int ruedas) {
		super(ruedas);
	}

	public void arrancar() {
		System.out.println("arranco");
	}
	
	public void andar() {
		System.out.println("ando");
	}
}
