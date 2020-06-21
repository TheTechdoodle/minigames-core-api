package com.darkender.plugins.minigamescore.api;

import java.util.List;

/**
 * A party is a collection of one or more minigames players
 * All minigames players are in a party, even if just a party of one
 */
public interface IParty
{
    /**
     * Checks if the party contains a single user
     * @return true if the party contains a single user
     */
    public boolean isSingle();
    
    /**
     * Forces all users in this party to go back to singleton parties
     */
    public void disband();
    
    public void addPlayer(IMinigamesPlayer player);
    public void removePlayer(IMinigamesPlayer player);
    public List<IMinigamesPlayer> getPlayers();
    public IMinigamesPlayer getOwner();
    public void setOwner(IMinigamesPlayer owner);
}
