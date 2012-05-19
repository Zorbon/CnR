package com.synergyage.cnr;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class CnR extends JavaPlugin{
	
	Logger log;
	public static CnR plugin;
	public final ChatListener playerListener = new ChatListener();
	
	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		log = this.getLogger();
		log.info("CnR v0.01 enabled. ");
		
		pm.registerEvents(this.playerListener, this);

	}
	
	@Override
	public void onDisable() {
		log.info("CnR v0.01 disabled. ");
	}

}
