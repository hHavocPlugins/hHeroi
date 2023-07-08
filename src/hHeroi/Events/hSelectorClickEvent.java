package hHeroi.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import hHeroi.Config.hPlayerCFG;

public class hSelectorClickEvent implements Listener{

	@EventHandler
	void hSelector(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getTitle().equals("§7Selecionar Heroi")) {
			e.setCancelled(true);
			
			if (e.getCurrentItem().getType() == Material.AIR) return;
			if (e.getCurrentItem().getType() == null) return;
			
			if (e.getCurrentItem().hasItemMeta()) {
				
				if (e.getCurrentItem().getType() == Material.SKULL_ITEM) {
					
					if (e.getSlot() == 10) {
						if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("duolingo")) {
							
							hPlayerCFG.get().set(p.getName() + ".heroi", "duolingo");
							hPlayerCFG.save();
							p.sendMessage("§aVoce selecionou o heroi com sucesso !");
							p.closeInventory();
							return;
							
						}else {
							p.sendMessage("§cVoce nao possui esse heroi");
							p.closeInventory();
							return;
						}
						
					}
					
					if (e.getSlot() == 11) {
						if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("jake")) {
							
							hPlayerCFG.get().set(p.getName() + ".heroi", "jake");
							hPlayerCFG.save();
							p.sendMessage("§aVoce selecionou o heroi com sucesso !");
							p.closeInventory();
							return;
							
						}else {
							p.sendMessage("§cVoce nao possui esse heroi");
							p.closeInventory();
							return;
						}
						
					}
						
					if (e.getSlot() == 12) {
						if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("sonic")) {
							
							hPlayerCFG.get().set(p.getName() + ".heroi", "sonic");
							hPlayerCFG.save();
							p.sendMessage("§aVoce selecionou o heroi com sucesso !");
							p.closeInventory();
							return;
							
						}else {
							p.sendMessage("§cVoce nao possui esse heroi");
							p.closeInventory();
							return;
						}
					}
					
					if (e.getSlot() == 13) {
						if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("bob")) {
							
							hPlayerCFG.get().set(p.getName() + ".heroi", "bob");
							hPlayerCFG.save();
							p.sendMessage("§aVoce selecionou o heroi com sucesso !");
							p.closeInventory();
							return;
							
						}else {
							p.sendMessage("§cVoce nao possui esse heroi");
							p.closeInventory();
							return;
						}
					}
					
					if (e.getSlot() == 14) {
						if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("technoblade")) {
							
							hPlayerCFG.get().set(p.getName() + ".heroi", "technoblade");
							hPlayerCFG.save();
							p.sendMessage("§aVoce selecionou o heroi com sucesso !");
							p.closeInventory();
							return;
							
						}else {
							p.sendMessage("§cVoce nao possui esse heroi");
							p.closeInventory();
							return;
						}
					}
					
					if (e.getSlot() == 15) {
						if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("amongus")) {
							
							hPlayerCFG.get().set(p.getName() + ".heroi", "amongus");
							hPlayerCFG.save();
							p.sendMessage("§aVoce selecionou o heroi com sucesso !");
							p.closeInventory();
							return;
							
						}else {
							p.sendMessage("§cVoce nao possui esse heroi");
							p.closeInventory();
							return;
						}
					}
					
					if (e.getSlot() == 16) {
						if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("chica")) {
							
							hPlayerCFG.get().set(p.getName() + ".heroi", "chica");
							hPlayerCFG.save();
							p.sendMessage("§aVoce selecionou o heroi com sucesso !");
							p.closeInventory();
							return;
							
						}else {
							p.sendMessage("§cVoce nao possui esse heroi");
							p.closeInventory();
							return;
						}
					}
				}
			
				if (e.getCurrentItem().getType() == Material.BARRIER) {
					p.sendMessage("§aVoce selecionou ninguem' como heroi !");
					hPlayerCFG.get().set(p.getName() + ".heroi", "ninguem");
					hPlayerCFG.save();
					p.closeInventory();
					return;
				}
			
			}
		}
	}
}
