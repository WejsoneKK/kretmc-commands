package dev.wejsonekk.odmccommands.config;

import cc.dreamcode.platform.bukkit.component.configuration.Configuration;
import cc.dreamcode.platform.bukkit.persistence.StorageConfig;
import eu.okaeri.configs.OkaeriConfig;
import eu.okaeri.configs.annotation.Comment;
import eu.okaeri.configs.annotation.Header;
import eu.okaeri.configs.annotation.NameModifier;
import eu.okaeri.configs.annotation.NameStrategy;
import eu.okaeri.configs.annotation.Names;

@Configuration(
        child = "config.yml"
)
@Header("## ODMC-Commands (Main-Config) ##")
@Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
public class PluginConfig extends OkaeriConfig {
    @Comment("Debug pokazuje dodatkowe informacje do konsoli. Lepiej wylaczyc. :P")
    public boolean debug = true;

    public boolean isHelpInMenu = true;
    public boolean isHelpInChat = true;
    public boolean isHelpInBookMenu = false;
    public boolean isDiscordInMenu = true;
    public boolean isDiscordInChat = false;
    public boolean isDiscordInBookMenu = false;
    public boolean isRankInMenu = true;
    public boolean isRankInChat = false;
    public boolean isRankInBookMenu = false;

}
