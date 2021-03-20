package cz.danix25.kitpvp;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import cz.danix25.kitpvp.Commands.*;
import cz.danix25.kitpvp.Events.*;

public class Kitpvp extends JavaPlugin {

    public static Kitpvp plugin;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Join(this), this);
        getServer().getPluginManager().registerEvents(new Soup(this), this);
        saveDefaultConfig();
        getConfig().options().copyDefaults(true);
        saveConfig();
        getCommand("kit").setExecutor(new kit(this));
    }

}
