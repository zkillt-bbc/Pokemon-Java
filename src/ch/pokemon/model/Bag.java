package ch.pokemon.model;

import java.util.ArrayList;
import java.util.List;

public class Bag {
	private ArrayList<Item> items;
	
	public Bag() {
		this.items = new ArrayList<Item>();
		items.add(Item.POKEBALL);
		items.add(Item.SUPERBALL);
		items.add(Item.HYPERBALL);
		items.add(Item.MASTERBALL);
		items.add(Item.POTION);
		items.add(Item.SUPERPOTION);
		items.add(Item.HYPERPOTION);
		items.add(Item.MAXRESTORE);
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		// TODO method implementation
	}
	
	public Item getItem(Item item) { //
		// TODO method implementation
		return null;
	}
	
	@Override
	public String toString() {
		
		String bagContent = "";
		
		for(Item item : items) {
			bagContent += item.toString() + " \n";
		}
	return bagContent;
	}
}
