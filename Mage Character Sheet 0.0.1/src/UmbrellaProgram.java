import java.lang.reflect.*;
import java.util.*;

public class UmbrellaProgram {

	public static void main(String[] args) {
		
		Backgrounds bgs = Backgrounds.generate();
		Set<Background> testset = new LinkedHashSet<Background>(bgs);
		Iterator it = testset.iterator();
		while (it.hasNext()) {
			System.out.println(((Background) it.next()).name());
		}
		
		
	}
}
