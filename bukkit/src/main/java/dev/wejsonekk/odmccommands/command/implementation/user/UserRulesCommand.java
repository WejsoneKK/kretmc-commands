package dev.wejsonekk.odmccommands.command.implementation.user;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import org.bukkit.command.CommandSender;

@Route(name = "rules", aliases = {"rule", "zasady", "regulamin"})
public class UserRulesCommand
{
    @Execute(max = 1 )
    void execute(CommandSender sender){

    }
}
