
public class Ability {
	private final String name;
	private final String type;
	private int dots = 0;
	private String specialty = "None";
	
	// ***CONSTRUCTORS***
	public Ability(String name) {
		this.name = name;
		this.type = Abilities.getType(name);
		this.dots = 0;
	}
	public Ability(String name, int startDots) {
		this.name = name;
		this.type = Abilities.getType(name);
		this.dots = startDots;
	}
	public Ability(String name, int startDots, String startSpec) {
		this.name = name;
		this.type = Abilities.getType(name);
		this.dots = startDots;
		this.specialty = startSpec;
	}
	void printInfo() {
		System.out.println("");
		System.out.println("Type: " + this.type);
		System.out.println("Name: " + this.name);
		System.out.println("Dots: " + this.dots);
		System.out.println("Specialty: " + this.specialty);
	}
	
	// ***GETTERS***
	int dots() {
		return this.dots;
	}
	String specialty() {
		return this.specialty;
	}
	String type() {
		return this.type;
	}
	String name() {
		return this.name;
	}
	
	// ***SETTERS***
	void addDot() {
		this.dots++;
	}
	void removeDot() {
		this.dots--;
	}
	void specialize(String newSpecialty) {
		this.specialty = newSpecialty;
	}

}
