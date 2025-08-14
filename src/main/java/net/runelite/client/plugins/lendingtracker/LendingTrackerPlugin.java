package net.runelite.client.plugins.lendingtracker;

import com.google.inject.Provides;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(
        name = "Lending Tracker",
        description = "Tracks clan lending/borrowing safely",
        tags = {"lending", "borrow", "loan", "clan"}
)
public class LendingTrackerPlugin extends Plugin
{
    private static final Logger log = LoggerFactory.getLogger(LendingTrackerPlugin.class);

    @Provides
    LendingTrackerConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(LendingTrackerConfig.class);
    }

    @Override
    protected void startUp()
    {
        log.info("Lending Tracker started");
    }

    @Override
    protected void shutDown()
    {
        log.info("Lending Tracker stopped");
    }
}
