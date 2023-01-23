package dev.wejsonekk.odmccommands.config;

import cc.dreamcode.notice.NoticeType;
import cc.dreamcode.notice.bukkit.BukkitNotice;
import cc.dreamcode.platform.bukkit.component.configuration.Configuration;
import com.sun.tools.javac.util.List;
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
        @Header("## Dream-Template (Message-Config) ##"),
        @Header("Dostepne type: (CHAT, ACTION_BAR, SUBTITLE, TITLE, TITLE_SUBTITLE)")
})
@Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
public class MessageConfig extends OkaeriConfig {

    public BukkitNotice usage = new BukkitNotice(NoticeType.CHAT, "&7Poprawne uzycie: &c{usage}");
    public BukkitNotice noPermission = new BukkitNotice(NoticeType.CHAT, "&4Nie posiadasz uprawnien.");
    public BukkitNotice noPlayer = new BukkitNotice(NoticeType.CHAT, "&4Podanego gracza &cnie znaleziono.");
    public BukkitNotice playerIsOffline = new BukkitNotice(NoticeType.CHAT, "&4Podany gracz &cjest offline.");
    public BukkitNotice notPlayer = new BukkitNotice(NoticeType.CHAT, "&4Nie jestes graczem.");
    public BukkitNotice notNumber = new BukkitNotice(NoticeType.CHAT, "&4Podana liczba &cnie jest cyfra.");
    public BukkitNotice playerIsMe = new BukkitNotice(NoticeType.CHAT, "&4Nie rob tego &cna sobie.");

    public String discordInviteLink = "https://discord.gg/ESTfkRwcWw";
    public String discordInviteHover = "&aKliknij tutaj, aby dołączyć na &bserwer discord";
    public String sklepUrl = "https://www.sklep.kretmc.pl";
    public String stronaURL = "https://kretmc.pl";
    public String earthMap = "https://map.kretmc.pl";
    public String YoutubeLink = "https://www.youtube.com/channel/@Kretownik";
    public String TikTokLink = "https://www.tiktok.com/@Kretownik";
    public String TwitterLink = "https://twitter.com/Kretownik";
    public String facebookLink = "https://www.facebook.com/Kretownik";
    public String instagramLink = "https://www.instagram.com/kretownik";
    public String redditLink = "https://www.reddit.com/user/Kretown";
    public String telegramLink = "https://t.me/Kretownik";


