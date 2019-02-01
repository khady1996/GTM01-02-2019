package eu.ensup.V4ClassesAbstraites.exception;

import java.sql.SQLException;

public class DaoException extends Exception {
	
	//public SQLException except = new SQLException();
	
	public DaoException() {
		System.out.println("Problème venant du DAO : \nVerifier l'écriture des champs");
	}
	
	public DaoException(String message) {
		System.out.println(message);
	}

}
