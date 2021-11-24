package EvalJava;

import java.util.Random;

public class Test {
	
	//attributs
	static Random rand = new Random();
	
	public static void main(String[] args) {
		StartGame startGame = new StartGame();
		/*
		//pour utiliser le enum il faut appeler la classe enum dans le constructeur
		// l'utilisateur choisi son nom, defini son arme de depart, la force est en random ou peut etre choisi par l'utilisateur
		Joueur player1Def3 = new Joueur("TonKam", randomForce(), EType.MAIN);
		Joueur player2Def3 = new Joueur("TonKar", randomForce(), EType.MAIN);
		
		//l'utilisateur choisi son nom, defini la force, elle est en random ou peut etre choisi par l'utilisateur l'arme est aleatoire
		Joueur player1Def2 = new Joueur("TonKam", randomForce());
		Joueur player2Def2 = new Joueur("TonKar", randomForce());
		
		System.out.println(player1);
		player1.getArme().armeUsed();
		
		*/
		//l'utilisateur choisi son nom, le reste est aleatoire
		Joueur player1 = new Joueur("Zelda");
		Joueur player2 = new Joueur("Mario");
		
		//System.out.println(player1 + " \n "+ player2);
		startGame.start(player1, player2);
	}

	//fonctions
	public static int randomForce() {
		int max = 10, min = 5;
		return rand.nextInt((max - min) + 1) + min;
	}
	
}
