package com.darkender.plugins.minigamescore.api;

import com.darkender.plugins.minigamescore.api.map.IMinigamesMap;

import java.util.List;

public interface IActiveMinigame
{
    public IMinigamesMap getMap();
    public List<IMinigamesPlayer> getPlayers();
}
