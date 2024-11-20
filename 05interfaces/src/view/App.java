package view;

import model.Drone;
import model.IAeronave;
import model.IEspacial;

/*
 * INTERFACES
 * Pueden ser public o package
 * Se usa implements, en lugar de extends como en herencia
 * Las interfaces, entre ellas, SI QUE HACEN EXTENDS
 * Todos sus métodos son public abstract, y los atributos final static(como es static puedo acceder al atributo sin hacer objetos, ya que lo comparten todos los objetos)
 *
 */
public class App {

	public static void main(String[] args) {
		Drone d = new Drone();
		d.volar();
		d.orbitar();

		// COMPORTAMIENTOS DE VEHICULO ESPACIAL
		IEspacial dEspacial = d; // le estoy diciendo que ese dron que se comporte como un vehiculo espacial
									// concretamente
		dEspacial.orbitar();

		// COMPORTAMIENTOS DE VEHICULO ESPACIAL
		IAeronave dAeronave = d; // le estoy diciendo que ese dron que se comporte como una aeronave
									// concretamente
		dAeronave.volar();

		// System.out.println(d.velocidad); esto no se puede porque es ambiguo, ya que
		// hay dos velocidades en las interfaces

	}

}
