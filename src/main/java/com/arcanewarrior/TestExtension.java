package com.arcanewarrior;

import net.minestom.server.extensions.Extension;

public class TestExtension extends Extension {
    @Override
    public void initialize() {
        getLogger().info("Hello World!");
    }

    @Override
    public void terminate() {
        getLogger().info("Goodbye World!");
    }
}
