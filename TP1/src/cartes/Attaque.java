package cartes;

public class Attaque extends Bataille {

	public Attaque(Type t, int nombre) {
		super(t, nombre);
	}

	public String ToString() {
		switch (getType()) {
		case FEU: {
			return "FeuRouge";
		}
		case ESSENCE: {
			return "PanneEssence";
		}
		case CREVAISON: {
			return "Crevaison";
		}
		case ACCIDENT: {
			return "Accident";
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
		}
	}
	
}
