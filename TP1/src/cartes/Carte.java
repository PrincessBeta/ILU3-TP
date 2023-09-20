package cartes;

public abstract class Carte {
	protected int nombre;

	public Carte(int nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String ToString() {
		return "stringCarte";
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
}
