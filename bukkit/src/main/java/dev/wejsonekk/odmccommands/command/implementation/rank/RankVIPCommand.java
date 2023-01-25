package dev.wejsonekk.odmccommands.command.implementation.rank;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import org.bukkit.command.CommandSender;
@Route(name = "vip")
public class RankVIPCommand
{
    private MessageConfig messages;

    public RankVIPCommand(MessageConfig messages) {
        this.messages = messages;
    }

    @Execute(max = 1)
    void execute(CommandSender sender){
        this.messages.RankVIPCommand.send(sender);

    }
}
