package highpurity.randomness.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class insanity implements CommandExecutor {

    public static boolean toggle = false;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(toggle = true){
            toggle = false;
        } else{
            toggle = true;
        }


        return true;
    }
}
