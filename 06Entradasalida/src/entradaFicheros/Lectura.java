package entradaFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import model.Linea;

public class Lectura {

	public static ArrayList<Linea> leerFichero(String ruta) throws Exception { // static para poder llamar al metodo sin
																				// crear un objeto
		ArrayList<Linea> lineas = new ArrayList<Linea>();
		// FileReader: para leer caracter a caracter
		// BufferedReader: linea a linea
		// bf.readLine(); (esta es la manera paso a paso)

		try (BufferedReader buffer = new BufferedReader(new FileReader(ruta))) {// como es resource, se pone lo que
			String texto;			// quieres que catch en el parentesis
			int contadorLineas=0;
			
			while((texto= buffer.readLine())!= null) { //en la varibale texto guardo la linea
				//guardar datos
				lineas.add(new Linea(contadorLineas, texto));
			}

		}

		return null;

	}

}
