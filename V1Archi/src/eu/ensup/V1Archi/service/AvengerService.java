package eu.ensup.V1Archi.service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

import eu.ensup.V1Archi.domaine.Avenger;
import fr.ensup.V1Archi.dao.AvengerDao;

public class AvengerService {
	
	AvengerDao ad = new AvengerDao(); 
	
	
	public void ajouterAvenger(Avenger avenger) {
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
	
	
	public void ComparerAvenger(Avenger avenger1, Avenger avenger2) {
		// TODO Auto-generated method stub
		
		if(avenger1.getNom() != avenger2.getNom())
			System.out.println("Vous avez 2 avengers differents");
		else
			System.out.println("Problème venant du Service :\n Mais c'est bete, c'est le meme Avenger");
		
	}

}
