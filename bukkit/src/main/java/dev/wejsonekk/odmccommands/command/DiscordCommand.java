package dev.wejsonekk.odmccommands.command;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import org.bukkit.command.CommandSender;

@Route(name = "discord", aliases = {"dcserwer", "dc", "discordserver", "serverdiscord"})
public class DiscordCommand
{
    private final PluginConfig config;
    private final MessageConfig messages;

    public DiscordCommand(PluginConfig config, MessageConfig messages) {
        this.config = config;
        this.messages = messages;
    }
    @Execute(max = 1)
    void execute(CommandSender sender){
        this.messages.DiscordCommand.send(sender);
    }
}
