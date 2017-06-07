import java.util.Arrays;
import java.util.*;

public class Backgrounds extends LinkedHashSet<Background> {
	
	

	public static Backgrounds generate() {
		Background ally = new Background("Allies");
		Background arc = new Background("Arcane");
		Background ava = new Background("Avatar");
		Background chan = new Background("Chantry");
		Background cont = new Background("Contacts");
		Background dest = new Background("Destiny");
		Background dream = new Dream();
		Background fame = new Background("Fame");
		Background inf = new Background("Influence");
		Background lib = new Background("Library");
		Background ment = new Background("Mentor");
		Background node = new Background("Node");
		Background res = new Background("Resources");
		Background tal = new Background("Talisman");
		
		Background[] bgArray = {ally,arc,ava,chan,cont,dest,dream,fame,inf,lib,ment,node,res,tal};
		Backgrounds bgs = new Backgrounds();
		bgs.addAll(Arrays.asList(bgArray));
		return bgs;
	}
	
	
	/**
	 * auto-generated 
	 */
	private static final long serialVersionUID = -210728322035151208L;

}
