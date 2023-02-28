package dev.wejsonekk.odmccommands.command.handler;

import com.sun.tools.javac.util.List;
import dev.rollczi.litecommands.command.LiteInvocation;
import dev.rollczi.litecommands.command.permission.RequiredPermissions;
import dev.rollczi.litecommands.handle.PermissionHandler;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import lombok.Getter;
import org.bukkit.command.CommandSender;

import java.util.Map;

public class PermissionMessageHandler implements PermissionHandler<CommandSender> {

    @Getter
    MessageConfig messages;
    @Override
    public void handle(CommandSender sender, LiteInvocation invocation, RequiredPermissions requiredPermissions) {
        messages.noPermission.send(sender);
    }
}
