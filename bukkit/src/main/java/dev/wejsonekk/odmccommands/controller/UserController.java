package dev.wejsonekk.odmccommands.controller;

import dev.wejsonekk.odmccommands.BukkitCommandPlugin;
import dev.wejsonekk.odmccommands.user.User;
import dev.wejsonekk.odmccommands.user.UserRepository;
import eu.okaeri.injector.annotation.Inject;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Example usage of user repository.
 * Register controller in plugin component system.
 */
public class UserController implements Listener {

    private @Inject BukkitCommandPlugin bukkitCommandPlugin;
    private @Inject UserRepository userRepository;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        final Player player = e.getPlayer();
        final User user = this.userRepository.findOrCreateByPlayer(player).join(); // async get user

        user.setName(player.getName()); // example setter (only for example)
        this.bukkitCommandPlugin.runAsync(user::save); // save after changes (async)

        player.sendMessage("hi, " + user.getName()); // send message after save
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e){
        final Player player = e.getPlayer();
        final User user = this.userRepository.findOrCreateByPlayer(player).join(); // async get user

        user.setName(player.getName()); // example setter (only for example)
    }

}
