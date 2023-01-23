package dev.wejsonekk.odmccommands;

import cc.dreamcode.command.bungee.BungeeCommandProvider;
import cc.dreamcode.notice.bungee.BungeeNoticeProvider;
import cc.dreamcode.notice.bungee.okaeri_serdes.BungeeNoticeSerdes;
import cc.dreamcode.platform.DreamVersion;
import cc.dreamcode.platform.bungee.DreamBungeePlatform;
import cc.dreamcode.platform.bungee.component.CommandComponentResolver;
import cc.dreamcode.platform.bungee.component.ConfigurationComponentResolver;
import cc.dreamcode.platform.bungee.component.DocumentPersistenceComponentResolver;
import cc.dreamcode.platform.bungee.component.DocumentRepositoryComponentResolver;
import cc.dreamcode.platform.bungee.component.ListenerComponentResolver;
import cc.dreamcode.platform.bungee.component.RunnableComponentResolver;
import cc.dreamcode.platform.component.ComponentManager;
import dev.wejsonekk.odmccommands.config.MessageConfig;
import dev.wejsonekk.odmccommands.config.PluginConfig;
import dev.wejsonekk.odmccommands.user.UserRepository;
import eu.okaeri.configs.serdes.OkaeriSerdesPack;
import eu.okaeri.persistence.document.DocumentPersistence;
import lombok.Getter;
import lombok.NonNull;

public final class BungeeODMCCommandsPlugin extends DreamBungeePlatform {

    @Getter private static BungeeODMCCommandsPlugin commandsPlugin;

    @Override
    public void load(@NonNull ComponentManager componentManager) {
        commandsPlugin = this;
    }

    @Override
    public void enable(@NonNull ComponentManager componentManager) {
        this.registerInjectable(BungeeNoticeProvider.create(this));
        this.registerInjectable(BungeeCommandProvider.create(this, this.getInjector()));

        componentManager.registerResolver(CommandComponentResolver.class);
        componentManager.registerResolver(ListenerComponentResolver.class);
        componentManager.registerResolver(RunnableComponentResolver.class);

        componentManager.registerResolver(ConfigurationComponentResolver.class);
        componentManager.registerComponent(MessageConfig.class, messageConfig -> {
            this.getInject(BungeeCommandProvider.class).ifPresent(bungeeCommandProvider -> {
                bungeeCommandProvider.setNoPermissionMessage(messageConfig.noPermission);
                bungeeCommandProvider.setNoPlayerMessage(messageConfig.noPlayer);
            });
        });
        componentManager.registerComponent(PluginConfig.class, pluginConfig -> {
            // register persistence + repositories
            this.registerInjectable(pluginConfig.storageConfig);

            componentManager.registerResolver(DocumentPersistenceComponentResolver.class);
            componentManager.registerResolver(DocumentRepositoryComponentResolver.class);

            componentManager.registerComponent(DocumentPersistence.class);
            componentManager.registerComponent(UserRepository.class);
        });
    }

    @Override
    public void disable() {
        // features need to be call when server is stopping
    }

    @Override
    public DreamVersion getDreamVersion() {
        return DreamVersion.create("odmc-commands", "0.1.0", "WejsoneKK");
    }

    @Override
    public OkaeriSerdesPack getPluginSerdesPack() {
        return registry -> {
            registry.register(new BungeeNoticeSerdes());
        };
    }
}
