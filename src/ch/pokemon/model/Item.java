package ch.pokemon.model;

import ch.pokemon.enumtypes.BallType;
import ch.pokemon.enumtypes.PotionType;
import ch.pokemon.items.Ball;
import ch.pokemon.items.Potion;

public abstract class Item {
	private int value;
	private int id;
	private String name;
	
//	public static HashMap<String, Item> items = new HashMap<String, Item>();
	
	public static final Item POKEBALL = new Ball(BallType.POKEBALL);
	public static final Item SUPERBALL = new Ball(BallType.SUPERBALL);
	public static final Item HYPERBALL = new Ball(BallType.HYPERBALL);
	public static final Item MASTERBALL = new Ball(BallType.MASTERBALL);
	public static final Item POTION = new Potion(PotionType.POTION);
	public static final Item SUPERPOTION = new Potion(PotionType.SUPERPOTION);
	public static final Item HYPERPOTION = new Potion(PotionType.HYPERPOTION);
	public static final Item MAXRESTORE = new Potion(PotionType.MAXRESTORE);
	
	
//	public static void init() {
//		items.put("Pokeball", new Ball(BallType.POKEBALL));
//		items.put("Superball", new Ball(BallType.SUPERBALL));
//		items.put("Hyperball", new Ball(BallType.HYPERBALL));
//		items.put("Masterball", new Ball(BallType.MASTERBALL));
//		items.put(key, value)
//	}
//	
	public Item(String name, int id, int value) {
		this.name = name;
		this.id = id;
		this.value = value;
	}
	
	public Item(BallType type) {
		this(type.getName(), type.getId(), type.getValue());
	}
	
	public Item(PotionType type) {
		this(type.getName(), type.getId(), type.getValue());
	}
	
	@Override
	public String toString() {
		return "Item[" + "id: " + this.id + " name: " + this.name + " value: " + this.value + "]";
	}
	
	public abstract void use();
}