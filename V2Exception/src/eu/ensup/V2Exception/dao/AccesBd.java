package eu.ensup.V2Exception.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import eu.ensup.V2Exception.exception.DaoException;

public class AccesBd {

	public Connection cn;
	public Statement st;

	// TODO Connexion à la BD

	public Connection seConnecter() {
		
		//

		//System.out.println("Connexion en cours...");

		String url = "jdbc:mysql://localhost/Avenger?verifyServerCertificate=false&useSSL=true";
		String login = "phpmyadmin";
		String passwd = "jtmaman29370";

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Création d'un statement
			st = cn.createStatement();

			//System.out.println("Connecté.");
		}

		catch (SQLException e) {
			String msg = " Verifier vos identifiants pour la connexion à la base !!";
			new DaoException(msg);
			
		} catch (ClassNotFoundException e) {
			
			String msg = " Verifier le chargement de votre driver !!";
			new DaoException(msg);
		}

		return cn;
	}

	// TODO Déconnexion à la BD

	public void seDeconnecter() {
		try {
			cn.close();
			st.close();
			//System.out.println("Déconnecté. \nBye ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
