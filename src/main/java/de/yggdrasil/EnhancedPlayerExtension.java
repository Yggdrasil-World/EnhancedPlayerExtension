package de.yggdrasil;

import net.minestom.server.MinecraftServer;
import net.minestom.server.extensions.Extension;

public class EnhancedPlayerExtension extends Extension {

    @Override
    public void initialize() {
        System.out.println("Extension loaded");
        MinecraftServer.getConnectionManager().setPlayerProvider(new EnhancedPlayerProvider());
    }

    @Override
    public void terminate() {

    }
}