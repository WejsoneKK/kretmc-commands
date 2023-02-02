package dev.wejsonekk.odmccommands.command.implementation.admin;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.permission.Permission;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import lombok.Getter;
import org.bukkit.command.CommandSender;

@Route(name = "command-controller", aliases = "cmd-controller")
@Permission("freezemc.odmccommand.command.command-controller")
public class AdminCommandController
{

    @Getter MessageConfig messages;
    @Getter PluginConfig config;

    @Execute(max = 1)
    @Permission("freezemc.odmccommand.command.command.reload")
    void reload(CommandSender sender){
        this.messages.reloadConfiguration.send(sender);
        this.messages.reloadMessages.send(sender);
        this.config.load();
        this.messages.load();
    }
}
