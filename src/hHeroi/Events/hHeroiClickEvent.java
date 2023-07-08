package hHeroi.Events;


import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import hHeroi.Utils.Inventarios;

public class hHeroiClickEvent implements Listener{

	@SuppressWarnings("deprecation")
	@EventHandler
	void click(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getName().equals("§7Menu de Heroi")) {
			e.setCancelled(true);
			
			if (e.getCurrentItem().getType() == Material.AIR) return;
			if (e.getCurrentItem().getType() == null) return;
			
			if (e.getCurrentItem().hasItemMeta()) {
				
				if (e.getCurrentItem().getType() == Material.SKULL_ITEM) {
					
					if (e.getSlot() == 11) {
						Inventarios.hSelectorInv(p);
					}
					
					if (e.getSlot() == 15) {
					}
					
					if (e.getSlot() == 16) {
						Inventarios.hHeroisTodosInv(p);
					}
					
				}
				
				if (e.getCurrentItem().getType() ==  Material.BARRIER) {
					Inventarios.hSelectorInv(p);
				}
				
				if (e.getCurrentItem().getType() == Material.getMaterial(342)) {
					p.sendMessage("§eEsse menu esta em desenvolvimento aguarde por atualizaçoes");
					p.closeInventory();
				}
			
			}
			
		}
	
	}
	
}
