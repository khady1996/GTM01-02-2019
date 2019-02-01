package eu.ensup.V3Interface.dao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JComboBox;

import eu.ensup.V3Interface.domaine.Avenger;
import eu.ensup.V3Interface.exception.DaoException;

public interface IAvengerDao {
	
	public void createAvenger(Avenger avenger) throws DaoException;  // Create
	public Avenger readAvengerbyname(Avenger avenger); // read
	public String updateAvengerbyname(Avenger avenger, String newpower); // update
	public void deleteAvengerbyname(Avenger avenger); // delete
	public List<Avenger> getAll();
	
}
