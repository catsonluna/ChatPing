package com.pinkulu.commands;

import com.pinkulu.Util;
import com.pinkulu.chatPing;
import com.pinkulu.pingPlayer;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.event.HoverEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.IChatComponent;

public class help extends CommandBase {
    @Override
    public String getCommandName() {
        return "chatpinghelp";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] strings) throws CommandException {
        EntityPlayer player = (EntityPlayer) sender;
        ChatStyle style = new ChatStyle();
        //hoverable text
        style.setChatHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ChatComponentText(
                "§3Available sounds: " +
                        "\n §" + (pingPlayer.bruhOn ? "a" : "c")+ "bruh " +
                        "§" + (pingPlayer.oofOn ? "a" : "c")+ "oof "+
                        "§" + (pingPlayer.blopOn ? "a" : "c")+"blop "+
                        "§" + (pingPlayer.quackOn ? "a" : "c")+"quack "+
                        "§" + (pingPlayer.coinOn ? "a" : "c") +"coin "+
                        "§" + (pingPlayer.pingOn? "a" : "c") +"ping "+
                        "§" + (pingPlayer.plingOn? "a" : "c") +"pling "+
                        "§" + (pingPlayer.popOn ? "a" : "c") +"pop "+
                        "§" + (pingPlayer.suprisedOn ? "a" : "c") +"surprised "+
                        "§" + (pingPlayer.uwuOn ? "a" : "c") +"uwu "+
                        "\n §3Commands: " +
                        "\n §b/chatpingsound + name" +
                        "\n §b/chatpingformat + colour codes" +
                        "\n §b/chatpingnick + name (set this as your nick, it will notify you with this and your name)" +
                        "\n §5Mod made by:" +
                        "\n §dPinkulu" )));
        //what shows in chat and than the hoverable text is registered
        IChatComponent text = new ChatComponentText( "§e " + chatPing.NAME +" " + chatPing.VERSION + " §7(hoverable text)").setChatStyle(style);
        //ads to chat
        player.addChatMessage(text);
    }
    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }
}
