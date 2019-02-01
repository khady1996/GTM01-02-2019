package eu.ensup.V2Exception.presentation;

import java.sql.SQLException;

/*import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFenetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avengers kn = new Avengers("InvibleWoman", "vert", 22, "peut se rendre invisible");
		Avengers yc = new Avengers("batman", "noir", 32, "peut se déplacer dans le temps");
		
		List<Avengers> superheros = new ArrayList<Avengers>();
		superheros.add(0, kn);
		superheros.add(1, yc);
		
		JFrame fenetre = new JFrame("Ma Première Fenêtre");
		JMenuBar menubar = new JMenuBar();
		JMenu menu1 = new JMenu("Fichier");
		JMenu menu2 = new JMenu("Editer");
		JMenu menu3 = new JMenu("Aide");
		
		JPanel content = new JPanel();
		JPanel pan = new JPanel();
		
		
		JMenuItem sousmenu1 = new JMenuItem("Avengers");
		JMenuItem sousmenu2 = new JMenuItem("Personne");
		
		pan.add(new JTextField(superheros.toString()));
		
		menu1.add(sousmenu1);
		menu1.add(sousmenu2);
		
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
		
		content.add(pan);
		fenetre.getContentPane().add(content, BorderLayout.CENTER);
		
		//fenetre.add(comp);
		
		
		
		
		fenetre.setSize(500, 700);
		fenetre.setLocationRelativeTo(null);
		fenetre.setJMenuBar(menubar);
		fenetre.setVisible(true);
		

	}

}*/


import eu.ensup.V2Exception.domaine.Avenger;
import eu.ensup.V2Exception.service.AvengerService;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		AvengerService service = new AvengerService();

		Avenger av1 = new Avenger("aziz", "jaune", 22, "main d'acier");
		// Avenger av2 = new Avenger("iron", "noir", 26, "peut disparaitre");

		//service.ComparerAvenger(av1, av1);
		//service.ajouterAvenger(av1);
//		service.modifierAvenger(av2, "peut se déplacer dans le temps");
//		System.out.println("Afficher 1 avenger : ");
// service.recupererAvenger(av1);
//		//service.supprimerAvenger(av1);
	System.out.println("Afficher tous les avengers : ");
	service.recupererTout();

//		service.ajouterListeAvengers(av1);
//		service.ajouterListeAvengers(av2);
//		
	}

}
