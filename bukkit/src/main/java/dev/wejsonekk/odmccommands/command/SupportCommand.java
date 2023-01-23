package dev.wejsonekk.odmccommands.command;

import dev.rollczi.litecommands.command.execute.Execute;
import dev.rollczi.litecommands.command.route.Route;
import dev.rollczi.litecommands.injector.Inject;
import dev.rollczi.litecommands.injector.Injectable;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import org.bukkit.command.CommandSender;

@Route(name = "wspolpraca", aliases = {"tiktok", "youtube", "support", "współpraca"})
public class SupportCommand
{
    private final PluginConfig config;
    private final MessageConfig messages;

    @Inject
    public SupportCommand(PluginConfig config, MessageConfig messages) {
        this.config = config;
        this.messages = messages;
    }

    @Execute(route = "tiktok", aliases = {"tiktoki", "minitiktok"})
    void executeTikTok(CommandSender sender){
        this.messages.SupportCommandTikTok.send(sender);
    }
    @Execute(route = "youtube", aliases = {"yt"})

    void executeYoutube(CommandSender sender){
        this.messages.SupportCommandYoutube.send(sender);
    }
    @Execute(route = "miniyt", aliases = "miniyoutube")
    void executeMiniYoutube(CommandSender sender){
        this.messages.SupportCommandMiniYT.send(sender);
    }
}
