package hHeroi.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class hTodosClickEvent implements Listener
{
	@EventHandler
	void todos(InventoryClickEvent e) {
		if (e.getInventory().getTitle().equals("§7Todos os Herois")) {
			e.setCancelled(true);
		}
	}
}
