package cartes;

public class Borne extends Carte {
	private int km;
	public Borne(int km, int nombre) {
		super(nombre);
		this.km = km;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}

	public String toString() {
		return String.valueOf(km)+" Bornes";
	}

}
