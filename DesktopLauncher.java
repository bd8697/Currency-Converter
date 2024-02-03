package com.viorel.atestat.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.viorel.atestat.Sefu;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="Atestat";
		config.width=1280;
		config.height=720;
		new LwjglApplication(new Sefu(), config);

	}
}

