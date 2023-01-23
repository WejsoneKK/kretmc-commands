package dev.wejsonekk.odmccommands;

import cc.dreamcode.platform.discord4j.DreamDiscord4JPlatform;

public class Discord4JTemplateLauncher {
    public static void main(String[] args) {
        // Use argument or create config.
        DreamDiscord4JPlatform.run(new Discord4JTemplateBot());
    }
}
