package dev.wejsonekk.odmccommands.command.implementation.rank;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import org.bukkit.command.CommandSender;

@Route(name = "freeze", aliases = "freze")
public class RankFreezeCommand
{
    @Execute(max = 1)
    void execute(CommandSender sender){

    }
}
