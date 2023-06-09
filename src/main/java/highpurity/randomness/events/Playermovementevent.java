package highpurity.randomness.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Playermovementevent implements Listener {

    @EventHandler
    public void onPlayerWalk(PlayerMoveEvent e){

        var p = e.getPlayer();
        var loc = p.getLocation();
        var world = p.getWorld();
        var block = world.getBlockAt(loc);
        var blocktype = block.getType();

        if(block.isLiquid()){

            world.strikeLightning(loc);

        }


    }

}
