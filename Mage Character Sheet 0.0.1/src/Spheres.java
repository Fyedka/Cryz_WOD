import java.util.Arrays;
import java.util.HashSet;

public class Spheres extends HashSet<Sphere> {
	
	public void printInfo(){
		// print info for all spheres
	}
	
	public static Spheres generate() {
		Sphere corr = new Sphere("Correspondence");
		Sphere ent  = new Sphere("Entropy");
		Sphere force = new Sphere("Forces");
		Sphere life = new Sphere("Life");
		Sphere mat = new Sphere("Matter");
		Sphere mind = new Sphere("Mind");
		Sphere prim = new Sphere("Prime");
		Sphere spir = new Sphere("Spirit");
		Sphere time = new Sphere("Time"); 
		
		Sphere[] sphereArray = {corr, ent, force, life, mat, mind, prim, spir, time};
		Spheres spheres = new Spheres();
		spheres.addAll(Arrays.asList(sphereArray));
		return spheres;
	}

	/**
	 * auto-generated
	 */
	private static final long serialVersionUID = -7894475579553936141L;
}
