package dev.wejsonekk.odmccommands.command.implementation;

import dev.rollczi.litecommands.command.amount.Max;
import dev.rollczi.litecommands.command.amount.Min;
import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.rollczi.litecommands.injector.Inject;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import org.bukkit.command.CommandSender;

@Route(name = "wspolpraca", aliases = {"tiktok", "youtube", "support", "współpraca"})
public class SupportCommand
{
    private final MessageConfig messages;

    @Inject
    public SupportCommand(MessageConfig messages) {
        this.messages = messages;
    }
    @Execute(max = 1)
    void onExecute(CommandSender sender){
        this.messages.SupportCommand.send(sender);
    }
}
