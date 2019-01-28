package ru.zendal;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class SetHomeCommand implements CommandExecutor {
    static Map<String, Location> indivCoord = new HashMap<>();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            System.out.println("Команду /sethome может использовать только игрок!");
            return true;
        }
        Player player = (Player) sender;
        indivCoord.put(player.getDisplayName(),player.getLocation());
        Location coord = indivCoord.get(player.getDisplayName());
        player.sendMessage("Ваши координаты дома сохранены: " + coord.getBlockX() + " " + coord.getBlockY() + " " + coord.getBlockZ());

        return true;
    }
}
