package dev.wejsonekk.odmccommands.command.implementation.user;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import lombok.Getter;
import org.bukkit.command.CommandSender;

@Route(name = "rules", aliases = {"rule", "zasady", "regulamin"})
public class UserRulesCommand
{

    @Getter
    MessageConfig messages;
    @Execute(max = 1 )
    void execute(CommandSender sender){
        messages.RulesCommand.send(sender);
    }
}
