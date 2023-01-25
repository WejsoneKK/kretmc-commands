package dev.wejsonekk.odmccommands;

import cc.dreamcode.menu.bukkit.BukkitMenuProvider;
import cc.dreamcode.notice.bukkit.BukkitNoticeProvider;
import dev.rollczi.litecommands.LiteCommands;
import dev.rollczi.litecommands.bukkit.LiteBukkitFactory;
import dev.rollczi.litecommands.bukkit.tools.BukkitOnlyPlayerContextual;
import dev.wejsonekk.odmccommands.command.handler.InvalidUsage;
import dev.wejsonekk.odmccommands.command.handler.PermissionMessage;
import dev.wejsonekk.odmccommands.command.implementation.*;
import dev.wejsonekk.odmccommands.command.implementation.rank.*;
import dev.wejsonekk.odmccommands.config.ConfigService;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import lombok.Getter;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class BukkitCommandPlugin extends JavaPlugin{

    private ConfigService configService;
    @Getter private MessageConfig messages;
    private PluginConfig config;
    private LiteCommands<CommandSender> liteCommands;



    @Override
    public void onEnable() {

        this.configService = new ConfigService();

        this.messages = this.configService.create(MessageConfig.class, new File(this.getDataFolder(), "messages.yml"));
        this.config = this.configService.create(PluginConfig.class, new File(this.getDataFolder(), "config.yml"));

        BukkitMenuProvider.create(this);
        BukkitNoticeProvider.create(this);

        this.liteCommands = LiteBukkitFactory.builder(this.getServer(), "kretmc-commands", false)
                .contextualBind(Player.class, new BukkitOnlyPlayerContextual<>("OnlyPlayer"))

                .invalidUsageHandler(new InvalidUsage(this.messages))
                .permissionHandler(new PermissionMessage(this.messages))

                .commandInstance(new HelpCommand(this.messages))
                .commandInstance(new DiscordCommand(this.messages))
                .commandInstance(new KretMCAdminCommands(this.config, this.messages))
                .commandInstance(new RulesCommand(this.messages))
                .commandInstance(new SupportCommand(this.messages))
                .commandInstance(new RankVIPCommand(this.messages))
                .commandInstance(new RankSVIPCommand(this.messages))
                .commandInstance(new RankSponsorCommand(this.messages))
                .commandInstance(new RankElitaCommand(this.messages))
                .commandInstance(new RankByniuCommand(this.messages))

                .register();
    }
    @Override
    public void onDisable() {
        this.liteCommands.getPlatform().unregisterAll();
    }

    public ConfigService getConfigService() {
        return configService;
    }
    public LiteCommands<CommandSender> getLiteCommands() {
        return this.liteCommands;
    }

}
