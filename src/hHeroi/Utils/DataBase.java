package hHeroi.Utils;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class DataBase {
	
	private static ArrayList<String> players = new ArrayList<>();
	public static boolean hasPlayer(Player p) {
		return players.contains(p.getName());
	}
	
	public static void addPlayers(Player p) {
		if (!hasPlayer(p)) {
			if (p.isOnline()) {
				players.add(p.getName());
			}else {
				Bukkit.getConsoleSender().sendMessage("Error ao inserir jogador " + p.getName());
			}
		}
	}
	
	public static void removePlayer(Player p) {
		if (hasPlayer(p)) {
			
			if (p.isOnline()) {
				players.remove(p.getName());
			}else {
				Bukkit.getConsoleSender().sendMessage("Error ao remover jogador " + p.getName());
			}
			
		}else {
			addPlayers(p);
		}
	}
	
}