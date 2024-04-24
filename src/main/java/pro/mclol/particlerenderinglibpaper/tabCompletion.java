package pro.mclol.particlerenderinglibpaper;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class tabCompletion implements TabCompleter {
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] args) {
        List<String> tabCompletion = new ArrayList<String>();
        if (!(sender instanceof Player)) { return tabCompletion; }
        Player player = (Player) sender;
        if (args.length == 1){
            tabCompletion.add("poly");
            tabCompletion.add("circle");
            tabCompletion.add("line");
        }
        if (args[0].equals("line")) {
            if (args.length == 2) {
                tabCompletion.add(String.valueOf(player.getLocation().getBlockX()) + "," + String.valueOf(player.getLocation().getBlockY()) + "," + String.valueOf(player.getLocation().getBlockZ()));
            }
            if (args.length == 3) {
                tabCompletion.add(String.valueOf(player.getLocation().getBlockX()) + "," + String.valueOf(player.getLocation().getBlockY()) + "," + String.valueOf(player.getLocation().getBlockZ()));
            }
        }
        if (args[0].equals("poly")) {
            if (args.length == 2) {
                tabCompletion.add(String.valueOf(player.getLocation().getBlockX()) + "," + String.valueOf(player.getLocation().getBlockY()) + "," + String.valueOf(player.getLocation().getBlockZ()));
            }
            if (args.length == 3) {
                tabCompletion.add(String.valueOf(player.getLocation().getBlockX()) + "," + String.valueOf(player.getLocation().getBlockY()) + "," + String.valueOf(player.getLocation().getBlockZ()));
            }
            if (args.length == 4) {
                tabCompletion.add(String.valueOf(player.getLocation().getBlockX()) + "," + String.valueOf(player.getLocation().getBlockY()) + "," + String.valueOf(player.getLocation().getBlockZ()));
            }
            if (args.length == 5) {
                tabCompletion.add(String.valueOf(player.getLocation().getBlockX()) + "," + String.valueOf(player.getLocation().getBlockY()) + "," + String.valueOf(player.getLocation().getBlockZ()));
            }
            if (args.length == 6) {
                tabCompletion.add(String.valueOf(player.getLocation().getBlockX()) + "," + String.valueOf(player.getLocation().getBlockY()) + "," + String.valueOf(player.getLocation().getBlockZ()));
            }
            if (args.length == 7) {
                tabCompletion.add(String.valueOf(player.getLocation().getBlockX()) + "," + String.valueOf(player.getLocation().getBlockY()) + "," + String.valueOf(player.getLocation().getBlockZ()));
            }
            if (args.length == 8) {
                tabCompletion.add(String.valueOf(player.getLocation().getBlockX()) + "," + String.valueOf(player.getLocation().getBlockY()) + "," + String.valueOf(player.getLocation().getBlockZ()));
            }
            if (args.length == 9) {
                tabCompletion.add(String.valueOf(player.getLocation().getBlockX()) + "," + String.valueOf(player.getLocation().getBlockY()) + "," + String.valueOf(player.getLocation().getBlockZ()));
            }
        }
        if (args[0].equals("circle")) {
            if (args.length == 2) {
                tabCompletion.add(String.valueOf(player.getLocation().getBlockX()) + "," + String.valueOf(player.getLocation().getBlockY()) + "," + String.valueOf(player.getLocation().getBlockZ()));
            }
            if (args.length == 3){
                tabCompletion.add("5");
            }
        }
        return tabCompletion;
    }
}
