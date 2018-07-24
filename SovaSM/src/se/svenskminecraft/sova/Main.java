package se.svenskminecraft.sova;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import se.svenskminecraft.sova.events.PlayerBedEvent;

public class Main extends JavaPlugin implements Listener {
	
private static Main instance;
	
	public static Main getInstance() {
		return instance;
	}
	
	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerBedEvent(), this);
		instance = this;
	}
	public void onDisable() {
		
	}
}
