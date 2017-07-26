package me.xhaqdev.blockade;

import me.xhaqdev.blockade.listeners.BlocadeListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new BlocadeListeners(), this);
    }
}
