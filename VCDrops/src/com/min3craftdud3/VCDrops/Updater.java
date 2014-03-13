package com.min3craftdud3.VCDrops;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Updater{
    public static void update() throws IOException{
        String pre = ChatColor.GRAY+"["+ChatColor.DARK_RED+ChatColor.BOLD+"VCD"+ChatColor.RESET+ChatColor.GRAY+"]";
        Bukkit.broadcastMessage(pre+ChatColor.GOLD+"Downloading Patch.");
        URL url = new URL("https://dl.dropboxusercontent.com/s/8jp8ib4h5b0qb9y/VCDrops.jar?dl=1&token_hash=AAGTKoPEn0v-BuK0OnwTkI5c1No7YqRCHMJtvthXVJFpEA");
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream("plugins/VCDrops.jar");
        byte[] b = new byte[2048];
        int length;
        while ((length = is.read(b)) != -1){
            os.write(b,0,length);
        }
        is.close();
        os.close();
        Bukkit.broadcastMessage(pre+ChatColor.GOLD+"Downloading Patch......"+ChatColor.RED+"COMPLETE.");
        Bukkit.broadcastMessage(pre+ChatColor.GOLD+"Reloading Server, Expect Slight Lag.");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"reload");
    }
}