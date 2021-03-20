package cz.danix25.kitpvp.Methods;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import cz.danix25.kitpvp.Kitpvp;

public class Kit {

    public static void giveDefaultKit(Kitpvp plugin, Player player) {
        Potions.giveVIP(plugin, player);

        player.getInventory().clear();
        //Armor
        //Hemlet
        ItemStack helmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta helmetMeta = helmet.getItemMeta();
        helmetMeta.setDisplayName("§eDefaultKit");
        helmet.setItemMeta(helmetMeta);
        //Chestplate
        ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta chestMeta = chest.getItemMeta();
        chestMeta.setDisplayName("§eDefaultKit");
        chest.setItemMeta(chestMeta);
        //Leggings
        ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta leggingsMeta = leggings.getItemMeta();
        leggingsMeta.setDisplayName("§eDefaultKit");
        leggings.setItemMeta(leggingsMeta);
        //Boots
        ItemStack boots = new ItemStack(Material.IRON_BOOTS);
        ItemMeta bootsMeta = boots.getItemMeta();
        bootsMeta.setDisplayName("§eDefaultKit");
        boots.setItemMeta(bootsMeta);
        //Soups
        ItemStack bowl = new ItemStack(Material.MUSHROOM_SOUP);
        ItemMeta bowlMeta = bowl.getItemMeta();
        bowlMeta.setDisplayName("§6Healing soup");
        bowl.setItemMeta(bowlMeta);
        //Knife
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName("§7Knife");
        sword.setItemMeta(swordMeta);
        player.getInventory().addItem(sword);
        player.getInventory().setItem(1, bowl);
        player.getInventory().setItem(2, bowl);
        player.getInventory().setItem(3, bowl);
        player.getInventory().setItem(4, bowl);
        player.getInventory().setItem(5, bowl);
        player.getInventory().setItem(6, bowl);
        player.getInventory().setItem(7, bowl);
        player.getInventory().setItem(8, bowl);
        player.getInventory().setItem(9, bowl);
        player.getInventory().setItem(10, bowl);
        player.getInventory().setItem(11, bowl);


    }

    public static void giveVIPKit(Kitpvp plugin, Player player) {
        Potions.giveVIP(plugin, player);

        player.getInventory().clear();

        ItemStack bowl = new ItemStack(Material.MUSHROOM_SOUP);
        ItemMeta bowlMeta = bowl.getItemMeta();
        bowlMeta.setDisplayName("§6Healing soup");
        bowl.setItemMeta(bowlMeta);

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName("§6Sunrise dagger");
        sword.setItemMeta(swordMeta);

        player.getInventory().addItem(sword);
        player.getInventory().setItem(1, bowl);
        player.getInventory().setItem(2, bowl);
        player.getInventory().setItem(3, bowl);
        player.getInventory().setItem(4, bowl);
        player.getInventory().setItem(5, bowl);
        player.getInventory().setItem(6, bowl);
        player.getInventory().setItem(7, bowl);
        player.getInventory().setItem(8, bowl);
        player.getInventory().setItem(9, bowl);
        player.getInventory().setItem(10, bowl);
        player.getInventory().setItem(11, bowl);
    }

    public static void giveGodKit(Kitpvp plugin, Player player){

        player.getInventory().clear();

        ItemStack bowl = new ItemStack(Material.MUSHROOM_SOUP);
        ItemMeta bowlMeta = bowl.getItemMeta();
        bowlMeta.setDisplayName("§6Healing soup");
        bowl.setItemMeta(bowlMeta);

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName("§5Gods dagger");
        sword.setItemMeta(swordMeta);

        player.getInventory().setItem(1, new ItemStack(Material.GOLDEN_APPLE, 4));
        player.getInventory().setItem(2, bowl);
        player.getInventory().setItem(3, bowl);
        player.getInventory().setItem(4, bowl);
        player.getInventory().setItem(5, bowl);
        player.getInventory().setItem(6, bowl);
        player.getInventory().setItem(7, bowl);
        player.getInventory().setItem(8, bowl);
        player.getInventory().setItem(9, bowl);
        player.getInventory().setItem(10, bowl);
        player.getInventory().setItem(11, bowl);
        player.getInventory().setItem(12, bowl);
    }
}