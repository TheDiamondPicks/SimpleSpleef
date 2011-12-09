package de.beimax.simplespleef.listeners;

import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import de.beimax.simplespleef.SimpleSpleef;
import de.beimax.simplespleef.game.GameHandler;

/**
 * Handle events for all Player related events
 * 
 * @author maxkalus
 */
public class SimpleSpleefPlayerListener extends PlayerListener {
	/**
	 * reference to game handler
	 */
	private final GameHandler gameHandler;
	
	/**
	 * Constructor
	 * @param gameHandler reference to game handler
	 */
	public SimpleSpleefPlayerListener(GameHandler gameHandler) {
		this.gameHandler = gameHandler;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.event.player.PlayerListener#onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent)
	 */
	@Override
	public void onPlayerJoin(PlayerJoinEvent event) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see org.bukkit.event.player.PlayerListener#onPlayerKick(org.bukkit.event.player.PlayerKickEvent)
	 */
	@Override
	public void onPlayerKick(PlayerKickEvent event) {
		// TODO Auto-generated method stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.bukkit.event.player.PlayerListener#onPlayerQuit(org.bukkit.event.
	 * player.PlayerEvent)
	 */
	@Override
	public void onPlayerQuit(PlayerQuitEvent event) {
		//TODO implement
	}	

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.bukkit.event.player.PlayerListener#onPlayerMove(org.bukkit.event.
	 * player.PlayerMoveEvent)
	 */
	@Override
	public void onPlayerMove(PlayerMoveEvent event) {
		//TODO implement
	}

	/* (non-Javadoc)
	 * @see org.bukkit.event.player.PlayerListener#onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent)
	 */
	@Override
	public void onPlayerInteract(PlayerInteractEvent event) {
		//TODO implement
	}

}
