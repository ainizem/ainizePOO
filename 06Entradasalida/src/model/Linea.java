package model;

public class Linea {
	
	int numLinea;
	String texto;
	
	public Linea(int numLinea, String texto) { //
		super();
		this.numLinea = numLinea;
		this.texto = texto;
	} 
	
	//mostrar la linea 
	public void imprimirLinea() {
			System.out.println(this.numLinea+": "+ this.texto);
		}
		
	}
	


