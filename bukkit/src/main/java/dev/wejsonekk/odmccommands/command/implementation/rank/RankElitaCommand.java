package dev.wejsonekk.odmccommands.command.implementation.rank;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import org.bukkit.command.CommandSender;



@Route(name = "elita")
public class RankElitaCommand {


    private MessageConfig messages;

    public RankElitaCommand(MessageConfig messages) {
        this.messages = messages;
    }

    @Execute(max = 1)
    void execute(CommandSender sender) {
        messages.RankElitaCommand.send(sender);

    }
}