package cn.marvelpixel;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class AreaDig extends JavaPlugin {
    static AreaDig main;
    @Override
    public void onEnable() {
        saveDefaultConfig();
        main = this;
        // Plugin startup logic
        Bukkit.getPluginCommand("mplad").setExecutor(new admaincommand());
        Bukkit.getPluginManager().registerEvents(new MarvelPixelAreaDigListener(),this);
        System.out.println("MarvelPixelAreaDig插件加载成功");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("MarvelPixelAreaDig插件卸载成功");
    }
}
