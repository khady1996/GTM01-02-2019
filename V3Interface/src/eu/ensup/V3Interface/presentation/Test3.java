package eu.ensup.V3Interface.presentation;

import java.sql.SQLException;


import eu.ensup.V3Interface.domaine.Avenger;
import eu.ensup.V3Interface.service.AvengerService;

public class Test3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		AvengerService service = new AvengerService();

		Avenger av1 = new Avenger("cp", "jaune", 22, "peut se rendre invisible");
		Avenger av2 = new Avenger("iron", "noir", 26, "peut disparaitre");

		service.ComparerAvenger(av1, av1);
//		service.modifierAvenger(av2, "peut se déplacer dans le temps");
//		System.out.println("Afficher 1 avenger : ");
//		service.recupererAvenger(av1);
//		//service.supprimerAvenger(av1);
		System.out.println("Afficher tous les avengers : ");
		service.recupererTout();

//		service.ajouterListeAvengers(av1);
//		service.ajouterListeAvengers(av2);
	}

}
