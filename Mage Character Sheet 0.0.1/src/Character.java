
public class Character {
	
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
	
	
	
	// set of attributes
	Attributes atts = Attributes.generate();
	
	// set of abilities
	Abilities abils = Abilities.generate();
	
	// set of spheres
	Spheres spheres = Spheres.generate();
	
	// set of backgrounds
	Backgrounds bgs = Backgrounds.generate();

	// status fields (change more often)
	int experience = 0;
	int maxWillpower = 5;
	int currWillpower = maxWillpower;
	int arete = 1;
	int hitsTaken = 0;
	int quintessence = bgs.ava; // actually change to avatar
	int paradox = 0;

	// ***CONSTRUCTORS***
	public Character() {
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

