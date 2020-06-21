package com.darkender.plugins.minigamescore.api.map;

import org.bukkit.Location;
import org.bukkit.World;

public class MapWaypoint
{
    private double x, y, z;
    private float yaw, pitch;
    
    public MapWaypoint(double x, double y, double z, float yaw, float pitch)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
    }
    
    public Location toLocation(World world, double startX, double startZ)
    {
        return new Location(world, x + startX, y, z + startZ, yaw, pitch);
    }
    
    public void setPosition(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void setOrientation(float pitch, float yaw)
    {
        this.pitch = pitch;
        this.yaw = yaw;
    }
    
    public double getX()
    {
        return x;
    }
    
    public void setX(double x)
    {
        this.x = x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public void setY(double y)
    {
        this.y = y;
    }
    
    public double getZ()
    {
        return z;
    }
    
    public void setZ(double z)
    {
        this.z = z;
    }
    
    public float getPitch()
    {
        return pitch;
    }
    
    public void setPitch(float pitch)
    {
        this.pitch = pitch;
    }
    
    public float getYaw()
    {
        return yaw;
    }
    
    public void setYaw(float yaw)
    {
        this.yaw = yaw;
    }
}
