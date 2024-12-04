package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {

	public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
	public static final String DRIVER_GENERICO = "sun.jdbc.odbc.JdbcOdbc.Driver";

	public static void main(String[] args) {
		//Test MySQL
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
		//0. Cargar al driver
		
		Class.forName(DRIVER_MYSQL);
		
		//1. Conectar
		con = DriverManager.getConnection("jdbc:mysql://localhost/coches", "admincoches", "z");//conectar a esa base con ese usuario y con esa contraseña
		System.out.println("Conexión establecida");
		
		//2. Crear flujo(la autopista)
		st =con.createStatement();//se hace del con, que ya está creada la conexión
		
		//3. Consulta unidireccional
		st.executeUpdate("INSERT INTO coches.coches (marca, modelo, color) VALUES ('Renault', 'Megane', 'azul');");//el ante ultimo ; es pa seguir añadiendo sentencia
		System.out.println("Coche introducido correctamente");
		
		}catch(Exception e){
			System.out.println("Errror");
			
		}
	}

}
