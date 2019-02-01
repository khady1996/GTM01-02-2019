package eu.ensup.V1Archi.presentation;

import eu.ensup.V1Archi.domaine.Avenger;
import eu.ensup.V1Archi.service.AvengerService;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AvengerService service = new AvengerService();

		Avenger av1 = new Avenger("kh", "vert", 22, "peut se rendre invisible");
		Avenger av2 = new Avenger("iron", "noir", 26, "peut disparaitre");

		service.ComparerAvenger(av1, av1);
		// service.ajouterAvenger(av2);
//		service.modifierAvenger(av2, "peut se déplacer dans le temps");
//		System.out.println("Afficher 1 avenger : ");
//		service.recupererAvenger(av1);
//		//service.supprimerAvenger(av1);
		System.out.println("Afficher tous les avengers : ");
		service.recupererTout();

	}

}
