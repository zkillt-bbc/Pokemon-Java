package ch.pokemon.items;

import ch.pokemon.enumtypes.BallType;
import ch.pokemon.model.Item;

public class Ball extends Item {
	
	public Ball(BallType type) {
		super(type);
	}

	@Override
	public void use() {
		// TODO throw the ball and try to catch a pokemon
	}
}
