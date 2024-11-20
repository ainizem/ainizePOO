package interfaces1;

public class Barco extends Acuatico implements IAcuatico {

	public Barco(double eslora) {
		super(eslora);
	}

	public void arrancar() {
System.out.println("arranco");
	}
	
	public void navegar() {
		System.out.println("navego");

	}

}
