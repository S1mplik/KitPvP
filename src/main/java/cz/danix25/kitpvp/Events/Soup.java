package cz.danix25.kitpvp.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import cz.danix25.kitpvp.Kitpvp;

public class Soup implements Listener {

    public static Kitpvp plugin;
    public Soup(Kitpvp instance){
        plugin = instance;
    }

    @EventHandler
    public void onSoup(PlayerInteractEvent event){
        Player player = event.getPlayer();

        if(player.getHealth() == player.getMaxHealth()){
        }else{
            player.setHealth(player.getHealth() + 7 > player.getMaxHealth() ? player.getMaxHealth() : player.getHealth() + 7);

            player.getInventory().getItemInHand().setType(Material.BOWL);
        }
    }

}
