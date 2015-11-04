package ch.pokemon.model;

import java.util.ArrayList;
import java.util.List;

import ch.pokemon.enumtypes.PokemonEnums;
import ch.pokemon.enumtypes.Type;

public class Pokemon {
	private String name;
	private int level;
	private float experience;
	private Type type;
	private int hp;
	private int damage;
	private int defense;
	private int speed;
	private List<Attack> attacks = new ArrayList<Attack>(4);
	
	public Pokemon(PokemonEnums pokemon, int level, List<Attack> attacks) {
		this(pokemon.getName(), level, pokemon.getType(), pokemon.getHp(), pokemon.getAtk(), pokemon.getDef(), pokemon.getSpeed(), attacks);
	}
	
	
	public Pokemon(String name, int level, Type type, int hp, int damage , int defense, int speed, List<Attack> attacks) {
		this.name = name;
		this.level = level;
		this.experience = 0f;
		this.type = type;
		this.hp = ((((2 * hp) + 24 + 19) * level ) / 100) + level + 10;
		this.damage = (((12 + (2 * damage) + 48) * level) / 100) + 5;
		this.defense = ((((2 * defense) + 30 + 21) * level) / 100) + 5;
		this.speed = (((5 + speed + 20) * level) / 50) + 5;
		this.attacks = attacks;
	}
	
	//(((5 + 2) * speed + 6) * level) / 100 + 5;
	
	public void useAttack(int i) {
		attacks.get(i).useAttack();
	}
	
	public void addAttack(Attack attack) {
		if(attacks.size() < 4) {
			attacks.add(attack);
		} else {
			System.out.println("A pokemon can only learn 4 attacks at once");
		}
	}
	
	public void removeAttack(Attack attack) {
		attacks.remove(attack);
	}
	
	public void spawnPokemon(PokemonEnums pokemon, int level, List<Attack> attacks) {
		new Pokemon(pokemon.getName(), level, pokemon.getType(), ((((2 * pokemon.getHp()) + 24 + 19) * level ) / 100) + level + 10, (((12 + (2 * pokemon.getAtk()) + 48) * level) / 100) + 5, ((((2 * pokemon.getDef()) + 30 + 21) * level) / 100) + 5, (((5 + pokemon.getSpeed() + 20) * level) / 50) + 5, attacks);
	}
	
	@Override
	public String toString() {
		String attacks = "";
		int counter = 1;
		for(Attack attack : this.attacks) {
			attacks += "[" + counter + ": " + attack.getName() + "]";
			counter++;
		}
		return "Pokemon[" + "Name: " + this.name + ", level: " + this.level + ", experience: " + this.experience + ", type: " + this.type + " stats: HP: " + this.hp + " ATK: " + this.damage + " Defense: " + this.defense + " Speed: " + this.speed + " attacks" +  attacks + "]";
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public List<Attack> getAttacks() {
		return attacks;
	}

	public void setAttacks(List<Attack> attacks) {
		this.attacks = attacks;
	}

	public Type getType() {
		return type;
	}
}
