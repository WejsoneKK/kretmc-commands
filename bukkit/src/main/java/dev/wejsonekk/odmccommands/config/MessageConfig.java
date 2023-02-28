package dev.wejsonekk.odmccommands.config;

import cc.dreamcode.notice.NoticeType;
import cc.dreamcode.notice.bukkit.BukkitNotice;
import cc.dreamcode.platform.bukkit.component.configuration.Configuration;
import eu.okaeri.configs.OkaeriConfig;
import eu.okaeri.configs.annotation.Header;
import eu.okaeri.configs.annotation.Headers;
import eu.okaeri.configs.annotation.NameModifier;
import eu.okaeri.configs.annotation.NameStrategy;
import eu.okaeri.configs.annotation.Names;

@Configuration(
        child = "message.yml"
)
@Headers({
        @Header("## FreezeMC-Commands (Message-Config) ##"),
        @Header("Dostepne type: (CHAT, ACTION_BAR, SUBTITLE, TITLE, TITLE_SUBTITLE)"),
        @Header(""),
        @Header("Dostępne Placeholdery"),
        @Header("{player} -> zwraca nick gracza"),
        @Header("{displayname} -> zwraca nick gracza (zmieniony)"),
        @Header("{"),
        @Header("")
})
@Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
public class MessageConfig extends OkaeriConfig {

    public BukkitNotice usage = new BukkitNotice(NoticeType.CHAT, "&cPoprawne użycie: &6{usage}");
    public BukkitNotice noPermission = new BukkitNotice(NoticeType.CHAT, "&cNie posiadasz wystarczającej ilości uprawnień.");
    public BukkitNotice noPlayer = new BukkitNotice(NoticeType.CHAT, "&cPodany gracz nie został odnaleziony.");
    public BukkitNotice playerIsOffline = new BukkitNotice(NoticeType.CHAT, "&cPodany gracz jest teraz offline.");
    public BukkitNotice notPlayer = new BukkitNotice(NoticeType.CHAT, "&cNie jesteś graczem -_-.");
    public BukkitNotice notNumber = new BukkitNotice(NoticeType.CHAT, "&cPodana liczba &cnie jest cyfra.");
    public BukkitNotice playerIsMe = new BukkitNotice(NoticeType.CHAT, "&cNie rób tego na sobie.");

    public BukkitNotice reloadConfiguration = new BukkitNotice(NoticeType.ACTION_BAR, "&aPrzeładowano pomyślnie konfiguracje pluginu");
    public BukkitNotice reloadMessages = new BukkitNotice(NoticeType.ACTION_BAR, "&aPrzeładowano pomyślnie konfiguracje językową pluginu");

    public String discordInviteLink = "https://discord.gg/FreezeMC";
    public String discordInviteHover = "&aKliknij tutaj, aby dołączyć na &bserwer discord";
    public String shopURL = "https://www.sklep.freezemc.pl";
    public String websiteURL = "https://freezemc.pl.pl";
    public String earthMap = "https://mapa.freezemc.pl";
    public String YoutubeLink = "https://www.youtube.com/channel/@FreezeMC";
    public String TikTokLink = "https://www.tiktok.com/@FreezeMC";
    public String TwitterLink = "https://twitter.com/FreezeMC";
    public String facebookLink = "https://www.facebook.com/FreezeMC";
    public String instagramLink = "https://www.instagram.com/FreezeMC";
    public String redditLink = "https://www.reddit.com/user/FreezeMC";
    public String telegramLink = "https://t.me/FreezeMC";


    public BukkitNotice DiscordCommand = new BukkitNotice(NoticeType.CHAT,

            "&a&m-----------(&9 Discord &a&m)-------------",
            "",
            "      &b&n{discordInviteLink}",
            "",
            "&a&m-----------(&9 Discord &a&m)-------------");

    public BukkitNotice RulesCommand = new BukkitNotice(NoticeType.CHAT,

            "&a&m-----------(&9 Regulamin &a&m)-------------",
            "",
            "      ",
            "",
            "&a&m-----------(&9 Regulamin &a&m)-------------");

