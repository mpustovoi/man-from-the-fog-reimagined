package com.zen.fogman.client;

import com.zen.fogman.client.events.ModClientEvents;
import com.zen.fogman.client.renderers.ModRenderers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

@Environment(EnvType.CLIENT)
public class ManFromTheFogClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ModClientEvents clientEvents = new ModClientEvents();

		ModRenderers.registerRenderers();
		ClientTickEvents.END_CLIENT_TICK.register(clientEvents);
	}
}