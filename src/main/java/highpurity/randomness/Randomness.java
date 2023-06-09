package highpurity.randomness;

import highpurity.randomness.commands.insanity;
import highpurity.randomness.events.PlayerGravityEvent;
import highpurity.randomness.events.Playermovementevent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Randomness extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerGravityEvent(), this);
        getServer().getPluginManager().registerEvents(new Playermovementevent(), this);
        this.getCommand("insanity").setExecutor(new insanity());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
