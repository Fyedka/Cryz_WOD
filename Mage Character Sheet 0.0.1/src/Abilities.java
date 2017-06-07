import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Abilities extends HashSet<Ability> {
	
	private static final Map<String, String> typeKey = getKey();

	private static Map<String, String> getKey() {
		Map<String, String> typeMap = new HashMap<String, String>();
		typeMap.put("Alertness","Talent");
		typeMap.put("Athletics","Talent");
		typeMap.put("Awareness","Talent");
		typeMap.put("Brawl","Talent");
		typeMap.put("Dodge","Talent");
		typeMap.put("Expression","Talent");
		typeMap.put("Intimidation","Talent");
		typeMap.put("Streetwise","Talent");
		typeMap.put("Subterfuge","Talent");
		
		typeMap.put("Crafts","Skill");
		typeMap.put("Drive","Skill");
		typeMap.put("Ettiquette","Skill");
		typeMap.put("Firearms","Skill");
		typeMap.put("Meditation","Skill");
		typeMap.put("Melee","Skill");
		typeMap.put("Performance","Skill");
		typeMap.put("Stealth","Skill");
		typeMap.put("Survival","Skill");
		typeMap.put("Technology","Skill");
		
		typeMap.put("Academics","Knowledge");
		typeMap.put("Computer","Knowledge");
		typeMap.put("Cosmology","Knowledge");
		typeMap.put("Enigmas","Knowledge");
		typeMap.put("Investigation","Knowledge");
		typeMap.put("Law","Knowledge");
		typeMap.put("Lore","Knowledge");
		typeMap.put("Linguistics","Knowledge");
		typeMap.put("Medicine","Knowledge");
		typeMap.put("Occult","Knowledge");
		typeMap.put("Science","Knowledge");
		
		return typeMap;
	}
	
	public static String getType(String name) {
		Map<String, String> key = typeKey;
		String type = key.get(name);
		return type;
	}
	
	public static Abilities generate() {
		Ability acad = new Ability("Academics");
		Ability comp = new Ability("Computer");
		Ability cosmol = new Ability("Cosmology");
		Ability enig = new Ability("Enigmas");
		Ability inv = new Ability("Investigation");
		Ability law = new Ability("Law");
		Ability lore = new Ability("Lore");
		Ability ling = new Ability("Linguistics");
		Ability medic = new Ability("Medicine");
		Ability occ = new Ability("Occult");
		Ability sci = new Ability("Science");
		Ability craft = new Ability("Crafts");
		Ability drive = new Ability("Drive");
		Ability ett = new Ability("Ettiquette");
		Ability fire = new Ability("Firearms");
		Ability medit = new Ability("Meditation");
		Ability melee = new Ability("Melee");
		Ability perf = new Ability("Performance");
		Ability stealth = new Ability("Stealth");
		Ability surv = new Ability("Survival");
		Ability tech = new Ability("Technology");
		Ability alert = new Ability("Alterness");
		Ability ath = new Ability("Athletics");
		Ability aware = new Ability("Awareness");
		Ability brawl = new Ability("Brawl");
		Ability dodge = new Ability("Dodge");
		Ability expr = new Ability("Expression");
		Ability intim = new Ability("Intimidation");
		Ability street = new Ability("Streetwise");
		Ability subter = new Ability("Subterfuge");
		
		Abilities abils = new Abilities();
		Ability[] abilArray = {acad, comp, cosmol, enig, inv, law, lore, ling, medic, occ, sci,
				craft, drive,ett,fire,medit,melee,perf,stealth,surv,tech,alert,ath,aware,brawl,
				dodge,expr,intim,street,subter};
		abils.addAll(Arrays.asList(abilArray));
		return abils;
	}
	
	/**
	 * default
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
