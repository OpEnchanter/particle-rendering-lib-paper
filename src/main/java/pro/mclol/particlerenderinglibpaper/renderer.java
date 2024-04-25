package pro.mclol.particlerenderinglibpaper;

import org.bukkit.Location;
import org.bukkit.Particle;

public class renderer {
    public void drawLine(Particle particle, Integer steps, Location a, Location b){
        for (int i = 0; i<=steps; i++){
            double t = (double) (i + 1) / steps;
            Location current = a.clone().add((b.clone().subtract(a)).multiply(t));
            a.getWorld().spawnParticle(particle, current, 1);
        }
    }
    public void drawPoly(Particle particle, Integer steps, Location a, Location b, Location c, Location d, Location e, Location f, Location g, Location h){
        drawLine(particle, steps, a, b);
        drawLine(particle, steps, b, c);
        drawLine(particle, steps, c, d);
        drawLine(particle, steps, d, a);

        drawLine(particle, steps, a, e);
        drawLine(particle, steps, b, f);
        drawLine(particle, steps, c, g);
        drawLine(particle, steps, d, h);

        drawLine(particle, steps, e, f);
        drawLine(particle, steps, f, g);
        drawLine(particle, steps, g, h);
        drawLine(particle, steps, h, e);
    }
    public void drawCircle(Particle particle, Integer steps, Location center, Double r){
        for (int i = 0; i<360;){
            Location current = center.clone().add(Math.sin(i)*r, 0, Math.cos(i)*r);
            center.getWorld().spawnParticle(particle, current, 0);
            i += 360/steps;
        }
    }
}
