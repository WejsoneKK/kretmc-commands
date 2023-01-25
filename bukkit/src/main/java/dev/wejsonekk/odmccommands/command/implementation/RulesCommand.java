package dev.wejsonekk.odmccommands.command.implementation;

import dev.rollczi.litecommands.command.amount.Max;
import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import org.bukkit.command.CommandSender;

@Route(name = "rules", aliases = {"regulamin", "zasady"})
public class RulesCommand
{
    private final MessageConfig messages;

    public RulesCommand(MessageConfig messages) {
        this.messages = messages;
    }

    @Execute(max = 1)
    void onExecute(CommandSender sender){
        this.messages.RulesCommand.send(sender);

    }
}
