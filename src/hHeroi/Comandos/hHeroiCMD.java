package hHeroi.Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import hHeroi.Main;
import hHeroi.Utils.Inventarios;
import hHeroi.Utils.Items;

public class hHeroiCMD implements CommandExecutor{

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
			
		if (cmd.getName().equalsIgnoreCase("heroi")) {
			
			if (sender instanceof Player) {
				Player p = (Player) sender;
				if (args.length == 0) {
					Inventarios.hHeroiInv(p);
					return true;
				}
				
				if (!p.hasPermission("hHeroi.admin")) {
					p.sendMessage("§eVoce nao tem permissao para executar esse comando");
					return true;
				}
				
				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("help")) {
						p.sendMessage("   §eLista de §6§lComandos");
						p.sendMessage("");
						p.sendMessage("§e/heroi help");
						p.sendMessage("§e/heroi reload");
						p.sendMessage("§e/heroi list");
						p.sendMessage("§e/heroi give <jogador> <Heroi>");
						p.sendMessage("");
						return true;
					}else if (args[0].equalsIgnoreCase("reload")) {
						p.sendMessage("§eConfigs foram recarregado com sucesso !");
						Main.getInstance().reloadConfig();
						return true;
					}else if (args[0].equalsIgnoreCase("give")) {
						p.sendMessage("§eUse /heroi give <jogador> <Heroi> - Envie Estrelas de Heroi a um jogador");
						return true;
					}else if (args[0].equalsIgnoreCase("list")){
						p.sendMessage("§eOs herois Sao: sonic,jake,amongus,bob,duolingo,technoblade,chica");
						return true;
					}else {
						p.sendMessage("§eEsse comando nao existe !");
						return true;
					}
				}
				
				if (args.length == 3) {
					if (args[0].equalsIgnoreCase("give")) {
						String player = args[1];
						Player target = Bukkit.getPlayerExact(player);
						
						if (target == null) {
							p.sendMessage("§eEsse jogador nao foi encontrado.");
							return true;
						}else {
							
							if (args[2].equalsIgnoreCase("duolingo")) {
								p.sendMessage("§aItem foi adicionado com sucesso ao jogador " + target.getName());
								Items.addDuolingo(target);
								return true;
							}else if (args[2].equalsIgnoreCase("jake")) {
								p.sendMessage("§aItem foi adicionado com sucesso ao jogador " + target.getName());
								Items.addJake(target);
								return true;
							}else if (args[2].equalsIgnoreCase("sonic")) {
								p.sendMessage("§aItem foi adicionado com sucesso ao jogador " + target.getName());
								Items.addSonic(target);
								return true;
							}else if (args[2].equalsIgnoreCase("bob")) {
								p.sendMessage("§aItem foi adicionado com sucesso ao jogador " + target.getName());
								Items.addBob(target);
								return true;
							}else if (args[2].equalsIgnoreCase("technoblade")) {
								p.sendMessage("§aItem foi adicionado com sucesso ao jogador " + target.getName());
								Items.addTecno(target);
								return true;
							}else if (args[2].equalsIgnoreCase("amongus")) {
								p.sendMessage("§aItem foi adicionado com sucesso ao jogador " + target.getName());
								Items.addAmongus(target);
								return true;
							}else if (args[2].equalsIgnoreCase("chica")) {
								p.sendMessage("§aItem foi adicionado com sucesso ao jogador " + target.getName());
								Items.addChica(target);
								return true;
							}
							
						}
						
					}
				}
				
			}else {
				Bukkit.getConsoleSender().sendMessage("");
				Bukkit.getConsoleSender().sendMessage("§9[hHeroi] §eApenas Jogadores pode executar esse comando");
				Bukkit.getConsoleSender().sendMessage("");
			}
			
		}
		
		return false;
	}

}
