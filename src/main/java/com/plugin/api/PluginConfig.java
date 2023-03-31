package com.plugin.api;

public abstract class PluginConfig {
    public PluginConfig() {
    }

    public abstract String name();

    public abstract String version();

    public abstract String desc();

    public abstract String ip();

    public abstract Integer port();

    public abstract String protocol();

    public abstract String parameter();
}
