package dev.wejsonekk.odmccommands.command.handler;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import dev.rollczi.litecommands.command.LiteInvocation;
import dev.rollczi.litecommands.command.permission.RequiredPermissions;
import dev.rollczi.litecommands.handle.PermissionHandler;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import org.bukkit.command.CommandSender;

public class PermissionMessage implements PermissionHandler<CommandSender> {

    private final MessageConfig messages;

    public PermissionMessage(MessageConfig messages) {
        this.messages = messages;
    }

    @Override
    public void handle(CommandSender sender, LiteInvocation invocation, RequiredPermissions requiredPermissions) {
        String perms = Joiner.on(", ")
                .join(requiredPermissions.getPermissions());

        this.messages.noPermission.send(sender, ImmutableMap.of("PERMISSION", perms));
    }
}
