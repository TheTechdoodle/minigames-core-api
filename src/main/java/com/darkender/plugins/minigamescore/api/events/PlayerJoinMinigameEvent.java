package com.darkender.plugins.minigamescore.api.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerJoinMinigameEvent extends Event implements Cancellable
{
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled = false;
    
    @Override
    public HandlerList getHandlers()
    {
        return handlers;
    }
    
    @Override
    public boolean isCancelled()
    {
        return cancelled;
    }
    
    @Override
    public void setCancelled(boolean b)
    {
        cancelled = b;
    }
}
