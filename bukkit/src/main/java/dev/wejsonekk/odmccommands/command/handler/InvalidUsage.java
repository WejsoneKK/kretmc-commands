package dev.wejsonekk.odmccommands.command.handler;

import dev.rollczi.litecommands.command.LiteInvocation;
import dev.rollczi.litecommands.handle.InvalidUsageHandler;
import dev.rollczi.litecommands.schematic.Schematic;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.command.CommandSender;

import java.util.List;

public class InvalidUsage implements InvalidUsageHandler<CommandSender> {
    @Getter
    MessageConfig messages;
    @Override
    public void handle(CommandSender sender, LiteInvocation invocation, Schematic schematic) {
        List<String> schemas = schematic.getSchematics();

        messages.usage.send(sender);
    }
}
