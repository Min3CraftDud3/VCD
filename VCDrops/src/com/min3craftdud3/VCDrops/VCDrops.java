package com.min3craftdud3.VCDrops;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class VCDrops extends JavaPlugin{
    Listen ln = new Listen(this);
    ChestSystem cs = new ChestSystem(this);
	public void onEnable(){
		try{makeDir();ChestSystem.createChest();}catch(Exception i){System.out.println(ChatColor.RED+"[ERROR - VCDrops] Failed to create config files/folders.");}
		getServer().getPluginManager().registerEvents(ln,this);
	}
	private void makeDir()throws IOException{
		File dir = this.getDataFolder();
		if(!dir.exists()){
			@SuppressWarnings("unused")
			boolean res = dir.mkdir();
		}
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("update") && sender.hasPermission("VCDrops.Update")){
			try {
				Updater.update();
			} catch (IOException e) {
				sender.sendMessage(ChatColor.RED+"[ERROR - VCDrops] Error updating.");
			}
		}
		if(label.equalsIgnoreCase("chest") && sender.hasPermission("VCDrops.Chest")){
			if(sender instanceof Player){
				Player p = (Player)sender;
				String[] s = ChestSystem.getRarity(); 
				if(args.length==0){
					p.sendMessage(ChatColor.DARK_RED+"Usage: /chest "+Arrays.toString(s)+" town");
				}else if(args.length==1){
					p.sendMessage(ChatColor.DARK_RED+"Usage: /chest "+Arrays.toString(s)+" town");
				}else if(args.length==2){
					for(int i=0;i<s.length;i++){
						if(args[0].equalsIgnoreCase(s[i])){
							try {
								ChestSystem.addChest(p.getLocation(), i, args[1]);
								p.sendMessage("Chest Set");
							} catch (IOException e) {}
						}
					}
				}else if(args.length>2){
					p.sendMessage(ChatColor.DARK_RED+"Usage: /chest "+Arrays.toString(s));
				}
		}else{
			sender.sendMessage(ChatColor.RED+"You must be a player to preform this command.");
		}
		}
		return false;
	}
}
