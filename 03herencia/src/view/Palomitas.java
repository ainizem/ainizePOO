package view;

import model.Futbolista;
import model.Persona;
import model.Piloto;


public class Palomitas {

	public static void main(String[] args) {
		
		
		Persona p = new Persona();
		Futbolista f = new Futbolista();
		Piloto pi = new Piloto();
		
		f.saludar(); //Polimorfismo (mismo método diferentes clases)
		pi.saludar();
	
		
		Persona personita = new Futbolista();
		//Futbolista fut = new Persona();
	
	}

}
