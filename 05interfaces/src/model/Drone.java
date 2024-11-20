package model;

public class Drone implements IAeronave, IEspacial{

	@Override
	public void volar() {
		System.out.println("Volando voy... ... ..");
	}

	@Override
	public void orbitar() {
System.out.println("Orbitando");		
	}

	
	
}
