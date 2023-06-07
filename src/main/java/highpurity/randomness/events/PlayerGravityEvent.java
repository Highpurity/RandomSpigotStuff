package highpurity.randomness.events;


import highpurity.randomness.commands.insanity;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Particle;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerGravityEvent implements Listener {

    @EventHandler
    public void onPlayerEntityDamage(EntityDamageByEntityEvent e){

        if(insanity.toggle){
            if(e.getDamager().getType() == EntityType.PLAYER){
                var entity = e.getEntity();
                entity.setGravity(false);
                entity.setCustomName(ChatColor.RED + "WEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                entity.isGlowing();
                entity.setVisualFire(true);
                var world = entity.getWorld();
                var loc = entity.getLocation();
                world.spawnParticle(Particle.EXPLOSION_LARGE, loc, 200);
                Bukkit.broadcastMessage(ChatColor.RED + "WEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        }




}}}
