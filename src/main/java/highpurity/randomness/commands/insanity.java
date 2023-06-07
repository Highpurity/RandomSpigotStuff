package highpurity.randomness.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class insanity implements CommandExecutor {

    public static boolean toggle = false;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(toggle = true){
            toggle = false;
            sender.sendMessage(ChatColor.RED + "Disabed PlayerGravityEvent.java!");
        } else{
            toggle = true;
            sender.sendMessage(ChatColor.GREEN + "Enabled PlayerGravityEvent.java!");
        }


        return true;
    }
}
