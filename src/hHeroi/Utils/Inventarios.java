package hHeroi.Utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import hHeroi.Config.hPlayerCFG;

public class Inventarios {

	static String duolingo = "http://textures.minecraft.net/texture/7235f16ed4440cc29ece8f4333d0175548321f085e3d14b7cb1eeb6a4ee35b01";
	static String jake = "http://textures.minecraft.net/texture/64910b0b22c982ea31725b3e43a18fa07b322011d28b06b7cf28bcf425a2006f";
	static String sonic = "http://textures.minecraft.net/texture/ead920fafa2c302b20a0d57509929da48a4d11bdeafcf003263750bd89de3131";
	static String bob = "http://textures.minecraft.net/texture/197f5a811f24d92e766ea5985a154058f2f3ed65fc9b46e00cd20c4c40eb5add";
	static String technoblade = "http://textures.minecraft.net/texture/e99ac794e39af428a27beda5541cdb37c5d2f8ae8fbb9cf557032d0507b6a149";
	static String amongus = "http://textures.minecraft.net/texture/56b503694116ef544acd882c21864af4381acb5102038197f9dc5dea190b9408";
	static String chica = "http://textures.minecraft.net/texture/bb4fe6575ef46d77fae16103c9d9c257b2c6a661afed4159de53ad75d961f6";
	static String hambunger = "http://textures.minecraft.net/texture/e48b45905f6ed182092852cc49e1be79158fe2fd8465cdb2dcf7d811f81a70ac";
	static String moldel = "http://textures.minecraft.net/texture/52c1a3f03c4cad00f0007b1284965de9e7d7142e141dcb34ce7f22bb5ebf39eb";
	
	public static void hSelectorInv(Player p) {
		Inventory inv = Bukkit.createInventory(p, 5*9, "§7Selecionar Heroi");
		ArrayList<String> all = new ArrayList<>();
		all.add("");
		all.add("§7Esse heroi tem seus beneficios propio");
		all.add("");
		all.add("§7Clique §aaqui §7para selecionar");
		
		if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("duolingo")) {
			createSkull(p, inv, 10, duolingo, "§7Duolingo", all);
		}else {
			ArrayList<String> mondell = new ArrayList<>();
			mondell.add("");
			mondell.add("§7Voce nao possui esse heroi");
			mondell.add("");
			createSkull(p, inv, 10, moldel, "§7Duolingo", mondell);
		}
		
