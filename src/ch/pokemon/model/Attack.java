package ch.pokemon.model;

import ch.pokemon.enumtypes.Type;

public class Attack {
	private final String name;
	private final int damage;
	private int pp;
	private float accuracy;
	private Type type;

	public static final Attack TACKLE = new Attack("Tackle", 50, 35, 1f, Type.NORMAL);
	public static final Attack EMBER = new Attack("Ember", 40, 25, 1f, Type.FIRE);
	public static final Attack SPORE = new Attack("Spore", 0, 15, 1f, Type.PLANT);
	public static final Attack CRUNCH = new Attack("Crunch", 80, 15, 1f, Type.DARK);
	
	public Attack(String name, int damage, int pp, float accuracy,Type type) {
		this.name = name;
		this.damage = damage;
		this.pp = pp;
		this.accuracy = accuracy;
		this.type = type;
	}
	
	public void useAttack() {
		// TODO method implementation
	}
	
	@Override
	public String toString() {
		return "Attack[" + "name: " + this.name + " damage: " + this.damage + " pp: " + this.pp + " type: " + this.type +"]";
	}

	public String getName() {
		return name;
	}
}