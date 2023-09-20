package cartes;

public class Botte extends Probleme {

	public Botte(Type t, int nombre) {
		super(t, nombre);
		// TODO Auto-generated constructor stub
	}
	
	public String ToString() {
		switch (getType()) {
		case FEU: {
			return "VehiculePrioritaire";
		}
		case ESSENCE: {
			return "CiterneEssence";
		}
		case CREVAISON: {
			return "Increvable";
		}
		case ACCIDENT: {
			return "AsDuVolant";
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
		}
	}

}
