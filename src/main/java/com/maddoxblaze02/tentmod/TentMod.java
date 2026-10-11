package com.maddoxblaze02.tentmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TentMod implements ModInitializer {
    public static final String MOD_ID = "tentmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing TentMod");
        ModRegistry.register();
    }
}