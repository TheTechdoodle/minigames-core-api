package com.darkender.plugins.minigamescore.api.map;

import java.util.Map;

public interface IMinigamesMap
{
    public String getName();
    public String getDescription();
    public MapCreator getCreator();
    public void setCreator();
    
    public Map<String, MapWaypoint> getWaypoints();
}
