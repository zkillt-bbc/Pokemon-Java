package ch.pokemon.enumtypes;

public enum BallType {
	POKEBALL("Pokeball", 0.33f, 100, 1), SUPERBALL("Superball", 0.5f, 120, 2), HYPERBALL("Hyperball", 0.75f, 150, 3), MASTERBALL("Masterball", 1f, 10000, 4) ;
	
	private String name;
	private float catchRate;
	private int value;
	private int id;
	
	BallType(String name, float catchRate, int value, int id) {
		this.name = name;
		this.catchRate = catchRate;
		this.value = value;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public float getCatchRate() {
		return catchRate;
	}

	public int getValue() { 
		return value;
	}

	public int getId() {
		return id;
	}
}
