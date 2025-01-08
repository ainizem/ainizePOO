package view;

import java.sql.SQLException;

import model.AccesoBD;
import model.AccesoBDCoches;
import model.Coche;

public class App {

	public static void main(String[] args) {

		try {
			AccesoBD bd = new AccesoBDCoches(); //si ya tenemos creado eso, aquí queda mas limpio
		Coche cFerrari= bd.getCoche(1);
		System.out.println(cFerrari);
		
		
		
		
		
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error al conectar con la bd");
			e.printStackTrace();
		}

	}

}
