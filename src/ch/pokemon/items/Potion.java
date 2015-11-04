package ch.pokemon.items;

import ch.pokemon.enumtypes.PotionType;
import ch.pokemon.model.Item;

public class Potion extends Item {

	public Potion(PotionType type) {
		super(type);
	}

	@Override
	public void use() {
		// TODO Heal the pokemon it was used on
		
	}
}
