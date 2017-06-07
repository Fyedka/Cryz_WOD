import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Attributes extends HashSet<Attribute> {
	
	private static Map<String, String> getKey() {
		Map<String, String> typeMap = new HashMap<String, String>();
		typeMap.put("Strength","Physical");
		typeMap.put("Dexterity","Physical");
		typeMap.put("Stamina", "Physical");
		typeMap.put("Charisma", "Social");
		typeMap.put("Manipulation", "Social");
		typeMap.put("Appearance", "Social");
		typeMap.put("Perception", "Mental");
		typeMap.put("Intelligence", "Mental");
		typeMap.put("Wits", "Mental");
		return typeMap;
	}
	
	public static String getType(String name) {
		Map<String,String> key = getKey();
		String type = key.get(name);
		return type;
		// add handling for if this returns a null result
	}
	
	public static Attributes generate() {
		
		Attribute str = new Attribute("Strength");
		Attribute dex = new Attribute("Dexterity");
		Attribute sta = new Attribute("Stamina");
		// social
		Attribute cha = new Attribute("Charisma");
		Attribute man = new Attribute("Manipulation");
		Attribute app = new Attribute("Appearance");
		// mental
		Attribute per = new Attribute("Perception");
		Attribute intel = new Attribute("Intelligence");
		Attribute wit = new Attribute("Wits");
		
		Attributes att = new Attributes();
		Attribute[] attArray = {str, dex, sta, cha, man, app, per, intel, wit};
		att.addAll(Arrays.asList(attArray));
		return att;
	}
	
	/**
	 * default
	 */
	private static final long serialVersionUID = 1L;
	
}
