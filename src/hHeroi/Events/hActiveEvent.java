package hHeroi.Events;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import hHeroi.Config.hPlayerCFG;

public class hActiveEvent implements Listener{

	@EventHandler
	void ativar(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		ItemStack hand = p.getItemInHand();
	
		if (hand.hasItemMeta()) {
			if (hand.getItemMeta().hasDisplayName()) {
				if (hand.getType() == Material.SKULL_ITEM) {
					
					if (hand.getItemMeta().getDisplayName().equals("§7Heroi > Doulingo")) {
						
						if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
							
							if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("duolingo")) {
								p.sendMessage("§cVoce ja possui esse heroi em sua conta !");
							}else {
								p.sendMessage("§aHeroi foi ativado com sucesso na sua conta !");
								ArrayList<String> add = new ArrayList<>(hPlayerCFG.get().getStringList(p.getName() + ".herois"));
								add.add("duolingo");
								hPlayerCFG.get().set(p.getName() + ".herois", add);
								hPlayerCFG.save();
								
								if (p.getItemInHand().getAmount() > 1) {
									p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
								}else {
									p.setItemInHand(null);
								}
								
							}
							
						}
						
						e.setCancelled(true);		
					}
					
					if (hand.getItemMeta().getDisplayName().equals("§7Heroi > Jake")) {
						if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
							
							if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("jake")) {
								p.sendMessage("§cVoce ja possui esse heroi em sua conta !");
							}else {
								p.sendMessage("§aHeroi foi ativado com sucesso na sua conta !");
								ArrayList<String> add = new ArrayList<>(hPlayerCFG.get().getStringList(p.getName() + ".herois"));
								add.add("jake");
								hPlayerCFG.get().set(p.getName() + ".herois", add);
								hPlayerCFG.save();
							
								if (p.getItemInHand().getAmount() > 1) {
									p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
								}else {
									p.setItemInHand(null);
								}
							
							}
						}
						
						e.setCancelled(true);
					}

					if (hand.getItemMeta().getDisplayName().equals("§7Heroi > Sonic")) {
						if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
							
							if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("sonic")) {
								p.sendMessage("§cVoce ja possui esse heroi em sua conta !");
							}else {
								p.sendMessage("§aHeroi foi ativado com sucesso na sua conta !");
								ArrayList<String> add = new ArrayList<>(hPlayerCFG.get().getStringList(p.getName() + ".herois"));
								add.add("sonic");
								hPlayerCFG.get().set(p.getName() + ".herois", add);
								hPlayerCFG.save();
							
								if (p.getItemInHand().getAmount() > 1) {
									p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
								}else {
									p.setItemInHand(null);
								}
							
							}
							
						}
						
						e.setCancelled(true);
					}
					
					if (hand.getItemMeta().getDisplayName().equals("§7Heroi > Bob")) {
						if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
							
							if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("bob")) {
								p.sendMessage("§cVoce ja possui esse heroi em sua conta !");
							}else {
								p.sendMessage("§aHeroi foi ativado com sucesso na sua conta !");
								ArrayList<String> add = new ArrayList<>(hPlayerCFG.get().getStringList(p.getName() + ".herois"));
								add.add("bob");
								hPlayerCFG.get().set(p.getName() + ".herois", add);
								hPlayerCFG.save();
							
								if (p.getItemInHand().getAmount() > 1) {
									p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
								}else {
									p.setItemInHand(null);
								}
							
							}
							
						}
						e.setCancelled(true);
					}
					
					if (hand.getItemMeta().getDisplayName().equals("§7Heroi > Technoblade")) {
						if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
							
							if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("technoblade")) {
								p.sendMessage("§cVoce ja possui esse heroi em sua conta !");
							}else {
								p.sendMessage("§aHeroi foi ativado com sucesso na sua conta !");
								ArrayList<String> add = new ArrayList<>(hPlayerCFG.get().getStringList(p.getName() + ".herois"));
								add.add("technoblade");
								hPlayerCFG.get().set(p.getName() + ".herois", add);
								hPlayerCFG.save();
							
								if (p.getItemInHand().getAmount() > 1) {
									p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
								}else {
									p.setItemInHand(null);
								}
							
							}
							
						}
						e.setCancelled(true);
					}
					
					if (hand.getItemMeta().getDisplayName().equals("§7Heroi > Amongus")) {
						if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
							
							if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("amongus")) {
								p.sendMessage("§cVoce ja possui esse heroi em sua conta !");
							}else {
								p.sendMessage("§aHeroi foi ativado com sucesso na sua conta !");
								ArrayList<String> add = new ArrayList<>(hPlayerCFG.get().getStringList(p.getName() + ".herois"));
								add.add("amongus");
								hPlayerCFG.get().set(p.getName() + ".herois", add);
								hPlayerCFG.save();
							
								if (p.getItemInHand().getAmount() > 1) {
									p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
								}else {
									p.setItemInHand(null);
								}
							
							}
							
						}
						e.setCancelled(true);
					}
					
					if (hand.getItemMeta().getDisplayName().equals("§7Heroi > Chica")) {
						if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
							
							if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("chica")) {
								p.sendMessage("§cVoce ja possui esse heroi em sua conta !");
							}else {
								p.sendMessage("§aHeroi foi ativado com sucesso na sua conta !");
								ArrayList<String> add = new ArrayList<>(hPlayerCFG.get().getStringList(p.getName() + ".herois"));
								add.add("chica");
								hPlayerCFG.get().set(p.getName() + ".herois", add);
								hPlayerCFG.save();
							
								if (p.getItemInHand().getAmount() > 1) {
									p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
								}else {
									p.setItemInHand(null);
								}
							
							}
							
						}
						e.setCancelled(true);
					}
				}
			}
		}
	}
}
