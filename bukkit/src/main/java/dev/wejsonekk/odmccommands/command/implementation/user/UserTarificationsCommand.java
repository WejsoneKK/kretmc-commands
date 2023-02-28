package dev.wejsonekk.odmccommands.command.implementation.user;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import lombok.Getter;
import org.bukkit.command.CommandSender;

@Route(name = "taryfikator", aliases = {"tarification", "tarifications"})
public class UserTarificationsCommand
{

    @Getter
    MessageConfig messages;
    @Execute(min = 0, max = 1)
    void execute(CommandSender sender){
        messages.TaryfikatorCommand.send(sender);
    }
}
