package ru.zendal;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetHomeCommand implements CommandExecutor {
    static Location coord;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            System.out.println("Команду /sethome может использовать только игрок!");
            return true;
        }
        Player player = (Player) sender;
        coord = player.getLocation();
        player.sendMessage("Ваши координаты дома сохранены: " + coord.getBlockX() + " " + coord.getBlockY() + " " + coord.getBlockZ());

        return true;
    }
}
