package dev.wejsonekk.odmccommands.command.implementation.user;


import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bukkit.command.CommandSender;

@Route(name = "pomoc", aliases = {"help"})
public class HelpCommand
{

    @Getter
    private final PluginConfig config;
    @Getter

    private final MessageConfig messages;

    public HelpCommand(PluginConfig config, MessageConfig messages) {
        this.config = config;
        this.messages = messages;
    }

    void onExecute(CommandSender sender){
        this.messages.HelpCommand.send(sender);
    }

}