    public BukkitNotice TaryfikatorCommand = new BukkitNotice(NoticeType.CHAT,

            "&a&m-----------(&9 Taryfikator &a&m)-------------",
            "",
            "",
            "",
            "&a&m-----------(&9 Taryfikator &a&m)-------------");

    public BukkitNotice helpMenu = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l &a&lPOMOC &8&l)&m-------------",
                    "&e/vip &8- &7informacje o randze &e&lVIP.",
                    "&e/svip &8- &7Informacje o randze &6&lSVIP.",
                    "&e/mvp &8- &7Informacje o randze&9&lMVP.",
                    "&e/elita &8- &7Informacje o randze&5&lELITA.",
                    "&e/freeze &8- &7Informacje o randze&3&lFreeze.",
                    "&e/znajomi &8- &7Znajomi.",
                    "&e/ustawienia &8- &7Ustawienia serwerowe",
                    "&e/profil &8- &7Profil gracza.",
                    "&e/wiadomosci &8- &7Ustawienia wiadomosci.",
                    "&e/odbierz &8- &7Odbieranie usług.",
                    "&e/podserwer &8- &7Podserwery.",
                    "&e/serwer &8- &7Menu gier.",
                    "&e/discord &8- &7Wyswietla serwerowy &9&lDiscord.",
                    "&8&l&m-------------&8&l &a&lPOMOC &8&l)&m-------------");
    public BukkitNotice vipMenu = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &e&lVIP &8&l)&m-------------",
            "&7Unikalny prefiks: &e&lVIP.",
            "",
            "",
            "",
            "",
            "&7Cena rangi na edycję: {vipedycja}",
            "&7Cena rangi na zawsze: {vipnazawsze}",

            "&7Range zakupisz tutaj: &e{sklepurl}",
            "&8&l&m-------------&8&l( &e&lVIP &8&l)&m-------------"
            );
    public BukkitNotice svipMenu = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &6&lSVIP &8&l)&m-------------",
            "&7Unikalny prefiks: &6&lSVIP",
            "",
            "",
            "&7Cena rangi na edycję: {svipedycja}!",
            "&7Cena rangi na zawsze: {svipnazawsze}!",
            "",
            "&7Range zakupisz tutaj: &e{sklepurl}",
            "&8&l&m-------------&8&l( &6&lSVIP &8&l)&m-------------"
    );
    public BukkitNotice mvpMenu = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &9&lMVP &8&l)&m-------------",
            "&7Unikalny prefix: &9&lMVP",
            "&ePrzywileje VIPa oraz SVIPa",
            "&eDostęp do nowych kosmetyków (250+)",
            "&eUderzanie administracji w lobby",
            "&r",
            "&r",
            "&7Cena rangi na edycję: {mvpedycja}",
            "&7Cena rangi na zawsze: {mvpnazawsze}",
            "&r",
            "&7Range zakupisz tutaj: &e{sklepurl}",
            "&8&l&m-------------&8&l( &9&lMVP &8&l)&m-------------");
    public BukkitNotice elitaMenu = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &5&lELITA &8&l)&m-------------",
            "&7Unikalny prefiks: &5&lELITA",
            "&7Przywileje MVP i niżej.",
            "&7Dostęp do nowych kosmetyków (350+)" ,
            "&r",
            "&r",
            "&7Cena rangi na edycję: {elitaedycja}",
            "&7Cena rangi na zawsze: {elitanazawsze}",
            "&r",
            "&7Range zakupisz tutaj: &e{sklepurl}",
            "&8&l&m-------------&8&l( &5&lELITA &8&l)&m-------------");
    public BukkitNotice freezeMenu = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &3&lFree&bzee &8&l)&m-------------",
            "&7Unikalny prefiks: &3&lFree&bzee",
            "&7Przywileje rang ELITA oraz niższych",
            "&7Dostęp do nowych kosmetyków (450+)",
            "&r",
            "&7Cena rangi na edycja: {freezeedycja}",
            "&7Cena rangi na zawsze: {freezenazawsze}",
            "&r",
            "&7Rangę zakupisz tutaj: &e{sklepurl}",
            "&8&l&m-------------&8&l( &3&lFree&bzee &8&l)&m-------------");
}
