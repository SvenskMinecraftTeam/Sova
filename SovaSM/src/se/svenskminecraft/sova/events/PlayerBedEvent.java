package se.svenskminecraft.sova.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

import net.md_5.bungee.api.ChatColor;

public class PlayerBedEvent implements Listener {
@EventHandler
	public void PlayerEvent(PlayerBedEnterEvent e) {
		Player p = (Player) e.getPlayer();
		if (p.getWorld() == Bukkit.getWorld("world") && Bukkit.getServer().getOnlinePlayers().size() >= 2) {
			if (p.getWorld().getTime() >= 13000) {
				p.sendMessage(ChatColor.GREEN + "Du sover trots att det �r personer inne!");
				p.getWorld().setTime(23300);
				Bukkit.broadcastMessage(ChatColor.GREEN + p.getName() + ChatColor.WHITE + " lade sig i s�ngen och g�r dag till alla!");
				
				
		}
	}
		else {
			e.getPlayer().sendMessage(ChatColor.GREEN + "Zzz");
		}
	}
@EventHandler
public void PlayerEventLeave(PlayerBedLeaveEvent e) {
	Player p = (Player) e.getPlayer();
	if (p.getWorld() == Bukkit.getWorld("world")) {
	    p.getWorld().setTime(23500);
	    Bukkit.broadcastMessage("Godmorgon!");
	}
}
}
