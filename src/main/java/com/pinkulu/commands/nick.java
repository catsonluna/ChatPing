package com.pinkulu.commands;

import com.pinkulu.Util;
import com.pinkulu.chatPing;
import com.pinkulu.pingPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class nick extends CommandBase {
    @Override
    public String getCommandName() {
        return "chatpingnick";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender iCommandSender, String[] args) throws CommandException {
        if (args.length == 0){
            Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText("§b[§dChatPing§b]§cPlease specify your nick, or type \"off\" to disable"));
        }
        else if(args[0].toLowerCase().equals("off")){
            pingPlayer.Nick = null;
            Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText("§b[§dChatPing§b]§cYou have disabled your nick"));
            chatPing.saveConfig();
        }else{
            pingPlayer.Nick = args[0].toLowerCase();
            Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText("§b[§dChatPing§b]§aYou have set your nick to §e" + args[0]));
            chatPing.saveConfig();
        }
    }

    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }
}