    public BukkitNotice DiscordCommand = new BukkitNotice(NoticeType.CHAT,
            "&a&m-----------(&9 Discord &a&m)-------------",
            "",
            "      &b&n{discordInviteLink}",
            "",
            "&a&m-----------(&9 Discord &a&m)-------------");
    public BukkitNotice HelpCommand = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l &a&lPOMOC &8&l)&m-------------",
                    "&e/kit &8- &7Odbierz swoj kit startowy",
                    "&e/klan &8- &7Wyswietla GUI klanu",
                    "&e/vip &8- &7Informacje o randze &e&lVIP.",
                    "&e/svip &8- &7Informacje o randze &6&lSVIP.",
                    "&e/sponsor &8- &7Informacje o randze &9&lSPONSOR.",
                    "&e/elita &8- &7Informacje o randze &5&lELITA.",
                    "&e/byniu &8- &7Informacje o randze &6&lB&e&lY&6&lN&e&lI&6&lU",
                    "&e/sklep &8- &7Sklep za spedzony czas",
                    "&e/discord &8- &7Wyswietla serwerowy &9&lDiscord.",
                    "&8&l&m-------------&8&l &a&lPOMOC &8&l)&m-------------");
    public BukkitNotice RankVIPCommand = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &e&lVIP &8&l)&m-------------",
            "&7Unikalny prefix: &e&lVIP.",
            "&e/kit vip &8-&7Zestaw VIPA",
            "&e/repair &8-&7Mozliwosc naprawiania przedmiotu za pomoca /repair",
            "",
            "&7 Koszt: &e 5zl na EDYCJE!",
            "&7Range zakupisz tutaj: &ewww.kretmc.pl",
            "&8&l&m-------------&8&l( &e&lVIP &8&l)&m-------------"
            );
    public BukkitNotice RankSVIPCommand = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &e&lSVIP &8&l)&m-------------",
            "&7Ranga &6SVIP &7posiada przywileje:",
            "&e/kit vip &8-&7Zestaw VIPA",
            "&e/kit svip &8- &7Zestaw SVIPA",
            "&e/repair all &8- &7Mozliwosc naprawiania wszystkich itemow w eq",
            "&e/ec &8- &7Podreczny enderchest",
            "",
            "&7Koszt: &e10 zl na EDYCJE!",
            "&7Range zakupisz tutaj: &ewww.kretmc.pl",
            "&8&l&m-------------&8&l( &e&lSVIP &8&l)&m-------------"
    );
    public BukkitNotice RankSponsorCommand = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &9&lSPONSOR &8&l)&m-------------",
            "&7Ranga &9SPONSOR &7posiada przywileje:",
            "&e/kit vip &8-&7Zestaw VIPA",
            "&e/kit svip &8- &7Zestaw SVIPA",
            "&e/kit sponsor &8- &7Zestaw SPONSORA",
            "&e/repair all &8- &7Mozliwosc naprawiania wszystkich itemow w eq",
            "&e/ec &8- &7Podreczny enderchest",
            "",
            "&7Koszt: &e20 zl na EDYCJE!",
            "&7Range zakupisz tutaj: &ewww.kretmc.pl",
            "&8&l&m-------------&8&l( &9&lSPONSOR &8&l)&m-------------");
    public BukkitNotice RankElitaCommand = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &5&lELITA &8&l)&m-------------",
            "&7Ranga &5ELITA &7posiada przywileje:",
            "&e/kit vip &8-&7Zestaw VIPA",
            "&e/kit svip &8- &7Zestaw SVIPA",
            "&e/kit sponsor &8- &7Zestaw SPONSORA",
            "&e/kit elita &8- &7Zestaw ELITY",
            "&e/repair all &8- &7Mozliwosc naprawiania wszystkich itemow w eq",
            "&e/ec &8- &7Podreczny enderchest",
            "",
            "&7Koszt: &e30 zl na EDYCJE!",
            "&7Range zakupisz tutaj: &ewww.kretmc.pl",
            "&8&l&m-------------&8&l( &5&lELITA &8&l)&m-------------");
    public BukkitNotice RankByniuCommand = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &6&lB&e&lY&6&lN&e&lI&6&lU &8&l)&m-------------",
            "&7Ranga &6&lB&e&lY&6&lN&e&lI&6&lU &7posiada przywileje:",
            "&e/kit vip &8-&7Zestaw VIPA",
            "&e/kit svip &8- &7Zestaw SVIPA",
            "&e/kit sponsor &8- &7Zestaw SPONSORA",
            "&e/kit elita &8- &7Zestaw ELITY",
            "&e/kit byniu &8- &7Zestaw BYNIA",
            "&e/repair all &8- &7Mozliwosc naprawiania wszystkich itemow w eq",
            "&e/ec &8- &7Podreczny enderchest",
            "",
            "&7Ranga &6&lB&e&lY&6&lN&e&lI&6&lU jest najlepsza ranga!",
            "&7Range zakupisz tutaj: &ewww.kretmc.pl",
            "&8&l&m-------------&8&l( &6&lB&e&lY&6&lN&e&lI&6&lU &8&l)&m-------------");
    public BukkitNotice SupportCommandYoutube = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &f&lWspolpraca &8&l)&m-------------",
            "&7Na serwerze dostepne sa &fmini&4YT &fmini&bTikTok &7oraz &bMEDIA",
            "&cWymagania na poszczegolne rangi:",
            "&fmini&4YT &8-&7 Aby otrzymac range, musisz uzyskac 300 wyswietlen pod odcinkiem z serwera, lub wykonac min. 2 transmisje LIVE.",
            "&fmini&bTikTok &8-&7 Aby otrzymac range, musisz uzyskac 1000 wyswietlen pod TikTokiem z serwera",
            "&bMEDIA &8-&7 Aby otrzymac range, musisz wspolpracowac z serwerem!",
            "&7Posiadajac &f&lmini&4&lYT &7/ &7&fmini&bTikTok &7otrzymujesz przywileje rangi &e&lSVIP&7!",
            "",
            "&cJesli spelniasz wymagania, zglos sie na discordzie!",
            "",
            "&8&l&m-------------&8&l( &f&lWspolpraca &8&l)&m-------------");

    public BukkitNotice SupportCommandTikTok = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &f&lWspolpraca &8&l)&m-------------",
            "&7Na serwerze dostepne sa &fmini&4YT &fmini&bTikTok &7oraz &bMEDIA",
            "&cWymagania na poszczegolne rangi:",
            "&fmini&4YT &8-&7 Aby otrzymac range, musisz uzyskac 300 wyswietlen pod odcinkiem z serwera, lub wykonac min. 2 transmisje LIVE.",
            "&fmini&bTikTok &8-&7 Aby otrzymac range, musisz uzyskac 1000 wyswietlen pod TikTokiem z serwera",
            "&bMEDIA &8-&7 Aby otrzymac range, musisz wspolpracowac z serwerem!",
            "&7Posiadajac &f&lmini&4&lYT &7/ &7&fmini&bTikTok &7otrzymujesz przywileje rangi &e&lSVIP&7!",
            "",
            "&cJesli spelniasz wymagania, zglos sie na discordzie!",
            "",
            "&8&l&m-------------&8&l( &f&lWspolpraca &8&l)&m-------------");
    public BukkitNotice SupportCommandMiniYT = new BukkitNotice(NoticeType.CHAT,
            "&8&l&m-------------&8&l( &f&lWspolpraca &8&l)&m-------------",
            "&7Na serwerze dostepne sa &fmini&4YT &fmini&bTikTok &7oraz &bMEDIA",
            "&cWymagania na poszczegolne rangi:",
            "&fmini&4YT &8-&7 Aby otrzymac range, musisz uzyskac 300 wyswietlen pod odcinkiem z serwera, lub wykonac min. 2 transmisje LIVE.",
            "&fmini&bTikTok &8-&7 Aby otrzymac range, musisz uzyskac 1000 wyswietlen pod TikTokiem z serwera",
            "&bMEDIA &8-&7 Aby otrzymac range, musisz wspolpracowac z serwerem!",
            "&7Posiadajac &f&lmini&4&lYT &7/ &7&fmini&bTikTok &7otrzymujesz przywileje rangi &e&lSVIP&7!",
            "",
            "&cJesli spelniasz wymagania, zglos sie na discordzie!",
            "",
            "&8&l&m-------------&8&l( &f&lWspolpraca &8&l)&m-------------");
}
