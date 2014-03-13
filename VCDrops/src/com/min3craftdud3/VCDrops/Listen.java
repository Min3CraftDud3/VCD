package com.min3craftdud3.VCDrops;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Listen implements Listener{
	VCDrops plugin;
	public Listen(VCDrops instance){
		plugin = instance;
	}
	@EventHandler
	public void PIE(PlayerInteractEvent e){
		try{
		Player p = e.getPlayer();
		Block b = e.getClickedBlock();
		World w = p.getWorld();
		Material m = b.getType();
		Action a = e.getAction();
		if(a==Action.RIGHT_CLICK_BLOCK){
			if(m !=Material.CHEST){
				return;
			}else{
				b.setType(Material.AIR);
				w.playEffect(b.getLocation(), Effect.STEP_SOUND, 10, 10);
			}
			
		}
	}catch(Exception i){}
	}
}
