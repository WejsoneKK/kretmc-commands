package dev.wejsonekk.odmccommands.command;


import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import org.bukkit.command.CommandSender;

@Route(name = "pomoc", aliases = {"help"})
public class HelpCommand
{
    private final PluginConfig config;
    private final MessageConfig messages;

    public HelpCommand(PluginConfig config, MessageConfig messages) {
        this.config = config;
        this.messages = messages;
    }

    void onExecute(CommandSender sender){
        this.messages.HelpCommand.send(sender);
    }

}
