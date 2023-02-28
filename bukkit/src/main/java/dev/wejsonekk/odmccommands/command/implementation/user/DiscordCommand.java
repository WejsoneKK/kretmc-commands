package dev.wejsonekk.odmccommands.command.implementation.user;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bukkit.command.CommandSender;

@AllArgsConstructor
@Route(name = "discord", aliases = {"dcserwer", "dc", "discordserver", "serverdiscord"})
public class DiscordCommand
{
    @Getter
    private final PluginConfig config;
    @Getter
    private final MessageConfig messages;

    @Execute(max = 1)
    void execute(CommandSender sender){
        messages.DiscordCommand.send(sender);
    }
}
