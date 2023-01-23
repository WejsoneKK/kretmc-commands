package dev.wejsonekk.odmccommands;

import cc.dreamcode.command.bukkit.BukkitCommandProvider;
import cc.dreamcode.menu.bukkit.BukkitMenuProvider;
import cc.dreamcode.menu.serdes.bukkit.okaeri.MenuBuilderSerdes;
import cc.dreamcode.notice.bukkit.BukkitNoticeProvider;
import cc.dreamcode.notice.bukkit.okaeri_serdes.BukkitNoticeSerdes;
import cc.dreamcode.platform.DreamPlatform;
import cc.dreamcode.platform.DreamVersion;
import cc.dreamcode.platform.bukkit.DreamBukkitPlatform;
import cc.dreamcode.platform.bukkit.component.*;
import cc.dreamcode.platform.component.ComponentManager;
import dev.rollczi.litecommands.LiteCommands;
import dev.rollczi.litecommands.bukkit.LiteBukkitFactory;
import dev.wejsonekk.odmccommands.command.DiscordCommand;
import dev.wejsonekk.odmccommands.command.HelpCommand;
import dev.wejsonekk.odmccommands.command.KretMCAdminCommands;
import dev.wejsonekk.odmccommands.command.SupportCommand;
import dev.wejsonekk.odmccommands.config.ConfigService;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import dev.wejsonekk.odmccommands.mcversion.VersionProvider;
import eu.okaeri.configs.serdes.OkaeriSerdesPack;
import eu.okaeri.injector.annotation.Inject;
import eu.okaeri.persistence.document.DocumentPersistence;
import eu.okaeri.tasker.bukkit.BukkitTasker;
import lombok.Getter;
import lombok.NonNull;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class BukkitCommandPlugin extends DreamBukkitPlatform {


    @Getter
    private static BukkitCommandPlugin bukkitCommandPlugin;
    @Getter
    private LiteCommands < CommandSender > liteCommands;
    @Getter
    private ConfigService configService;
    @Inject private PluginConfig config;
    @Inject private MessageConfig messages;
    @Override
    public void load(@NonNull ComponentManager componentManager) {
        bukkitCommandPlugin = this;
    }

    @Override
    public void enable(@NonNull ComponentManager componentManager) {

        this.configService = new ConfigService();

        this.messages = this.configService.create(MessageConfig.class, new File(this.getDataFolder(), "messages.yml"));
        this.config = this.configService.create(PluginConfig.class, new File(this.getDataFolder(), "config.yml"));
        this.liteCommands = LiteBukkitFactory.builder(this.getServer(),
                        "kretmc-commands",
                        false)
                .command(DiscordCommand.class)
                .command(HelpCommand.class)
                .command(SupportCommand.class)
                .command(KretMCAdminCommands.class)
                .register();
        this.registerInjectable ( VersionProvider.getVersionAccessor ( ) );
        this.registerInjectable ( BukkitTasker.newPool ( this ) );
        this.registerInjectable ( BukkitMenuProvider.create ( this ) );
        this.registerInjectable ( BukkitNoticeProvider.create ( this ) );
        this.registerInjectable ( BukkitCommandProvider.create ( this , this.getInjector ( ) ) );

        componentManager.registerResolver ( CommandComponentResolver.class );
        componentManager.registerResolver ( ListenerComponentResolver.class );
        componentManager.registerResolver ( RunnableComponentResolver.class );

        componentManager.registerResolver(ConfigurationComponentResolver.class);
        componentManager.registerComponent(MessageConfig.class, messageConfig -> {
            this.getInject(BukkitCommandProvider.class).ifPresent(bukkitCommandProvider -> {
                bukkitCommandProvider.setNoPermissionMessage(messageConfig.noPermission);
                bukkitCommandProvider.setNoPlayerMessage(messageConfig.noPlayer);
            });
        });
//        componentManager.registerComponent(PluginConfig.class, pluginConfig -> {
//
//        });
    }

    @Override
    public void disable() {
        // features need to be call when server is stopping
    }

    @Override
    public DreamVersion getDreamVersion() {
        return DreamVersion.create("kretmc-commands", "0.1.0", "WejsoneKK");
    }

    @Override
    public OkaeriSerdesPack getPluginSerdesPack() {
        return registry -> {
            registry.register(new BukkitNoticeSerdes());
            registry.register(new MenuBuilderSerdes());
        };
    }
}
