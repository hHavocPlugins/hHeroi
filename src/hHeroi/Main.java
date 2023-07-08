package hHeroi;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import hHeroi.Comandos.hHeroiCMD;
import hHeroi.Config.hPlayerCFG;
import hHeroi.Events.RegisterP;
import hHeroi.Events.hActiveEvent;
import hHeroi.Events.hHeroiClickEvent;
import hHeroi.Events.hSelectorClickEvent;
import hHeroi.Events.hTodosClickEvent;
import hHeroi.Habilidades.hHabilidadeHeroi;

public class Main  extends JavaPlugin {

	//vai ter varios plushie para selecionar e cada um tem seu poder e açao especial dentro do servidor 
	
	public static PluginManager pm = Bukkit.getPluginManager();
	private static Main main;
	public static Main getInstance() {
		return main;
	}
	
	@Override
	public void onEnable() {
		main = this;
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("§9[hHeroi] §ePlugin esta sendo iniciado");
		Bukkit.getConsoleSender().sendMessage("");
		Comandos(); hPlayerCFG.setup(); saveDefaultConfig(); Eventos(); Habilidades();
		
	}
	
	void Comandos() {
		getCommand("heroi").setExecutor(new hHeroiCMD());
	}
	
	void Eventos() {
		pm.registerEvents(new RegisterP(), this);
		pm.registerEvents(new hHeroiClickEvent(), this);
		pm.registerEvents(new hSelectorClickEvent(), this);
		pm.registerEvents(new hTodosClickEvent(), this);
		pm.registerEvents(new hActiveEvent(), this);	
	}
	
	void Habilidades() {
		pm.registerEvents(new hHabilidadeHeroi(), this);
	}
	
	@Override
	public void onDisable() {
		main = null;
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("§9[hHeroi] §ePlugin esta sendo desligado");
		Bukkit.getConsoleSender().sendMessage("");
	}
	
}
