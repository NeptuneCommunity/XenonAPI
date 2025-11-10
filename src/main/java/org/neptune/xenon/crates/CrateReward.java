package org.neptune.xenon.crates;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.ArrayList;
import java.util.List;

/**
 * This code was made by jsexp, in case of any unauthorized
 * use, at least please leave credits.
 * Find more about me @ my <a href="https://github.com/hardcorefactions">GitHub</a> :D
 * © 2025 - jsexp
 */
public class CrateReward {
    private final ItemStack itemStack;
    private final List<CrateAction> actions = new ArrayList<>();
    private int slot;
    private double chance;

    public CrateReward(int slot, ItemStack itemStack, double chance) {
        this.slot = slot;
        this.itemStack = itemStack;
        this.chance = chance;
    }

    public void onWin(Player player) {
        throw new IllegalPluginAccessException("You can't compile the API.");
    }

    public void addAction(ActionType type, String command) {
        throw new IllegalPluginAccessException("You can't compile the API.");
    }

    public void removeAction(ActionType type, String command) {
        throw new IllegalPluginAccessException("You can't compile the API.");
    }

    public List<CrateAction> getActionsByType(ActionType type) {
        throw new IllegalPluginAccessException("You can't compile the API.");
    }

    public boolean isSimilar(CrateReward firstReward) {
        throw new IllegalPluginAccessException("You can't compile the API.");
    }

    @Data
    @AllArgsConstructor
    public static class CrateAction {
        private final ActionType type;
        private final String command;

        public void execute(Player player) {
            throw new IllegalPluginAccessException("You can't compile the API.");
        }
    }

    public enum ActionType {
        PLAYER_COMMAND, CONSOLE_COMMAND;

        public void execute(Player player, String action) {
            throw new IllegalPluginAccessException("You can't compile the API.");
        }
    }
}