package io.github.moehreag.legacylwjgl3;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LegacyLWJGL3 implements ClientModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();

	private static Minecraft minecraft;

	@Override
	public void onInitializeClient() {
		LOGGER.info("This is definitely a 100% legit legacy LWJGL2 mod!");
	}

	public static Minecraft getMinecraft() {
		return minecraft;
	}

	public static void setMinecraft(Minecraft minecraft2) {
		minecraft = minecraft2;
	}
}
