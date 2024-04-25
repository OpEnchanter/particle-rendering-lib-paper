package pro.mclol.particlerenderinglibpaper;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import pro.mclol.particlerenderinglibpaper.tabCompletion;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Vector;

public final class Particle_rendering_lib_paper extends JavaPlugin implements CommandExecutor, Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

        getCommand("draw").setExecutor(this);
        getCommand("draw").setTabCompleter(new tabCompletion());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("draw")){
            if (args[0].equalsIgnoreCase("line")){
                sender.sendMessage("drawing");
                renderer rend = new renderer();
                Location a = new Location(getServer().getWorld("world"), 0, 0, 0);
                a.setX(Double.parseDouble(args[1].split(",")[0]));
                a.setY(Double.parseDouble(args[1].split(",")[1]));
                a.setZ(Double.parseDouble(args[1].split(",")[2]));
                Location b = new Location(getServer().getWorld("world"), 0, 0, 0);
                b.setX(Double.parseDouble(args[2].split(",")[0]));
                b.setY(Double.parseDouble(args[2].split(",")[1]));
                b.setZ(Double.parseDouble(args[2].split(",")[2]));
                rend.drawLine(Particle.ASH, 300, a, b);
            } else if (args[0].equalsIgnoreCase("poly")){
                sender.sendMessage("drawing");
                renderer rend = new renderer();
                Location a = new Location(getServer().getWorld("world"), 0, 0, 0);
                a.setX(Double.parseDouble(args[1].split(",")[0]));
                a.setY(Double.parseDouble(args[1].split(",")[1]));
                a.setZ(Double.parseDouble(args[1].split(",")[2]));
                Location b = new Location(getServer().getWorld("world"), 0, 0, 0);
                b.setX(Double.parseDouble(args[2].split(",")[0]));
                b.setY(Double.parseDouble(args[2].split(",")[1]));
                b.setZ(Double.parseDouble(args[2].split(",")[2]));
                Location c = new Location(getServer().getWorld("world"), 0, 0, 0);
                c.setX(Double.parseDouble(args[3].split(",")[0]));
                c.setY(Double.parseDouble(args[3].split(",")[1]));
                c.setZ(Double.parseDouble(args[3].split(",")[2]));
                Location d = new Location(getServer().getWorld("world"), 0, 0, 0);
                d.setX(Double.parseDouble(args[4].split(",")[0]));
                d.setY(Double.parseDouble(args[4].split(",")[1]));
                d.setZ(Double.parseDouble(args[4].split(",")[2]));
                Location e = new Location(getServer().getWorld("world"), 0, 0, 0);
                e.setX(Double.parseDouble(args[5].split(",")[0]));
                e.setY(Double.parseDouble(args[5].split(",")[1]));
                e.setZ(Double.parseDouble(args[5].split(",")[2]));
                Location f = new Location(getServer().getWorld("world"), 0, 0, 0);
                f.setX(Double.parseDouble(args[6].split(",")[0]));
                f.setY(Double.parseDouble(args[6].split(",")[1]));
                f.setZ(Double.parseDouble(args[6].split(",")[2]));
                Location g = new Location(getServer().getWorld("world"), 0, 0, 0);
                g.setX(Double.parseDouble(args[7].split(",")[0]));
                g.setY(Double.parseDouble(args[7].split(",")[1]));
                g.setZ(Double.parseDouble(args[7].split(",")[2]));
                Location h = new Location(getServer().getWorld("world"), 0, 0, 0);
                h.setX(Double.parseDouble(args[8].split(",")[0]));
                h.setY(Double.parseDouble(args[8].split(",")[1]));
                h.setZ(Double.parseDouble(args[8].split(",")[2]));
                rend.drawPoly(Particle.ASH, 300, a, b, c, d, e, f, g, h);
            } else if(args[0].equalsIgnoreCase("circle")){
                sender.sendMessage("drawing");
                renderer rend = new renderer();
                Location a = new Location(getServer().getWorld("world"), 0, 0, 0);
                a.setX(Double.parseDouble(args[1].split(",")[0]));
                a.setY(Double.parseDouble(args[1].split(",")[1]));
                a.setZ(Double.parseDouble(args[1].split(",")[2]));
                Double r = Double.parseDouble(args[2]);
                rend.drawCircle(Particle.DRAGON_BREATH, 300, a, r);
            }
        }
        return true;
    }
}
