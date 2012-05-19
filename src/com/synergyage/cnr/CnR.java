package com.synergyage.cnr;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class CnR extends JavaPlugin{

	Logger log = this.getLogger();

	public void onEnable() {
		log.info("CnR v0.01 enabled. ");

	}
	
	public void onDisable() {
		log.info("CnR v0.01 disabled. ");
	}

}
