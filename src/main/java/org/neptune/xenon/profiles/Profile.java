package org.neptune.xenon.profiles;

import org.bson.Document;
import org.bukkit.plugin.IllegalPluginAccessException;

import lombok.Getter;

@Getter
public class Profile {
    private String name;
    private Document keys;

    public String getName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Document getKeys() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
