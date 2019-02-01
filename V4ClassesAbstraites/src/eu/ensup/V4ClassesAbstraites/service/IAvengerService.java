package eu.ensup.V4ClassesAbstraites.service;

import java.sql.SQLException;
import java.util.List;

import eu.ensup.V4ClassesAbstraites.dao.AvengerDao;
import eu.ensup.V4ClassesAbstraites.domaine.Avenger;
import eu.ensup.V4ClassesAbstraites.exception.ServiceException;

public interface IAvengerService {
	
	public void ajouterAvenger(Avenger avenger) throws Exception;
	public Avenger recupererAvenger(Avenger avenger);
	public void modifierAvenger(Avenger avenger, String pouvoir);
	public void supprimerAvenger(Avenger avenger);
	public List<Avenger> recupererTout();
	public void ComparerAvenger(Avenger avenger1, Avenger avenger2)throws ServiceException;
	
}
