package ch.pokemon.enumtypes;

public enum PokemonEnums {
	
	// TODO ADD IMAGE PATH TO ENUM!
	
	CHARIZARD("Charizard", Type.FIRE, 78, 84, 78, 100), BLASTOISE("Blastoise", Type.WATER, 79, 83, 100, 78), VENUSAUR("Venusaur", Type.PLANT, 80, 82, 83, 80) ;
		
	private String name;
	private Type type;
	private int fullhp;
	private int hp;
	private int atk;
	private int def;
	private int speed;
	
	private PokemonEnums(String name, Type type, int hp, int atk, int def, int speed) {
		this.name = name;
		this.type = type;
		this.fullhp = hp;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public int getHp() {
		return fullhp;
	}

	public int getAtk() {
		return atk;
	}

	public int getDef() {
		return def;
	}

	public int getSpeed() {
		return speed;
	}
}