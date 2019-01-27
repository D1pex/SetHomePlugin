package ru.zendal;

import org.bukkit.plugin.java.JavaPlugin;

public class SetHome extends JavaPlugin {
    @Override
    public void onEnable() {
        super.onEnable();
        this.getCommand("sethome").setExecutor(new SetHomeCommand());
        this.getCommand("home").setExecutor(new HomeCommand());
    }
}
