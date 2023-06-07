package highpurity.randomness;

import highpurity.randomness.events.PlayerGravityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Randomness extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerGravityEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
