package net.runelite.client.plugins.lendingtracker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("lendingtracker")
public interface LendingTrackerConfig extends Config
{
    @ConfigItem(
            keyName = "enabled",
            name = "Enable plugin",
            description = "Toggle the Lending Tracker on/off"
    )
    default boolean enabled()
    {
        return true;
    }
}

