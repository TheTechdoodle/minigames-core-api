package com.darkender.plugins.minigamescore.api;

public interface IMinigamesPlayer
{
    public void joinParty(IParty party);
    public IParty getParty();
    public boolean isPartyOwner();
    public boolean isInMinigame();
    public IActiveMinigame getMinigame();
}
