package eu.ensup.V4ClassesAbstraites.dao;

import java.sql.SQLException;
import java.util.List;

import eu.ensup.V4ClassesAbstraites.domaine.Avenger;
import eu.ensup.V4ClassesAbstraites.exception.DaoException;

public abstract class AbsAvangerDao implements IAvengerDao{
	
	public AccesBd bd = new AccesBd();
	

}
