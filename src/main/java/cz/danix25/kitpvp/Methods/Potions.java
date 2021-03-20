package cz.danix25.kitpvp.Methods;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import cz.danix25.kitpvp.Kitpvp;

public class Potions {
    public static Kitpvp plugin;
    public Potions(Kitpvp instance){
        plugin = instance;
    }

    public static void giveDefault(Kitpvp plugin, Player player){

        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 2));
        player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1000000, 2));
    }
    public static void giveVIP(Kitpvp plugin, Player player){


    }
    public static void giveOP(Kitpvp plugin, Player player){
        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 3));
        player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1000000, 10));
    }

}
