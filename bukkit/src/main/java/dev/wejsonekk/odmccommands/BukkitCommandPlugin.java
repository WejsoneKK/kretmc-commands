package dev.wejsonekk.odmccommands;

import cc.dreamcode.menu.bukkit.BukkitMenuProvider;
import cc.dreamcode.menu.serdes.bukkit.okaeri.MenuBuilderSerdes;
import cc.dreamcode.notice.bukkit.BukkitNoticeProvider;
import cc.dreamcode.notice.bukkit.okaeri_serdes.BukkitNoticeSerdes;
import cc.dreamcode.platform.DreamVersion;
import cc.dreamcode.platform.bukkit.DreamBukkitPlatform;
import cc.dreamcode.platform.bukkit.component.*;
import cc.dreamcode.platform.component.ComponentManager;
import dev.rollczi.litecommands.LiteCommands;
import dev.rollczi.litecommands.bukkit.LiteBukkitFactory;
import dev.wejsonekk.odmccommands.command.implementation.admin.AdminCommandController;
import dev.wejsonekk.odmccommands.command.implementation.rank.RankFreezeCommand;
import dev.wejsonekk.odmccommands.command.implementation.rank.RankSVIPCommand;
import dev.wejsonekk.odmccommands.command.implementation.rank.RankVIPCommand;
import dev.wejsonekk.odmccommands.command.implementation.user.DiscordCommand;
import dev.wejsonekk.odmccommands.command.implementation.user.HelpCommand;
import dev.wejsonekk.odmccommands.command.implementation.user.SupportCommand;
import dev.wejsonekk.odmccommands.command.implementation.user.UserRulesCommand;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import dev.wejsonekk.odmccommands.controller.UserController;
import dev.wejsonekk.odmccommands.mcversion.VersionProvider;
import dev.wejsonekk.odmccommands.user.UserRepository;
import eu.okaeri.configs.serdes.OkaeriSerdesPack;
import eu.okaeri.persistence.document.DocumentPersistence;
import eu.okaeri.tasker.bukkit.BukkitTasker;
import lombok.Getter;
import lombok.NonNull;
import org.bukkit.command.CommandSender;

import java.util.stream.Stream;

public final class BukkitCommandPlugin extends DreamBukkitPlatform {

    @Getter private static BukkitCommandPlugin bukkitCommandPlugin;
    @Getter private LiteCommands<CommandSender> liteCommands;

    @Override
    public void load(@NonNull ComponentManager componentManager) {
        bukkitCommandPlugin = this;
    }

    @Override
    public void enable(@NonNull ComponentManager componentManager) {
        this.registerInjectable(VersionProvider.getVersionAccessor());
        this.registerInjectable(BukkitTasker.newPool(this));
        this.registerInjectable(BukkitMenuProvider.create(this));
        this.registerInjectable(BukkitNoticeProvider.create(this));
        this.liteCommands = LiteBukkitFactory.builder(this.getServer(),
                "freezemc-server",
                true)

                /* User Commands */
                .command(UserRulesCommand.class)
                /* Rank Commands */
                .command(RankVIPCommand.class)
                .command(RankSVIPCommand.class)
                .command(RankFreezeCommand.class)
                /* Basic Commands */
                .command(DiscordCommand.class)
                .command(HelpCommand.class)
                .command(SupportCommand.class)

                /* Controller Command*/
                .command(AdminCommandController.class)
                        .register();

        componentManager.registerResolver(CommandComponentResolver.class);
        componentManager.registerResolver(ListenerComponentResolver.class);
        componentManager.registerResolver(RunnableComponentResolver.class);

        componentManager.registerResolver(ConfigurationComponentResolver.class);
        componentManager.registerComponent(PluginConfig.class, pluginConfig -> {
            // register persistence + repositories

            componentManager.registerResolver(DocumentPersistenceComponentResolver.class);
            componentManager.registerResolver(DocumentRepositoryComponentResolver.class);

            componentManager.registerComponent(DocumentPersistence.class);
            componentManager.registerComponent(UserRepository.class);
        });
        Stream.of(new UserController()
        ).forEach(listener -> {
            this.getServer().getPluginManager().registerEvents(listener, this);
        });
    }

    @Override
    public void disable() {
        // features need to be call when server is stopping

        this.liteCommands.getPlatform().unregisterAll();
    }

    @Override
    public DreamVersion getDreamVersion() {
        return DreamVersion.create("odmc-commands", "0.1.0", "WejsoneKK");
    }

    @Override
    public OkaeriSerdesPack getPluginSerdesPack() {
        return registry -> {
            registry.register(new BukkitNoticeSerdes());
            registry.register(new MenuBuilderSerdes());
        };
    }
}
