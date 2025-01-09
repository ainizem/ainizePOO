package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class App {

	public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
	public static final String DRIVER_GENERICO = "sun.jdbc.odbc.JdbcOdbc.Driver";

	public static void main(String[] args) {
		// Test MySQL

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// 0. Cargar al driver

			Class.forName(DRIVER_MYSQL);

			// 1. Conectar
			con = DriverManager.getConnection("jdbc:mysql://localhost/coches", "root", "");// conectar a esa base con
																							// ese usuario y con esa
																							// contraseña
			System.out.println("Conexión establecida");

			// 2. Crear flujo(la autopista)
			st = con.createStatement();// se hace del con, que ya está creada la conexión

			// 3. Consulta unidireccional
			// st.executeUpdate("INSERT INTO coches.coches (marca, modelo, color) VALUES
			// ('Renault', 'Megane', 'azul');");//el ante ultimo ; es pa seguir añadiendo
			// sentencia
			// System.out.println("Coche introducido correctamente");
			// 3.2 Consulta bidireccional(el ejemplo no es seguro)
			String sql = "SELECT *from coches";
			rs = st.executeQuery(sql);
			mostrarRegistros(rs);

		} catch (Exception e) {
			System.out.println("Errror");

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
