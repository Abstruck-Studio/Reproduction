package org.abstruck.reproduction;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * @author Goulixiaoji
 */
public final class Reproduction extends JavaPlugin {
    public static Logger logger;
    @Override
    public void onEnable() {
        Reproduction.logger = getLogger();
        saveDefaultConfig();
        logger.info("Reproduction enabled successfully!");
    }

    @Override
    public void onDisable() {
        logger.info("Reproduction disabled");
    }
}
