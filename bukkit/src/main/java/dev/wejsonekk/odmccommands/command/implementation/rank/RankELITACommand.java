package dev.wejsonekk.odmccommands.command.implementation.rank;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import lombok.Getter;
import org.bukkit.command.CommandSender;

@Route(name = "elita")
public class RankELITACommand
{
    @Getter
    MessageConfig messages;

    @Execute(min = 0, max = 1)
    void execute(CommandSender sender){
        messages.elitaMenu.send(sender);
    }
}
