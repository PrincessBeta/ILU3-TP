package cartes;

public class Parade extends Bataille {

	public Parade(Type t, int nombre) {
		super(t, nombre);

	}

	public String ToString() {
		switch (getType()) {
		case FEU: {
			return "FeuVert";
		}
		case ESSENCE: {
			return "Essence";
		}
		case CREVAISON: {
			return "RoueDeSecours";
		}
		case ACCIDENT: {
			return "Reparations";
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
		}
	}
	
}
