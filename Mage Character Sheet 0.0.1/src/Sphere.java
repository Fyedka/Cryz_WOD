
public class Sphere {
	private final String name;
	private int dots = 0;
	private String focus = "Unspecified";
	private String specialty = "None";
	
	// ***CONSTRUCTORS***
	public Sphere(String name) {
		this.name = name;
		this.dots = 0;
	}
	public Sphere(String name, int startDots) {
		this.name = name;
		this.dots = startDots;
	}
	public Sphere(String name, int startDots, String startFocus) {
		this.name = name;
		this.dots = startDots;
		this.focus = startFocus;
	}

	// ***GETTERS***
	String name() {
		return this.name;
	}
	int dots() {
		return this.dots;
	}
	String focus() {
		return this.focus;
	}
	String specialty() {
		return this.specialty;
	}
	
	// ***SETTERS***
	void deleteFocus() {
		this.focus = "Not required";
	}
	void specifyFocus(String newFocus) {
		if(this.focus.equals("Unspecified")) {
			this.focus = newFocus;
		}
	}
	void changeFocus(String newFocus) {
		this.focus = newFocus;
	}
	void specialize(String newSpecialty) {
		this.specialty = newSpecialty;
	}
}
