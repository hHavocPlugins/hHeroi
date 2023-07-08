package hHeroi.Utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

public class Items {

	static String duolingo = "http://textures.minecraft.net/texture/7235f16ed4440cc29ece8f4333d0175548321f085e3d14b7cb1eeb6a4ee35b01";
	static String jake = "http://textures.minecraft.net/texture/64910b0b22c982ea31725b3e43a18fa07b322011d28b06b7cf28bcf425a2006f";
	static String sonic = "http://textures.minecraft.net/texture/ead920fafa2c302b20a0d57509929da48a4d11bdeafcf003263750bd89de3131";
	static String bob = "http://textures.minecraft.net/texture/197f5a811f24d92e766ea5985a154058f2f3ed65fc9b46e00cd20c4c40eb5add";
	static String technoblade = "http://textures.minecraft.net/texture/e99ac794e39af428a27beda5541cdb37c5d2f8ae8fbb9cf557032d0507b6a149";
	static String amongus = "http://textures.minecraft.net/texture/56b503694116ef544acd882c21864af4381acb5102038197f9dc5dea190b9408";
	static String chica = "http://textures.minecraft.net/texture/bb4fe6575ef46d77fae16103c9d9c257b2c6a661afed4159de53ad75d961f6";
	
	public static void addDuolingo(Player p) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName("§7Heroi > Doulingo");
        GameProfile profile = new GameProfile(UUID.randomUUID(), (String) null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", duolingo).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));

        try {
            Field profileField = skullMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(skullMeta, profile);
        } catch (Throwable var6) {
            var6.printStackTrace();
        }

        ArrayList<String> encatamentoslore = new ArrayList<>();
        encatamentoslore.add("");
        encatamentoslore.add("§7Esse heroi lhe da habilidades irreais");
        encatamentoslore.add("");
        encatamentoslore.add("§7Clique com o Direito para usar");
        skullMeta.setLore(encatamentoslore);
        
        skull.setItemMeta(skullMeta);
        p.getInventory().addItem(skull);
	}

	public static void addJake(Player p) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName("§7Heroi > Jake");
        GameProfile profile = new GameProfile(UUID.randomUUID(), (String) null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", jake).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));

        try {
            Field profileField = skullMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(skullMeta, profile);
        } catch (Throwable var6) {
            var6.printStackTrace();
        }

        ArrayList<String> encatamentoslore = new ArrayList<>();
        encatamentoslore.add("");
        encatamentoslore.add("§7Esse heroi lhe da habilidades irreais");
        encatamentoslore.add("");
        encatamentoslore.add("§7Clique com o Direito para usar");
        skullMeta.setLore(encatamentoslore);
        
        skull.setItemMeta(skullMeta);
        p.getInventory().addItem(skull);
	}

	public static void addSonic(Player p) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName("§7Heroi > Sonic");
        GameProfile profile = new GameProfile(UUID.randomUUID(), (String) null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", sonic).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));

        try {
            Field profileField = skullMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(skullMeta, profile);
        } catch (Throwable var6) {
            var6.printStackTrace();
        }

        ArrayList<String> encatamentoslore = new ArrayList<>();
        encatamentoslore.add("");
        encatamentoslore.add("§7Esse heroi lhe da habilidades irreais");
        encatamentoslore.add("");
        encatamentoslore.add("§7Clique com o Direito para usar");
        skullMeta.setLore(encatamentoslore);
        
        skull.setItemMeta(skullMeta);
        p.getInventory().addItem(skull);
	}
	
	public static void addBob(Player p) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName("§7Heroi > Bob");
        GameProfile profile = new GameProfile(UUID.randomUUID(), (String) null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", bob).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));

        try {
            Field profileField = skullMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(skullMeta, profile);
        } catch (Throwable var6) {
            var6.printStackTrace();
        }

        ArrayList<String> encatamentoslore = new ArrayList<>();
        encatamentoslore.add("");
        encatamentoslore.add("§7Esse heroi lhe da habilidades irreais");
        encatamentoslore.add("");
        encatamentoslore.add("§7Clique com o Direito para usar");
        skullMeta.setLore(encatamentoslore);
        
        skull.setItemMeta(skullMeta);
        p.getInventory().addItem(skull);
	}
	
	public static void addTecno(Player p) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName("§7Heroi > Technoblade");
        GameProfile profile = new GameProfile(UUID.randomUUID(), (String) null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", technoblade).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));

        try {
            Field profileField = skullMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(skullMeta, profile);
        } catch (Throwable var6) {
            var6.printStackTrace();
        }

        ArrayList<String> encatamentoslore = new ArrayList<>();
        encatamentoslore.add("");
        encatamentoslore.add("§7Esse heroi lhe da habilidades irreais");
        encatamentoslore.add("");
        encatamentoslore.add("§7Clique com o Direito para usar");
        skullMeta.setLore(encatamentoslore);
        
        skull.setItemMeta(skullMeta);
        p.getInventory().addItem(skull);
	}
	
	public static void addAmongus(Player p) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName("§7Heroi > Amongus");
        GameProfile profile = new GameProfile(UUID.randomUUID(), (String) null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", amongus).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));

        try {
            Field profileField = skullMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(skullMeta, profile);
        } catch (Throwable var6) {
            var6.printStackTrace();
        }

        ArrayList<String> encatamentoslore = new ArrayList<>();
        encatamentoslore.add("");
        encatamentoslore.add("§7Esse heroi lhe da habilidades irreais");
        encatamentoslore.add("");
        encatamentoslore.add("§7Clique com o Direito para usar");
        skullMeta.setLore(encatamentoslore);
        
        skull.setItemMeta(skullMeta);
        p.getInventory().addItem(skull);
	}
	
	public static void addChica(Player p) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName("§7Heroi > Chica");
        GameProfile profile = new GameProfile(UUID.randomUUID(), (String) null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", chica).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));

        try {
            Field profileField = skullMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(skullMeta, profile);
        } catch (Throwable var6) {
            var6.printStackTrace();
        }

        ArrayList<String> encatamentoslore = new ArrayList<>();
        encatamentoslore.add("");
        encatamentoslore.add("§7Esse heroi lhe da habilidades irreais");
        encatamentoslore.add("");
        encatamentoslore.add("§7Clique com o Direito para usar");
        skullMeta.setLore(encatamentoslore);
        
        skull.setItemMeta(skullMeta);
        p.getInventory().addItem(skull);
	}
	
}
