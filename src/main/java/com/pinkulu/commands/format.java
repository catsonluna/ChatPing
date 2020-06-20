package com.pinkulu.commands;

import com.pinkulu.Util;
import com.pinkulu.chatPing;
import com.pinkulu.pingPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;


public class format extends CommandBase {
    @Override
    public String getCommandName() {
        return "chatpingformat";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender iCommandSender, String[] args) throws CommandException {
        if (args[0].length() == 0) {
            Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&cPlease specify your format, or type \"off\" to disable")));
        } else if (args[0].toLowerCase().equals("off")) {
            pingPlayer.Cformat = "";
            chatPing.saveConfig();
            Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&cMessage format dissabled")));
        }
        else{
            pingPlayer.Cformat = args[0].toLowerCase();
            Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]" + pingPlayer.Cformat + "This is how the message will look like")));
            chatPing.saveConfig();
        }
    }
@Override
public int getRequiredPermissionLevel() {
    return -1;
}
}