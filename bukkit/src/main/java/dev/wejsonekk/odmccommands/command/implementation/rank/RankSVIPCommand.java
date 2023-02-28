package dev.wejsonekk.odmccommands.command.implementation.rank;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import lombok.Getter;
import org.bukkit.command.CommandSender;

@Route(name = "svip", aliases = "supervip")
public class RankSVIPCommand
{
    @Getter
    MessageConfig messages;
    @Execute(max = 1)
    void execute(CommandSender sender){
        messages.svipMenu.send(sender);
    }
}
