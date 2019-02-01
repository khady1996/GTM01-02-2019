package fr.ensup.V1Archi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import eu.ensup.V1Archi.domaine.Avenger;


public class AvengerDao {

	AccesBd bd = new AccesBd(); // quand on va implementer l'interface IAvengerDao
	
	//public DaoException de = new DaoException();

	
	public void createAvenger(Avenger avenger) {
		// TODO Auto-generated method stub
		
		
		bd.seConnecter();
		try {
			
		
			String requete = "INSERT INTO `Avenger` (`nom`,`costume`,`age`,`pouvoir`) VALUES ('" + avenger.getNom()
					+ "','" + avenger.getCostume() + "','" + avenger.getAge() + "','" + avenger.getPouvoir() + "');";
			
			bd.st.executeUpdate(requete); 
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		bd.seDeconnecter();

	}

	
	public Avenger readAvengerbyname(Avenger avenger) {
		// TODO Auto-generated method stub
		Avenger av = null;
		bd.seConnecter();
		try {
			
			String requete = "SELECT * FROM `Avenger` WHERE `nom` = '" + avenger.getNom()+"';";
			ResultSet rs = bd.st.executeQuery(requete);

			while (rs.next()) {
				av = new Avenger(rs.getString("nom"), rs.getString("costume"), rs.getInt("age"), rs.getString("pouvoir"));
				
			}
				
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		bd.seDeconnecter();

		return av;
	}


	public String updateAvengerbyname(Avenger avenger, String newpower) {
		// TODO Auto-generated method stub
		int rs = 0;
		bd.seConnecter();
		try {
			String requete = "UPDATE `Avenger` SET `pouvoir` = '" + newpower + "' WHERE `nom` = '" + avenger.getNom()
					+ "';";
			rs = bd.st.executeUpdate(requete);
			if (rs != 0) {
				bd.seDeconnecter();
				return "OK.Vous avez modifié " + rs + "ligne(s)\n";
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		bd.seDeconnecter();
		return "Modification non prise en compte";
	}

	
	public void deleteAvengerbyname(Avenger avenger) {
		// TODO Auto-generated method stub

		bd.seConnecter();
		try {
			String requete = "DELETE FROM `Avenger` WHERE `nom` = '" + avenger.getNom() + "';";
			bd.st.executeUpdate(requete);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		bd.seDeconnecter();

	}

	
	public List<Avenger> getAll() {
		// TODO Auto-generated method stub
		
		List<Avenger> superheros = new ArrayList<Avenger>();

		bd.seConnecter();
		try {
			String requete = "SELECT * FROM `Avenger`;";
			ResultSet rs = bd.st.executeQuery(requete);

			while (rs.next()) {
				
				superheros.add(new Avenger(rs.getString("nom"), rs.getString("costume"), rs.getInt("age"), rs.getString("pouvoir")));
				
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		bd.seDeconnecter();

		return superheros;
	}

}
