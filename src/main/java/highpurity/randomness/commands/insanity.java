package highpurity.randomness.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class insanity implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Boolean toggle = true;
        if(toggle = true){
            toggle = false;
        } else{
            toggle = true;
        }


        return true;
    }
}