		if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("jake")) {
			createSkull(p, inv, 11, jake, "§7Jake", all);
		}else {
			ArrayList<String> mondell = new ArrayList<>();
			mondell.add("");
			mondell.add("§7Voce nao possui esse heroi");
			mondell.add("");
			createSkull(p, inv, 11, moldel, "§7Jake", mondell);
		}
		
		if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("sonic")) {
			createSkull(p, inv, 12, sonic, "§7Sonic", all);
		}else {
			ArrayList<String> mondell = new ArrayList<>();
			mondell.add("");
			mondell.add("§7Voce nao possui esse heroi");
			mondell.add("");
			createSkull(p, inv, 12, moldel, "§7Sonic", mondell);
		}
		
		if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("bob")) {
			createSkull(p, inv, 13, bob, "§7Bob", all);
		}else {
			ArrayList<String> mondell = new ArrayList<>();
			mondell.add("");
			mondell.add("§7Voce nao possui esse heroi");
			mondell.add("");
			createSkull(p, inv, 13, moldel, "§7Bob", mondell);
		}
		
		if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("technoblade")) {
			createSkull(p, inv, 14, technoblade, "§7Technoblade", all);
		}else {
			ArrayList<String> mondell = new ArrayList<>();
			mondell.add("");
			mondell.add("§7Voce nao possui esse heroi");
			mondell.add("");
			createSkull(p, inv, 14, moldel, "§7Technoblade", mondell);
		}
		
		if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("amongus")) {
			createSkull(p, inv, 15, amongus, "§7Amongus", all);
		}else {
			ArrayList<String> mondell = new ArrayList<>();
			mondell.add("");
			mondell.add("§7Voce nao possui esse heroi");
			mondell.add("");
			createSkull(p, inv, 15, moldel, "§7Amongus", mondell);
		}
		
		if (hPlayerCFG.get().getStringList(p.getName() + ".herois").contains("chica")) {
			createSkull(p, inv, 16, chica, "§7Chica", all);
		}else {
			ArrayList<String> mondell = new ArrayList<>();
			mondell.add("");
			mondell.add("§7Voce nao possui esse heroi");
			mondell.add("");
			createSkull(p, inv, 16, moldel, "§7Chica", mondell);
		}
		
		ItemStack drops = new ItemStack(Material.BARRIER);
		ItemMeta dropsm = drops.getItemMeta();
		dropsm.setDisplayName("§7Nenhum");
		ArrayList<String> lore = new ArrayList<>();
		lore.add("");
		lore.add("§7Retire o heroi que voce esta selecinado");
		lore.add("");
		lore.add("§7Clique §aaqui §7para remover seu heroi");
     	dropsm.setLore(lore);
		drops.setItemMeta(dropsm);
		inv.setItem(22, drops);
		
		p.openInventory(inv);
	}
	
	public static void hDropsInv(Player p) {
		Inventory inv = Bukkit.createInventory(p, 4*9, "§7Drops dos Herois");
	
		p.openInventory(inv);
	}
	
	public static void hHeroisTodosInv(Player p) {
		Inventory inv = Bukkit.createInventory(p, 4*9, "§7Todos os Herois");
		ArrayList<String> all = new ArrayList<>();
		all.add("");
		all.add("§7Herois do Servidor !");
		all.add("§7Eles estao esperando por voce");
		all.add("");
		createSkull(p, inv, 10, duolingo, "§7Duolingo", all);
		createSkull(p, inv, 11, jake, "§7Jake", all);
		createSkull(p, inv, 12, sonic, "§7Sonic", all);
		createSkull(p, inv, 13, duolingo, "§7Bob", all);
		createSkull(p, inv, 14, technoblade, "§7Technoblade", all);
		createSkull(p, inv, 15, amongus, "§7Amongus", all);
		createSkull(p, inv, 16, chica, "§7Chica", all);
		p.openInventory(inv);
	}
	
	@SuppressWarnings("deprecation")
	public static void hHeroiInv(Player p) {
		p.sendMessage("§aAbrindo Menu de herois !");
		Inventory inv = Bukkit.createInventory(p, 3*9, "§7Menu de Heroi");
		
		if (hPlayerCFG.get().getString(p.getName() + ".heroi").equalsIgnoreCase("ninguem")) {
			ItemStack item = new ItemStack(Material.BARRIER);
			ItemMeta itemm = item.getItemMeta();
			itemm.setDisplayName("§7Seu Heroi:");
			ArrayList<String> lore = new ArrayList<>();
			lore.add("");
			lore.add("  §a| §fHeroi: Nenhum");
			lore.add("  §a| §fDrops: 0");
			lore.add("");
			lore.add("§7Voce nao possui heroi selecionado");
			itemm.setLore(lore);
			item.setItemMeta(itemm);
			inv.setItem(11, item);
		}else if (hPlayerCFG.get().getString(p.getName() + ".heroi").equalsIgnoreCase("duolingo")){
			addSkull(p, inv, 11, duolingo, "Doulingo");
		}else if (hPlayerCFG.get().getString(p.getName() + ".heroi").equalsIgnoreCase("jake")){
			addSkull(p, inv, 11, jake, "Jake");
		}else if (hPlayerCFG.get().getString(p.getName() + ".heroi").equalsIgnoreCase("sonic")){
			addSkull(p, inv, 11, sonic, "Sonic");
		}else if (hPlayerCFG.get().getString(p.getName() + ".heroi").equalsIgnoreCase("bob")){
			addSkull(p, inv, 11, bob, "Bob");
		}else if (hPlayerCFG.get().getString(p.getName() + ".heroi").equalsIgnoreCase("technoblade")){
			addSkull(p, inv, 11, technoblade, "Technoblade");
		}else if (hPlayerCFG.get().getString(p.getName() + ".heroi").equalsIgnoreCase("amongus")){
			addSkull(p, inv, 11, amongus, "Amongus");
		}else if (hPlayerCFG.get().getString(p.getName() + ".heroi").equalsIgnoreCase("chica")){
			addSkull(p, inv, 11, chica, "Chica");
		}
		
		ItemStack drops = new ItemStack(Material.getMaterial(342));
		ItemMeta dropsm = drops.getItemMeta();
		dropsm.setDisplayName("§7Drops");
		ArrayList<String> lore = new ArrayList<>();
		lore.add("");
		lore.add("§7Pegue o Drop que seu heroi gerou !");
		lore.add("§a| §fTotal: 0"); // create total cfg
		lore.add("");
     	dropsm.setLore(lore);
		drops.setItemMeta(dropsm);
		
		ArrayList<String> hambunger1 = new ArrayList<>();
		hambunger1.add("");
		hambunger1.add("§7Status: 0/10k");
		hambunger1.add("");
		
		ArrayList<String> mondell = new ArrayList<>();
		mondell.add("");
		mondell.add("§7Veja todos os herois do servidor");
		mondell.add("");
		
		
		inv.setItem(14, drops);
		createSkull(p, inv, 15, hambunger, "§7Alimentacao", hambunger1);
		createSkull(p, inv, 16, moldel, "§7Herois", mondell);
		p.openInventory(inv);
	}
	
	@SuppressWarnings("unchecked")
	public static void createSkull(Player p,Inventory inv, int Slot, String url, String displayname,@SuppressWarnings("rawtypes") ArrayList lore) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName(displayname);
        GameProfile profile = new GameProfile(UUID.randomUUID(), (String) null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", url).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));

        try {
            Field profileField = skullMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(skullMeta, profile);
        } catch (Throwable var6) {
            var6.printStackTrace();
        }
        skullMeta.setLore(lore);
        skull.setItemMeta(skullMeta);
        inv.setItem(Slot, skull);
	}
	
	public static void addSkull(Player p,Inventory inv, int Slot, String url, String heroiname) {
		
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName("§7Seu Heroi:");
        GameProfile profile = new GameProfile(UUID.randomUUID(), (String) null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", url).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));

        try {
            Field profileField = skullMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(skullMeta, profile);
        } catch (Throwable var6) {
            var6.printStackTrace();
        }

        ArrayList<String> lore = new ArrayList<>();
		lore.add("");
		lore.add("  §a| §fHeroi: " + heroiname);
		lore.add("  §a| §fDrops: 0");
		lore.add("");
		lore.add("§7Voce esta usando o heroi: " + heroiname);
        skullMeta.setLore(lore);
        
        skull.setItemMeta(skullMeta);
        inv.setItem(Slot, skull);
		
	}
	
}
