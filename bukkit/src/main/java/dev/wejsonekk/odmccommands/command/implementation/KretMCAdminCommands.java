package dev.wejsonekk.odmccommands.command.implementation;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.permission.Permission;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import org.bukkit.command.CommandSender;

@Route(name = "kretmc-controller")
@Permission("kretmc.command.kretmc-controller")
public class KretMCAdminCommands
{
    private final PluginConfig config;
    private final MessageConfig messages;

    public KretMCAdminCommands(PluginConfig config, MessageConfig messages) {
        this.config = config;
        this.messages = messages;
    }
    @Execute(route = "reload-commands", aliases = {"przeladuj-komendy"})
    @Permission("kretmc.command.reload-commands")
    void executeReloadCommand(CommandSender sender){
        this.messages.load();
        this.config.load();
        this.messages.reloadCommands.send(sender);
    }
}
