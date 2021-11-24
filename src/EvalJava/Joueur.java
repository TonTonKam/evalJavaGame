package EvalJava;

import java.util.Random;

public class Joueur {
	
	//attributs
	private String nom;
	private int sante, force, experience;
	private Arme arme;
	Random rand = new Random();
	
	//constructor
	public Joueur(String nom) {
		this.nom = nom;
		this.force = randomForce();
		this.arme = changerArme();
		//valeur de base
		this.sante = 10;
		this.experience = 1;
		System.out.println("*Presentation*");
	}
	
	public Joueur(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.arme = changerArme();
		
		//valeur de base
		this.sante = 10;
		this.experience = 1;
		System.out.println("*Presentation*");
	}
	
	public Joueur(String nom, int force, Arme arme) {
		this.nom = nom;
		this.force = force;
		this.arme = arme;
		
		//valeur de base
		this.sante = 10;
		this.experience = 1;
		System.out.println("*Presentation*");
	}
	
	//fonctions	
	//attaquer un autre joueur
	public void attaquerJoueur(Joueur joueur) {
		int resultatCombat1 = 0, resultatCombat2 = 0;
		resultatCombat1 = this.force * this.sante * this.experience * this.arme.getPuissance();
		resultatCombat2 = joueur.force * joueur.sante * joueur.experience * joueur.arme.getPuissance();
		if(resultatCombat1 > resultatCombat2) {
			this.force += 1;
			joueur.sante -= 1;
			System.out.println("Le resultat de la BAGARRE est de "+	resultatCombat1 + " pour "+ this.nom + " et "+ resultatCombat2 +" pour "+joueur.nom 
					+"\n" +this.nom + " gagne +1 de force et passe a "+ this.force +", tandis que "
					+ joueur.nom + ", perde -1 de vie, il passe a "+ joueur.sante +". \n ");
			this.changerArme();
			joueur.changerArme();
		}
		else if(resultatCombat1 < resultatCombat2){
			joueur.force += 1;
			this.sante -= 1;
			System.out.println("Le resultat de la BAGARRE est de "+	resultatCombat1 + " pour "+ this.nom + " et "+ resultatCombat2 +" pour "+joueur.nom 
					+ " a un resultat de "+ resultatCombat2 +"\n" +joueur.nom + " gagne +1 de force et passe a "+ joueur.force +", tandis que "
					+ this.nom + ", perde -1 de vie, il passe a "+ this.sante +". \n ");
			joueur.changerArme();
			this.changerArme();
		}else {
			this.experience += 1;
			joueur.experience += 1;
			System.out.println("Les 2 jouerus gagne +1 d'experience, "+ this.nom +" passe a "+ this.experience + " et " 
					+ joueur.nom + " passe a "+ joueur.experience);
			this.changerArme();
			joueur.changerArme();
		}
	}

	//changer arme
	public  Arme changerArme() {
		int max = 5, min = 0, resul = 0;
		resul = rand.nextInt((max - min) + 1) + min;
		
		switch (resul) {
		case 0:
			Arme epee = new Arme("samurai", 3, EType.EPEE);
            System.out.println(this.nom +" ramasse une EPEE. \n");
            return this.setArme(epee);
                
        case 1:
        	Arme couteau = new Arme("Assassin", 2, EType.COUTEAU);
            System.out.println(this.nom +" ramasse un COUTEAU. \n");
            return this.setArme(couteau);
                     
        case 2:
        	Arme masse = new Arme("Tailleur de pierre", 4, EType.MASSE);
            System.out.println(this.nom +" ramasse une MASSE. \n");
            return this.setArme(masse);
            
        case 3:
        	Arme pistolet = new Arme("Desert Eagle", 6, EType.PISTOLET);
        	System.out.println(this.nom +" ramasse une PISTOLET. \n");
        	return this.setArme(pistolet);
                    
        case 4:
        	Arme arc = new Arme("guillaumeTell", 5, EType.ARC);
            System.out.println(this.nom +" ramasse un ARC. \n");
            return this.setArme(arc);
            
        case 5:
        	//etre desarmer
        	Arme mainNue = new Arme("main", 1, EType.MAIN);
        	System.out.println(this.nom +" n'avez pas d'arme, il se batte a MAINS NUE. \n");
        	return this.setArme(mainNue);
            
        default:
            System.out.println("Vous ramassez rien.");
            return arme;
		}
	}
	
	public int randomForce() {
		int max = 10, min = 5;
		return rand.nextInt((max - min) + 1) + min;
	}

	//getter & setter
	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public Arme getArme() {
		return arme;
	}

	public Arme setArme(Arme arme) {
		return this.arme = arme;
	}

	//toString
	@Override
	public String toString() {
		if(this.arme.typeArme == arme.getTypeArme().MAIN) {
			return "Je m'appelle " + nom + ", j'ai une sante de " + sante + ", j'ai une force de " + force +
					", mon experience est de " + experience + ", je possede pas d'arme, je me bat avec "
					+ arme ;
		}else {
			return "Je m'appelle " + nom + ", j'ai une sante de " + sante + ", j'ai une force de " + force +
					", mon experience est de " + experience + ", je possede comme arme "
					+ arme ;
		}
	}
	
	
	
}
