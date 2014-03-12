package com.min3craftdud3.VCDrops;

public class Updater{
    public static void update(){
        String pre = ChatColor.GRAY+"["+ChatColor.DARK_RED+ChatColor.BOLD+"VCD"+ChatColor.RESET+ChatColor.GRAY+"]";
        Bukkit.broadcastMessage(pre+ChatColor.GOLD+"Downloading Patch.");
        URL url = new URL("UPDATE URL HERE");
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream("plugins/VCD.jar");
        byte[] b = new byte[2048];
        int length;
        while ((length = is.read(b)) != -1){
            os.write(b,o,length);
        }
        is.close();
        os.close();
        Bukkit.broadcastMessage(pre+ChatColor.GOLD+"Downloading Patch......"+ChatColor.RED+"COMPLETE.");
        Bukkit.broadcastMessage(pre+ChatColor.GOLD+"Reloading Server, Expect Slight Lag.");
        Bukkit.dispatchCommand(bukkit.getConsoleSender(),"reload");
    }
}