package testsFonctionnels;

import jeu.*;
import cartes.*;

public class TestsTP1 {
	public static void main(String[] args) {
		Sabot sabot = new Sabot(110);
		Carte[] TestCartes = new Carte[3];
		TestCartes[0] = new Attaque(Probleme.Type.ACCIDENT, 4);
		TestCartes[1] = new Parade(Probleme.Type.ACCIDENT,4);
		TestCartes[2] = new Botte(Probleme.Type.ACCIDENT,2);
		sabot.ajouterFamilleCarte(TestCartes[0],TestCartes[1],TestCartes[2]);
		
		
		while (!sabot.estVide()) {
			System.out.println(sabot.piocher().ToString());
		}
	}
}
