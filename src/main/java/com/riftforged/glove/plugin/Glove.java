package com.riftforged.glove.plugin;

import com.riftforged.glove.api.GlovePlugin;

public class Glove extends GlovePlugin
{
    @Override
    public void enabled()
    {
        this.registerMainCommand("glove");
    }

    @Override
    public void disabled()
    {
        this.getSLF4JLogger().warn("Glove has been disabled and its dependencies might have been unloaded.");
    }
}
