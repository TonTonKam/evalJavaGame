package EvalJava;

import java.util.Random;

public class StartGame {
	Random rand = new Random();
	Joueur joueur;

	public void start(Joueur j1, Joueur j2) {
		boolean resultB = true;
		while(resultB) {
			System.out.println(j1 + " \n "+ j2);
			j1.attaquerJoueur(j2);
			
			if(j1.getSante() == 0) {
				System.out.println(j1.getNom() + " a perdu, Victoire a "+ j2.getNom());
				resultB = false;
			}
			else if(j2.getSante() == 0) {
				System.out.println(j2.getNom() + " a perdu, Victoire a "+ j1.getNom());
				resultB = false;
			
			}
		}
	}
	
}
