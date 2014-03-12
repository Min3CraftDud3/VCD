package com.min3craftdud3.VCDrops;

import org.bukkit.plugin.java.JavaPlugin;

public class VCDrops extends JavaPlugin{
    Listen ln = new Listen(this);
	public void onEnable(){
		getServer().getPluginManager.registerEvents(ln,this);
	}
	public static void createChest(){
	}
    public static void createFolder(){
    }
    public static void createConfig(){
    }
}
