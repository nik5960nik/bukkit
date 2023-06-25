package com.DisableDoorClick;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.DisableDoorClick.event.PlayerInteract;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new PlayerInteract(), this);
	}
	
}
