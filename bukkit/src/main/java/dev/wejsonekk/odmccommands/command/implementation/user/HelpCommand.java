package dev.wejsonekk.odmccommands.command.implementation.user;


import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.command.CommandSender;
@AllArgsConstructor
@Route(name = "pomoc", aliases = {"help"})
public class HelpCommand
{

    @Getter
    PluginConfig config;
    @Getter
    MessageConfig messages;
    void onExecute(CommandSender sender){

        messages.helpMenu.send(sender);
    }

}
