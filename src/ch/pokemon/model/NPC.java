package ch.pokemon.model;

import java.util.List;

public class NPC {

	private final String name;
	private String dialogue;
	private boolean fights;
	private int movementSpeed = 4;
	private Bag bag;
	private List<Pokemon> pokemonInBag;
	
	
	public NPC(String name, String dialogue, boolean fights, int movementSpeed, Bag bag, List<Pokemon> pokemonInBag) {
		this.name = name;
		this.dialogue = dialogue;
		this.fights = fights;
		this.movementSpeed = movementSpeed;
		this.bag = bag;
		this.pokemonInBag = pokemonInBag;
	}

	public void move() {
		
	}
}
