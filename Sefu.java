package com.viorel.atestat;

import com.badlogic.gdx.Game;

public class Sefu extends Game {

	public static From from_screen;

	@Override
	public void create() {
		Assets.load();
		from_screen=new From(this);
		setScreen(from_screen);

	}
}
