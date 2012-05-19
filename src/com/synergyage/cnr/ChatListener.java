package com.synergyage.cnr;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class ChatListener implements Listener {

	@EventHandler
	public void onPlayerChat(PlayerChatEvent chat) {
		Player p = chat.getPlayer();
		String message = chat.getMessage();
		String m_lower = message.toLowerCase();
		String edit;

		if (m_lower.contains("hi") && m_lower.contains("server")) {
			p.sendMessage("Server says, 'Hello " + p.getName() + "'");
			chat.setCancelled(true);
		}
		
	
		edit = message.replace("plz", "please");
		edit = edit.replace("omg", "oh my god");
		edit = edit.replace("wtf", "what the fuck");
		edit = edit.replace("btw", "by the way");
		edit = edit.replace("pls", "please");
		chat.setMessage(edit);


	}

}
