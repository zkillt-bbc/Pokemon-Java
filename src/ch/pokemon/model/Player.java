package ch.pokemon.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ch.pokemon.enumtypes.PokemonEnums;

public class Player{
	
	public final String name;
	private int movementSpeed = 4;
	private Bag bag;
	private List<Pokemon> pokemonInBag;
	
	
	public static void main(String[] args) {
//		Item.init();
		Player player = new Player("Tim");		
		
		player.addPokemon(new Pokemon(PokemonEnums.CHARIZARD, 51, new ArrayList<Attack>(4){{add(Attack.TACKLE); add(Attack.EMBER); add(Attack.SPORE);}}));
		player.addPokemon(new Pokemon(PokemonEnums.CHARIZARD, 67, new ArrayList<Attack>(4){{add(Attack.TACKLE);}}));
		player.addPokemon(new Pokemon(PokemonEnums.CHARIZARD, 50, new ArrayList<Attack>(4){{add(Attack.TACKLE);}}));
		player.addPokemon(new Pokemon(PokemonEnums.CHARIZARD, 99, new ArrayList<Attack>(4){{add(Attack.TACKLE);}}));
		player.addPokemon(new Pokemon(PokemonEnums.VENUSAUR, 36, new ArrayList<Attack>(4){{add(Attack.TACKLE);}})); 
		player.addPokemon(new Pokemon(PokemonEnums.BLASTOISE, 62, new ArrayList<Attack>(4){{add(Attack.TACKLE);}}));		
		
		
		player.removePokemon(PokemonEnums.CHARIZARD.getName());
		player.pokemonInBag.get(0).addAttack(Attack.CRUNCH);
		
		System.out.println(player);
	}
	
	public Player(String name) {
		this.name = name;
		this.bag = new Bag();
		this.pokemonInBag = new ArrayList<Pokemon>(6);
	}
	
	public void addPokemon(Pokemon pokemon) {
		if(pokemonInBag.size() < 6) {
			pokemonInBag.add(pokemon);
		} else {
			System.out.println("There are already 6 pokemon!");
		}
	}
	
	@Override
	public String toString() {
		String pokemonString = "";
		
		for(Pokemon pokemon : pokemonInBag) {
			pokemonString += pokemon.toString() + "\n";
		}
		
		return "Player[name: " + this.name + "\n\nBag:\n" + this.bag.toString() + "\n\nPokemon:\n" + pokemonString +"]";
	}
	
	public void removePokemon(String pokemonName) {
		for(Iterator<Pokemon> iter = this.pokemonInBag.listIterator(); iter.hasNext();) {
			Pokemon poke = iter.next();
			if(poke.getName().equals(pokemonName)) {
				System.out.println("Removed Pokemon with name " + poke.getName());
				iter.remove();
				break;
			} else {
				System.out.println("No pokemon with the name: " + pokemonName + " was found!");
				break;
			}
		}
	}
}