package cz.danix25.kitpvp.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import cz.danix25.kitpvp.Kitpvp;
import cz.danix25.kitpvp.Methods.Kit;
import cz.danix25.kitpvp.Methods.Potions;

public class kit implements CommandExecutor {

    public static Kitpvp plugin;

    public kit(Kitpvp instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label,
                             String[] args) {
        Player player = (Player) sender;
        if (label.equalsIgnoreCase("kit")) {
            Potions.giveDefault(plugin, player);
            Kit.giveDefaultKit(plugin, player);
        }
        if(args.length == 1 && args[0].equalsIgnoreCase("god")){
            Kit.giveGodKit(plugin, player);
        }
        return false;
    }

}
