

public class Attribute {	
	private final String name;
	private final String type;
	private int dots = 1;
	private String specialty = "None";
	
	// ***CONSTRUCTORS***
	public Attribute(String name){
		this.name = name;
		this.type = Attributes.getType(name);
	}
	public Attribute(String name, int startDots){
		this.name = name;
		this.dots = startDots;
		this.type = Attributes.getType(name);
	}
	public Attribute(String name, int startDots, String startSpec){
		this.name = name;
		this.dots = startDots;
		this.specialty = startSpec;
		this.type = Attributes.getType(name);
	}
	
	// ***GETTERS***
	String name() {
		return this.name;
	}
	String type() {
		return this.type;
	}
	int dots() {
		return this.dots;
	}
	String specialty() {
		return this.specialty;
	}
	void printInfo() {
		System.out.println("");
		System.out.println("Type: " + this.type);
		System.out.println("Name: " + this.name);
		System.out.println("Dots: " + this.dots);
		System.out.println("Specialty: " + this.specialty);
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
