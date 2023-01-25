package dev.wejsonekk.odmccommands.command.handler;

import com.google.common.collect.ImmutableMap;
import dev.rollczi.litecommands.command.LiteInvocation;
import dev.rollczi.litecommands.handle.InvalidUsageHandler;
import dev.rollczi.litecommands.schematic.Schematic;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import org.bukkit.command.CommandSender;

import java.util.List;

public class InvalidUsage implements InvalidUsageHandler<CommandSender>
{
    private final MessageConfig messages;

    public InvalidUsage(MessageConfig messages) {
        this.messages = messages;
    }

    @Override
    public void handle(CommandSender sender, LiteInvocation invocation, Schematic schematic) {
        List<String> schematics = schematic.getSchematics();

        if(schematics.size() == 1) {
            this.messages.invalidUsage.send(sender, ImmutableMap.of("USAGE", schematics.get(0)));
            return;
        }

        this.messages.invalidUsageHead.send(sender);

        for (String schema : schematics){
            this.messages.invalidUsageBody.send(sender, ImmutableMap.of("USAGE", schema));
        }

    }

}
