
public class Background {
	private final String name;
	private int dots = 0;
	private String genDesc = ""; // general description field
	private String dotDesc = ""; // describes the practical meaning of the # of dots
	private final String bookDesc = ""; // remove initialization here after defining in constructor
	
	
	public Background(String name) {
		this.name = name;
	}
	public Background(String name, int dots) {
		this.name = name;
		this.dots = dots;
		/* Modify this later to automatically add the general description and the description
		 * based on the dots level, provided the assigned name is one of the predefined
		 * backgrounds in the book.
		 */
	}
	public Background(String name, int dots, String genDesc) {
		this.name = name;
		this.dots = dots;
		this.genDesc = genDesc;
	}

	// ***GETTERS***
	public String name() {
		return this.name;
	}
	public int dots() {
		return this.dots;
	}
	public String genDesc() {
		return this.genDesc;
	}
	public String dotDesc() {
		return this.dotDesc;
	}
	
	// ***SETTERS***
	public void addDot() {
		this.dots++;
	}
	public void removeDot() {
		this.dots--;
	}
	public void setGenDesc(String newDesc) {
		this.genDesc=newDesc;
	}
}
