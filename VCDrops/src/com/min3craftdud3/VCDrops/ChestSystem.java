package com.min3craftdud3.VCDrops;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;

public class ChestSystem {
	static VCDrops plugin;
	public ChestSystem(VCDrops instance){
		plugin = instance;
	}
	public static void createChest() throws IOException{
		File settingsFile = new File(plugin.getDataFolder() + File.separator + "settings.yml");
		if(!settingsFile.exists()){
			settingsFile.createNewFile();
		    FileConfiguration fc = YamlConfiguration.loadConfiguration(settingsFile);
		    fc.set("VCD.Rarities.Amount",4);
		    fc.set("VCD.Rarities.0", "Common");
		    fc.set("VCD.Rarities.1", "Uncommon");
		    fc.set("VCD.Rarities.2", "Normal");
		    fc.set("VCD.Rarities.3", "Rare");
		    //Common
		    fc.set("VCD.Rarity.Common.Amount", 16);
		    fc.set("VCD.Rarity.Common.0", "WOOL");
		    fc.set("VCD.Rarity.Common.1", "STICK");
		    fc.set("VCD.Rarity.Common.2", "STRING");
		    fc.set("VCD.Rarity.Common.3", "PAPER");
		    fc.set("VCD.Rarity.Common.4", "SEEDS");
		    fc.set("VCD.Rarity.Common.5", "GLASS_BOTTLE");
		    fc.set("VCD.Rarity.Common.6", "COOKED_BEEF");
		    fc.set("VCD.Rarity.Common.7", "CLAY_BALL");
		    fc.set("VCD.Rarity.Common.8", "GRILLED_PORK");
		    fc.set("VCD.Rarity.Common.9", "BLAZE_ROD");
		    fc.set("VCD.Rarity.Common.10", "LEATHER_BOOTS");
		    fc.set("VCD.Rarity.Common.11", "LEATHER_CHESTPLATE");
		    fc.set("VCD.Rarity.Common.12", "LEATHER_LEGGINGS");
		    fc.set("VCD.Rarity.Common.13", "LEATHER_HELMET");
		    fc.set("VCD.Rarity.Common.14", "WOOD_HOE");
		    fc.set("VCD.Rarity.Common.15", "PUMPKIN_SEEDS");
		    fc.set("VCD.Rarity.Common.16", "MELON_SEEDS");
		    //Uncommon 
		    fc.set("VCD.Rarity.Uncommon.Amount", 16);
		    fc.set("VCD.Rarity.Uncommon.0", "WOOL");
		    fc.set("VCD.Rarity.Uncommon.1", "STICK");
		    fc.set("VCD.Rarity.Uncommon.2", "STRING");
		    fc.set("VCD.Rarity.Uncommon.3", "PAPER");
		    fc.set("VCD.Rarity.Uncommon.4", "SEEDS");
		    fc.set("VCD.Rarity.Uncommon.5", "GLASS_BOTTLE");
		    fc.set("VCD.Rarity.Uncommon.6", "COOKED_BEEF");
		    fc.set("VCD.Rarity.Uncommon.7", "CLAY_BALL");
		    fc.set("VCD.Rarity.Uncommon.8", "GRILLED_PORK");
		    fc.set("VCD.Rarity.Uncommon.9", "BLAZE_ROD");
		    fc.set("VCD.Rarity.Uncommon.10", "LEATHER_BOOTS");
		    fc.set("VCD.Rarity.Uncommon.11", "LEATHER_CHESTPLATE");
		    fc.set("VCD.Rarity.Uncommon.12", "LEATHER_LEGGINGS");
		    fc.set("VCD.Rarity.Uncommon.13", "LEATHER_HELMET");
		    fc.set("VCD.Rarity.Uncommon.14", "WOOD_HOE");
		    fc.set("VCD.Rarity.Uncommon.15", "PUMPKIN_SEEDS");
		    fc.set("VCD.Rarity.Uncommon.16", "MELON_SEEDS");
		    //Rarity Normal
		    fc.set("VCD.Rarity.Normal.Amount", 18);
		    fc.set("VCD.Rarity.Normal.0", "WOOL");
		    fc.set("VCD.Rarity.Normal.1", "STICK");
		    fc.set("VCD.Rarity.Normal.2", "STRING");
		    fc.set("VCD.Rarity.Normal.3", "PAPER");
		    fc.set("VCD.Rarity.Normal.4", "SEEDS");
		    fc.set("VCD.Rarity.Normal.5", "GLASS_BOTTLE");
		    fc.set("VCD.Rarity.Normal.6", "COOKED_BEEF");
		    fc.set("VCD.Rarity.Normal.7", "CLAY_BALL");
		    fc.set("VCD.Rarity.Normal.8", "GRILLED_PORK");
		    fc.set("VCD.Rarity.Normal.9", "BLAZE_ROD");
		    fc.set("VCD.Rarity.Normal.10", "WOOD_HOE");
		    fc.set("VCD.Rarity.Normal.11", "IRON_HOE");
		    fc.set("VCD.Rarity.Normal.12", "GOLD_HOE");
		    fc.set("VCD.Rarity.Normal.13", "IRON_BOOTS");
		    fc.set("VCD.Rarity.Normal.14", "IRON_CHESTPLATE");
		    fc.set("VCD.Rarity.Normal.15", "IRON_LEGGINGS");
		    fc.set("VCD.Rarity.Normal.16", "IRON_HELMET");
		    fc.set("VCD.Rarity.Normal.17", "MELON_SEEDS");
		    fc.set("VCD.Rarity.Normal.18", "PUMPKIN_SEEDS");
		    //Rarity Rare
		    fc.set("VCD.Rarity.Rare.Amount", 15);
		    fc.set("VCD.Rarity.Rare.0", "WOOD_HOE");
		    fc.set("VCD.Rarity.Rare.1", "IRON_HOE");
		    fc.set("VCD.Rarity.Rare.2", "GOLD_HOE");
		    fc.set("VCD.Rarity.Rare.3", "DIAMOND_HOE");
		    fc.set("VCD.Rarity.Rare.4", "GOLD_BOOTS");
		    fc.set("VCD.Rarity.Rare.5", "GOLD_LEGGINGS");
		    fc.set("VCD.Rarity.Rare.6", "GOLD_CHESTPLATE");
		    fc.set("VCD.Rarity.Rare.7", "GOLD_HELMET");
		    fc.set("VCD.Rarity.Rare.8", "DIAMOND_BOOTS");
		    fc.set("VCD.Rarity.Rare.9", "DIAMOND_LEGGINGS");
		    fc.set("VCD.Rarity.Rare.10", "DIAMOND_CHESTPLATE");
		    fc.set("VCD.Rarity.Rare.11", "DIAMOND_HELMET");
		    fc.set("VCD.Rarity.Rare.12", "CLAY_BALL");
		    fc.set("VCD.Rarity.Rare.13", "MELON_SEEDS");
		    fc.set("VCD.Rarity.Rare.14", "PUMPKIN_SEEDS");
		    fc.set("VCD.Rarity.Rare.15", "SEEDS");
		    fc.set("Chest.X","location");
		    fc.save(settingsFile);
		}
	}
	public static String[] getRarity(){
		File settingsFile = new File(plugin.getDataFolder() + File.separator + "settings.yml");
		if(settingsFile.exists()){
		    FileConfiguration fc = YamlConfiguration.loadConfiguration(settingsFile);
		    int amnt = fc.getInt("VCD.Rarities.Amount");
		    String ar[] = new String[amnt];
		    for(int i=0;i<amnt;i++){
		    	ar[i]=fc.getString("VCD.Rarities."+i);
		    }
		    return ar;
		}
		return null;
	}
	public static void addChest(Location l, int rarity, String town) throws IOException{
		Random rand = new Random();
		File settingsFile = new File(plugin.getDataFolder() + File.separator + "settings.yml");
		if(settingsFile.exists()){
		    FileConfiguration fc = YamlConfiguration.loadConfiguration(settingsFile);
		    for(int i = 0;i<500;i++){
		    	if(!fc.contains("Chest."+i)){
		    		fc.set("Chest."+i+".Location.World",l.getWorld().getName());
		    		fc.set("Chest."+i+".Location.X",l.getX());
		    		fc.set("Chest."+i+".Location.Y",l.getY());
		    		fc.set("Chest."+i+".Location.Z",l.getZ());
		    		fc.set("Chest."+i+".Rarity",rarity);
		    		fc.set("Chest."+i+".Town",town);
		    		World w = l.getWorld();
		    		w.getBlockAt(l).setType(Material.CHEST);
		    		Block bl = w.getBlockAt(l);
		    		Chest c = (Chest)bl.getState();
		    		int chestRand = rand.nextInt(5)+1;
		    		String path = fc.getString("VCD.Rarities."+rarity);
		    		for(int j=0;j<chestRand;j++){
	    				int rr = rand.nextInt(fc.getInt("VCD.Rarity."+path+".Amount"));
	    				c.getInventory().addItem(new ItemStack(Material.getMaterial(fc.getString("VCD.Rarity."+path+"."+rr)),1));
	    			}
		    		break;
		    	}
		    }
		    fc.save(settingsFile);
		}
	}
	public static void regenAllChests(){
		Random rand = new Random();
		File settingsFile = new File(plugin.getDataFolder() + File.separator + "settings.yml");
		if(settingsFile.exists()){
		    FileConfiguration fc = YamlConfiguration.loadConfiguration(settingsFile);
		    for(int i = 0;i<500;i++){
		    	if(fc.contains("Chest."+i)){
		    		World w = Bukkit.getWorld(fc.getString("Chest."+i+".Location.World"));
		    		double x = fc.getDouble("Chest."+i+".Location.X");
		    		double y = fc.getDouble("Chest."+i+".Location.Y");
		    		double z = fc.getDouble("Chest."+i+".Location.Z");
		    		int r = (int)fc.getDouble("Chest."+i+".Rarity");
		    		@SuppressWarnings("unused")
					String t = fc.getString("Chest."+i+".Town");
		    		Location l = new Location(w,x,y,z);
		    		w.getBlockAt(l).setType(Material.CHEST);
		    		Block bl = w.getBlockAt(l);
		    		Chest c = (Chest)bl.getState();
		    		int chestRand = rand.nextInt(5)+1;
		    		if(r == 0){
		    			for(int j=0;j<chestRand;j++){
		    				int rr = rand.nextInt(13);
		    				c.getInventory().addItem(new ItemStack(Material.getMaterial(fc.getString("Zambiez.Rarity.Common."+rr)),1));
		    			}
		    		}else if(r == 1){
		    			for(int j=0;j<chestRand;j++){
		    				int rs = rand.nextInt(16);
		    				c.getInventory().addItem(new ItemStack(Material.getMaterial(fc.getString("Zambiez.Rarity.Normal."+rs)),1));
		    			}
		    		}else if(r == 2){
		    			for(int j=0;j<chestRand;j++){
		    				int rq = rand.nextInt(11);
		    				c.getInventory().addItem(new ItemStack(Material.getMaterial(fc.getString("Zambiez.Rarity.Rare."+rq)),1));
		    			}
		    		}
		    	}
		    }
		}
	}
}
