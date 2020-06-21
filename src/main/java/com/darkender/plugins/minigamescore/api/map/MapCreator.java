package com.darkender.plugins.minigamescore.api.map;

import java.util.UUID;

public class MapCreator
{
    private final String name;
    private final UUID uuid;
    
    public MapCreator(String name)
    {
        this.name = name;
        this.uuid = null;
    }
    
    public MapCreator(String name, UUID uuid)
    {
        this.name = name;
        this.uuid = uuid;
    }
    
    /**
     * Returns the preferred name of the map creator
     * This does not necessarily equal their account username!
     * @return The preferred name of the map creator
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the UUID of the account of the map creator if it exists or null if not
     * @return UUID of the account of the map creator if it exists or null if not
     */
    public UUID getUUID()
    {
        return uuid;
    }
}
