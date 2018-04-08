package me.tylergrissom.adminisonline;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Copyright Tyler Grissom 2018
 */
public class AdminIsOnlinePlugin extends JavaPlugin implements Listener {

    @Getter
    private AdminIsOnlinePlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;

        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(final PlayerJoinEvent event) {
        if (!event.getPlayer().hasPermission(new Permission("aio.notify"))) event.setJoinMessage(null);
    }
}
