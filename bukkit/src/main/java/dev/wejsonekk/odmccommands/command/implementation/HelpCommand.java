package dev.wejsonekk.odmccommands.command.implementation;


import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.rollczi.litecommands.injector.Inject;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import org.bukkit.command.CommandSender;

@Route(name = "pomoc", aliases = {"help"})
public class HelpCommand
{
    private final MessageConfig messages;

    public HelpCommand(MessageConfig messages) {
        this.messages = messages;
    }
    @Execute(max = 1)

    void onExecute(CommandSender sender){
        this.messages.HelpCommand.send(sender);
    }

}
