package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import cartes.*;

public class Sabot implements Iterable<Carte> {
	private Carte[] cartes;
	private int nbCartes = 0;
	private SabotIterator pioche = new SabotIterator();
	
	public Sabot(int nbMaxCartes) {
		cartes = new Carte[nbMaxCartes];
	}
	
	public Boolean estVide() {
		return nbCartes == 0;
	}
	
	public void ajouterCarte(Carte carte) {
		if (nbCartes >= cartes.length) 
			throw new IndexOutOfBoundsException("Sabot plein");
		cartes[nbCartes++] = carte;
	}
	
	public void ajouterFamilleCarte(Carte carte) {
		for (int i = 0; i < carte.getNombre(); i++) {
			ajouterCarte(carte);
		}
	}
	public void ajouterFamilleCarte(Carte... carte) {
		for (int i = 0; i < carte.length; i++) {
			ajouterFamilleCarte(carte[i]);
		}
	}

	public Carte piocher() {
		Carte c = pioche.next();
		pioche.remove();
		return c;
	}
	
	private class SabotIterator implements Iterator<Carte> {
		private int position = 0;
		private boolean hasNexted = false;
		private int nbCartesRef = nbCartes;
		@Override
		public boolean hasNext() {
			if (position >= nbCartes) 
				return false;
			else return true;
		}

		@Override
		public Carte next() {
			hasNexted = true;
			return cartes[position++];
		}
		
		@Override
		public void remove() {
			if (nbCartes < 1 || !hasNexted) throw new IllegalStateException();
			if (nbCartes != nbCartesRef) throw new ConcurrentModificationException();
			for (int i = position-1; i < nbCartes - 1; i++) {
				cartes[i] = cartes[i-1];
			}
			nbCartesRef-=1;
			nbCartes -=1;
			hasNexted = false;
		}
		
	}
	
	@Override
	public Iterator<Carte> iterator() {
		return new SabotIterator();
	}
	
}





