package model;

import java.sql.SQLException;

public class AccesoBDCoches extends AccesoBD {

	public AccesoBDCoches() throws ClassNotFoundException, SQLException {
		super(AccesoBD.DRIVER_MYSQL, "coches", "root", "");

	}

}
