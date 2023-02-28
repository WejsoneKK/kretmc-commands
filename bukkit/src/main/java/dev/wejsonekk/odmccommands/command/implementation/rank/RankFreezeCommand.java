package dev.wejsonekk.odmccommands.command.implementation.rank;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import lombok.Getter;
import org.bukkit.command.CommandSender;

@Route(name = "freeze", aliases = "freze")
public class RankFreezeCommand
{

    @Getter
    MessageConfig messages;
    @Execute(max = 1)
    void execute(CommandSender sender){
        messages.freezeMenu.send(sender);
    }
}
