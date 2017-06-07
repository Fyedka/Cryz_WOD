import java.util.HashSet;
import java.util.Set;

import Attribute.Name;

public class CharacterSheet {
	
	// basic info fields (relatively stable)
	String characterName = "Unspecified";
	String playerName = "Unspecified";
	String chronicle = "Unspecified";
	String nature = "Unspecified";
	String essence = "Unspecified";
	String demeanor = "Unspecified";
	String tradition = "Unspecified";
	String concept = "Unspecified";
	String cabal = "Unspecified";
	
	// status fields (change more often)
	int experience = 0;
	int maxWillpower = 5;
	int currWillpower = maxWillpower;
	int arete = 1;
	int hitsTaken = 0;
	int quintessence = arete;
	int paradox = 0;
	
	// set of attributes
	Set<Attribute> attributes = new HashSet<Attribute>();
	Attribute str = new Attribute(Type.PHYSICAL, Name.STR);
	Attribute dex = new Attribute(Type.PHYSICAL, Name.DEX);
	Attribute sta = new Attribute(Type.PHYSICAL, Name.STA);
	// social
	Attribute cha = new Attribute(Type.SOCIAL, Name.CHA);
	Attribute man = new Attribute(Type.SOCIAL, Name.MAN);
	Attribute app = new Attribute(Type.SOCIAL, Name.APP);
	// mental
	Attribute per = new Attribute(Type.MENTAL, Name.PER);
	Attribute intel = new Attribute(Type.MENTAL, Name.INT);
	Attribute wit = new Attribute(Type.MENTAL, Name.WIT);
	
	
	// ability fields
	// talents
	Ability alertness = new Ability("Talent", "Alertness");
	Ability athletics = new Ability("Talent", "Athletics");
	Ability awareness = new Ability("Talent", "Awareness");
	Ability brawl = new Ability("Talent", "Brawl");
	Ability dodge = new Ability("Talent", "Dodge");
	Ability expression = new Ability("Talent", "Expression");
	Ability intimidation = new Ability("Talent", "Intimidation");
	Ability leadership = new Ability("Talent", "Leadership");
	Ability streetwise = new Ability("Talent", "Streetwise");
	Ability subterfuge = new Ability("Talent", "Subterfuge");
	// skills
	Ability crafts = new Ability("Skill", "Crafts");
	Ability drive = new Ability("Skill", "Drive");
	Ability etiquette = new Ability("Skill", "Ettiquette");
	Ability firearms = new Ability("Skill", "Firearms");
	Ability meditation = new Ability("Skill", "Meditation");
	Ability melee = new Ability("Skill", "Melee");
	Ability performance = new Ability("Skill", "Performance");
	Ability stealth = new Ability("Skill", "Stealth");
	Ability survival = new Ability("Skill", "Survival");
	Ability technology = new Ability("Skill", "Technology");
	// knowledges
	Ability academics = new Ability("Knowledge", "Academics");
	Ability computer = new Ability("Knowledge", "Computer");
	Ability cosmology = new Ability("Knowledge", "Cosmology");
	Ability enigmas = new Ability("Knowledge", "Enigmas");
	Ability investigation = new Ability("Knowledge", "Investigation");
	Ability law = new Ability("Knowledge", "Law");
	Ability lore = new Ability("Knowledge", "Lore");
	Ability linguistics = new Ability("Knowledge", "Linguistics");
	Ability medicine = new Ability("Knowledge", "Medicine");
	Ability occult = new Ability("Knowledge", "Occult");
	Ability science = new Ability("Knowledge", "Science");
	
	// sphere fields
	Sphere correspondence = new Sphere("Correspondence");
	Sphere entropy  = new Sphere("Entropy");
	Sphere forces = new Sphere("Forces");
	Sphere life = new Sphere("Life");
	Sphere matter = new Sphere("Matter");
	Sphere mind = new Sphere("Mind");
	Sphere prime = new Sphere("Prime");
	Sphere spirit = new Sphere("Spirit");
	Sphere time = new Sphere("Time");
	
	// background fields
	Background allies = new Background("Allies");
	Background arcane = new Background("Arcane");
	Background avatar = new Background("Avatar");
	Background destiny = new Background("Destiny");
	Background dream = new Background("Dream");
	Background influence = new Background("Influence");
	Background library = new Background("Library");
	Background mentor = new Background("Mentor");
	Background node = new Background("Node");
	Background talisman = new Background("Talisman");
	
	
	// ***CONSTRUCTORS***
	public CharacterSheet() {
		// defaults
	}
	
	// ***GETTERS***
	String playerName() {
		return this.playerName;
	}
	String characterName() {
		return this.characterName;
	}
	String chronicle() {
		return this.chronicle;
	}
	String nature() {
		return this.nature;
	}
	String essence() {
		return this.essence;
	}
	String demeanor() {
		return this.demeanor;
	}
	String concept() {
		return this.concept;
	}
	String cabal() {
		return this.cabal;
	}
	String tradition() {
		return this.tradition;
	}
	
	// ***SETTERS***
	void abandonTradition() {
		this.tradition = "Orphan";
	}
	void adoptTradition(String tradition) {
		this.tradition = tradition;
	}
	void setCabal(String cabal) {
		this.cabal = cabal;
	}
	void renameCharacter(String newName) {
		this.characterName = newName;
	}
	void assignPlayer(String playerName) {
		this.playerName = playerName;
	}
	void makeNPC() {
		this.playerName = "NPC";
	}
	void setChronicle(String chron) {
		this.chronicle = chron;
	}
	void setNature(String nat) {
		this.nature = nat;
	}
	void setEssence(String ess) {
		this.essence = ess;
	}
	void setDemeanor(String dem) {
		this.demeanor = dem;
	}
	void setConcept (String concept) {
		this.concept = concept;
	}
	
	// ***OTHER METHODS***
	
	
}

