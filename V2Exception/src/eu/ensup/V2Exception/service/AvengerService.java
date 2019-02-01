package eu.ensup.V2Exception.service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

import eu.ensup.V2Exception.dao.AvengerDao;
import eu.ensup.V2Exception.domaine.Avenger;
import eu.ensup.V2Exception.exception.DaoException;
import eu.ensup.V2Exception.exception.ServiceException;

public class AvengerService{
	
	AvengerDao ad = new AvengerDao(); 
	
	
	public void ajouterAvenger(Avenger avenger) throws Exception {
		ad.createAvenger(avenger);
	}
	
	public Avenger recupererAvenger(Avenger avenger) {
		System.out.println(ad.readAvengerbyname(avenger));
		return ad.readAvengerbyname(avenger);
	}
	
	public void modifierAvenger(Avenger avenger, String pouvoir) {
		
		ad.updateAvengerbyname(avenger, pouvoir);
		
	}
	
	public void supprimerAvenger(Avenger avenger) {
		
		ad.deleteAvengerbyname(avenger);
	}
	
	public List<Avenger> recupererTout() {
		
		System.out.println(ad.getAll());
		return ad.getAll();
	}
	
	
	public void ComparerAvenger(Avenger avenger1, Avenger avenger2) throws ServiceException {
		// TODO Auto-generated method stub
		
		if(avenger1.getNom() != avenger2.getNom())
			System.out.println("Vous avez 2 avengers differents");
		else
			new ServiceException();
		
	}
	
	
	
	
	



	List<Avenger> maListeAvengers = new ArrayList<Avenger>();

	// 1- Affichage

	public JComboBox afficherListeAvengers() {

		JComboBox List = new JComboBox(maListeAvengers.toArray());

		return List;
	}

	// 2- Insertion

	public void ajouterListeAvengers(Avenger av) {

		maListeAvengers.add(av);
	}

	// 3- Modification
	public Avenger modifierListeAvengers(int index, Avenger av) {

		Avenger a = maListeAvengers.set(index, av);

		return a;

	}

	// 4- Suppression
	public void supprimerListeAvengers() {
		maListeAvengers.clear();
	}
	

}
