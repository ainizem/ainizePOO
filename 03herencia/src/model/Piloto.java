package model;

public class Piloto extends Persona{
	public String coche; 
		
	public void pilotar() {
		System.out.println("Broooom ñiii ñiii brooomn");
	}
	
	@Override
	public void saludar() {
		System.out.println("Te fundo ñiiii");
	}
	
	//Sobrecarga (varios métodos con el mismo nombre)
	public void saludar(String saludo) {
		System.out.println(saludo);
	}

}
