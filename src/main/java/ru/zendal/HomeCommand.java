package ru.zendal;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class HomeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            System.out.println("Команду /home могут использовать только игроки!");
            return true;
        }
        Player player = (Player) sender;
        if (SetHomeCommand.indivCoord.get(player.getDisplayName()) == null) {
            player.sendMessage("К сожалению, у вас нету точки дома.");
            return true;
        }
        player.teleport(SetHomeCommand.indivCoord.get(player.getDisplayName()));
        player.sendMessage("Поздравляю! Вы дома!");
        return true;
    }
}
