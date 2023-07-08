package hHeroi.Events;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import hHeroi.Config.hPlayerCFG;

public class RegisterP implements Listener{

	@EventHandler
	void V1tin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		ArrayList<String> lore = new ArrayList<>();
		lore.add("");

		if (hPlayerCFG.get().get(p.getName() + ".heroi") == null) {
			hPlayerCFG.get().set(p.getName() + ".heroi", "ninguem");
			hPlayerCFG.save();
		}
		
		if (hPlayerCFG.get().get(p.getName() + ".estrelas") == null) {
			hPlayerCFG.get().set(p.getName() + ".estrelas", Float.valueOf(0));
			hPlayerCFG.save();
		}

		if (hPlayerCFG.get().get(p.getName() + ".herois") == null) {
			hPlayerCFG.get().set(p.getName() + ".herois", lore);
			hPlayerCFG.save();
		}
		
	}
}
