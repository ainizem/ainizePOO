package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import model.AccesoBD;
import model.AccesoBDCoches;
import model.Coche;

public class App {

	public static void main(String[] args) {

		try {
			AccesoBD bd = new AccesoBDCoches(); //si ya tenemos creado eso, aquí queda mas limpio
		Coche cFerrari= bd.getCoche(1);
		System.out.println(cFerrari.modelo);
		
		
		
		
		
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error al conectar con la bd");
			e.printStackTrace();
		}

	}
	
	
	private static void mostrarRegistros(ResultSet rs) throws SQLException {
		// cotillear el resultset mediante el ResultSetMetadata(metadata es para saber
		// por ejemplo el nombre de la tabla)
		ResultSetMetaData rsm = (ResultSetMetaData) rs.getMetaData();
		int numColumnas = rsm.getColumnCount();
		System.out.println(numColumnas);

		// imprimir cabecera
		String cabecera = "";
		for (int i = 0; i < numColumnas; i++) {
			cabecera = rsm.getColumnName(i) + " | ";
		}
		System.out.println(cabecera);

		// Imprimir cuerpo

		String linea = "";
		while (rs.next()) {
			for (int i = 1; i <= numColumnas; i++) {
				linea += rs.getString(i) + " | ";
			}}
		System.out.println(linea);

	}
	
	
	
	

}
