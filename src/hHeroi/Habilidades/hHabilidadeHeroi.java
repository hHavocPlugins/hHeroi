package hHeroi.Habilidades;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import hHeroi.Main;
import hHeroi.Config.hPlayerCFG;

public class hHabilidadeHeroi implements Listener{

	@EventHandler
	void event(PlayerJoinEvent e) {
		Player p = e.getPlayer();
	
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				ArrayList<String> permsDuolingo =  new ArrayList<>(Main.getInstance().getConfig().getStringList("Habilidades.duolingo.permissions"));
				ArrayList<String> permsJake =  new ArrayList<>(Main.getInstance().getConfig().getStringList("Habilidades.jake.permissions"));
				ArrayList<String> permsSonic =  new ArrayList<>(Main.getInstance().getConfig().getStringList("Habilidades.sonic.permissions"));
				ArrayList<String> permsBob =  new ArrayList<>(Main.getInstance().getConfig().getStringList("Habilidades.bob.permissions"));
				ArrayList<String> permstechnoblade =  new ArrayList<>(Main.getInstance().getConfig().getStringList("Habilidades.technoblade.permissions"));
				ArrayList<String> permsAmongus =  new ArrayList<>(Main.getInstance().getConfig().getStringList("Habilidades.amongus.permissions"));
				ArrayList<String> permsChica =  new ArrayList<>(Main.getInstance().getConfig().getStringList("Habilidades.chica.permissions"));
				
				if (!p.isOnline()) {
					Bukkit.getScheduler().cancelAllTasks();
				}
				
				if (p.isOp()) {
					return;
				}
				
				if (hPlayerCFG.get().getString(p.getName() + ".heroi").equals("ninguem")) {
					return;
				}
				if (hPlayerCFG.get().getString(p.getName() + ".heroi").equals("duolingo")){
					for (String perm : permsDuolingo) {
						if (!p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Setar").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
					}
					for (String perm : permsJake) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
					}
					for (String perm : permsSonic) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsBob) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permstechnoblade) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsAmongus) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsChica) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
				}
				if (hPlayerCFG.get().getString(p.getName() + ".heroi").equals("jake")){
					for (String perm : permsDuolingo) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
					}
					for (String perm : permsJake) {
						if (!p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Setar").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
						
					}
					for (String perm : permsSonic) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
						
					}
					for (String perm : permsBob) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permstechnoblade) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsAmongus) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsChica) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
				}
				if (hPlayerCFG.get().getString(p.getName() + ".heroi").equals("sonic")){
					for (String perm : permsDuolingo) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
					}
					for (String perm : permsJake) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
						
					}
					for (String perm : permsSonic) {
						if (!p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Setar").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsBob) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}
					}
					for (String perm : permstechnoblade) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsAmongus) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsChica) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
				}
				if (hPlayerCFG.get().getString(p.getName() + ".heroi").equals("bob")){
					for (String perm : permsDuolingo) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
					}
					for (String perm : permsJake) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
						
					}
					for (String perm : permsSonic) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
						
					}
					for (String perm : permsBob) {
						if (!p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Setar").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permstechnoblade) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsAmongus) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}
					}
					for (String perm : permsChica) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
				}
				if (hPlayerCFG.get().getString(p.getName() + ".heroi").equals("technoblade")){
					for (String perm : permsDuolingo) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
					}
					for (String perm : permsJake) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
						
					}
					for (String perm : permsSonic) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
						
					}
					for (String perm : permsBob) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permstechnoblade) {
						if (!p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Setar").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsAmongus) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsChica) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
				}
				if (hPlayerCFG.get().getString(p.getName() + ".heroi").equals("amongus")){
					for (String perm : permsDuolingo) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
					}
					for (String perm : permsJake) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
						
					}
					for (String perm : permsSonic) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
						
					}
					for (String perm : permsBob) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permstechnoblade) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsAmongus) {
						if (!p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Setar").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsChica) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}
					}
				}
				if (hPlayerCFG.get().getString(p.getName() + ".heroi").equals("chica")){
					for (String perm : permsDuolingo) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
					}
					for (String perm : permsJake) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));
						}else {
							
						}
						
					}
					for (String perm : permsSonic) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
						
					}
					for (String perm : permsBob) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permstechnoblade) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsAmongus) {
						if (p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Remover").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
					for (String perm : permsChica) {
						if (!p.hasPermission(perm)) {
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Comando.Setar").replace("@player", p.getName()).replace("{perms}", perm));						
						}else {
							
						}
					}
				}
			}
		}, 0, 20);
	
	}
	
}
