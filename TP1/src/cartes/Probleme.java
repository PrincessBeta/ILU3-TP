package cartes;

public abstract class Probleme extends Carte {
	public enum Type{FEU, ESSENCE, CREVAISON, ACCIDENT}
	protected Type type;
	public Probleme(Type t, int nombre) {
		super(nombre);
		type = t;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

}
