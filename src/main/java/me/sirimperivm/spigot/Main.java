package me.sirimperivm.spigot;

import me.sirimperivm.spigot.other.Enchants;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("all")
public final class Main extends JavaPlugin {

    private static Main plugin;
    private static Enchants enchant;

    @Override
    public void onEnable() {
        plugin = this;
        enchant = new Enchants();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Main getPlugin() {
        return plugin;
    }

    public static Enchants getEnchant() {
        return enchant;
    }
}
