package interfaces1;

public class Anfibio extends Vehiculo implements ITerrestre, IAcuatico {

	@Override
	public void navegar() {
		System.out.println("navego");
	}

	@Override
	public void andar() {
		System.out.println("ando");
	}

}
