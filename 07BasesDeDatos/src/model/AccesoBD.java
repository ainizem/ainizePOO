package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class AccesoBD {

	public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
	public static final String DRIVER_GENERICO = "sun.jdbc.odbc.JdbcOdbc.Driver";
	Connection con = null;
	Statement st = null;

	// vars conexion
	String pass, bd, user;

	String tipoBD;

	public AccesoBD(String tipoBD, String pass, String bd, String user) throws ClassNotFoundException, SQLException {
		super();
		this.pass = pass;
		this.bd = bd;
		this.user = user;
		this.tipoBD = tipoBD;
		conectar();
	}

	private void desconectar() throws SQLException {
	//	st.close();
		;
	}

	private void conectar() throws ClassNotFoundException, SQLException {
		// 0. Cargar al driver

		Class.forName(tipoBD);

		// 1. Conectar
		con = DriverManager.getConnection("jdbc:mysql://localhost/coches", "root", "");// conectar a esa base con
																						// ese usuario y con esa
																						// contraseña
		System.out.println("Conexión establecida");

		// 2. Crear flujo(la autopista)
		st = con.createStatement();// se hace del con, que ya está creada la conexión

	}

	public Coche getCoche(int id) throws SQLException {

		Coche c = null;
		ResultSet rs = null;
		String sql = "SELECT *from coches where id = " + id + ";";
		rs = st.executeQuery(sql);

		while (rs.next()) {
			c = new Coche(rs.getString("marca"), rs.getString("modelo"), rs.getString("color"));

		}
		return c;
	}

}
