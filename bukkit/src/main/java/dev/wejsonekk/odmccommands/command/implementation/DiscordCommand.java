package dev.wejsonekk.odmccommands.command.implementation;

import com.google.common.collect.ImmutableMap;
import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.rollczi.litecommands.injector.Inject;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import org.bukkit.command.CommandSender;

@Route(name = "discord", aliases = {"dcserwer", "dc", "discordserver", "serverdiscord"})
public class DiscordCommand
{
    private final MessageConfig messages;

    @Inject
    public DiscordCommand(MessageConfig messages) {
        this.messages = messages;
    }
    @Execute(max = 1)
    void execute(CommandSender sender){
        this.messages.DiscordCommand.send(sender, ImmutableMap.of("DISCORDLINK", this.messages.discordInviteLink));
    }
}
