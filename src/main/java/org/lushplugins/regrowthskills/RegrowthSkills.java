package org.lushplugins.regrowthskills;

import org.bukkit.plugin.java.JavaPlugin;

public final class RegrowthSkills extends JavaPlugin {
    private static RegrowthSkills plugin;

    @Override
    public void onLoad() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        // Enable implementation
    }

    @Override
    public void onDisable() {
        // Disable implementation
    }

    public static RegrowthSkills getInstance() {
        return plugin;
    }
}
