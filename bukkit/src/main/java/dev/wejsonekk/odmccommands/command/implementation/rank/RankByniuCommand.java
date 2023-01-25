package dev.wejsonekk.odmccommands.command.implementation.rank;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import org.bukkit.command.CommandSender;
@Route(name = "byniu", aliases = {"byniek"})
public class RankByniuCommand
{
    private MessageConfig messages;

    public RankByniuCommand(MessageConfig messages) {
        this.messages = messages;
    }

    @Execute(max = 1)
    void execute(CommandSender sender){
        messages.RankByniuCommand.send(sender);

    }
}
