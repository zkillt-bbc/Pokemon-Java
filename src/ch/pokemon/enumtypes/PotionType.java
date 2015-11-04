package ch.pokemon.enumtypes;

public enum PotionType {
	POTION("Potion", 50, 100, 5), SUPERPOTION("Superpotion", 100, 120, 6), HYPERPOTION("Hyperpotion", 150, 250, 7), MAXRESTORE("Maxrestore", 1000, 350, 8) ;
	
	private String name;
	private int heal;
	private int value;
	private int id;
	
	PotionType(String name, int heal, int value, int id) {
		this.name = name;
		this.heal = heal;
		this.value = value;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getHeal() {
		return heal;
	}

	public int getValue() { 
		return value;
	}
	
	public int getId() {
		return id;
	}
}
