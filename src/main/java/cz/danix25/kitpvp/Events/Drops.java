package cz.danix25.kitpvp.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import cz.danix25.kitpvp.Kitpvp;

public class Drops implements Listener {

    public static Kitpvp plugin;
    public Drops(Kitpvp instance){
        plugin = instance;
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent event){
        event.setCancelled(true);
    }

}
