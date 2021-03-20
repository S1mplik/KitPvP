package cz.danix25.kitpvp.Events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import cz.danix25.kitpvp.Kitpvp;

public class Hit implements Listener {

    public static Kitpvp plugin;
    public Hit(Kitpvp instance){
        plugin = instance;
    }

    @Deprecated
    @EventHandler
    public void onPlayerDamagedByEntity(EntityDamageByEntityEvent event){
        Entity e = event.getEntity();
        if(e instanceof Player){
            Player player = (Player) e;

            player.sendMessage("You have been hit by " + event.getDamager());
        }
    }

}
