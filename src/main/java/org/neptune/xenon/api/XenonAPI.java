package org.neptune.xenon.api;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.neptune.xenon.profiles.Profile;

import java.util.Map;

public class XenonAPI {
    public static int getKeys(Player player, String key) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static Profile getProfile(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static Map<Integer, ItemStack> getItemsFromCrate(String crateName) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static void reloadHolograms() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}