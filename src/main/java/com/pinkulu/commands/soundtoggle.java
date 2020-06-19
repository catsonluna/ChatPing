package com.pinkulu.commands;

import com.pinkulu.Util;
import com.pinkulu.chatPing;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

import static com.pinkulu.pingPlayer.*;

public class soundtoggle extends CommandBase {
    @Override
    public String getCommandName() {
        return "chatpingsound";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if (args[0].length() == 0) {
            Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&cPlease specify the sound, you can see the sounds with /chatpinghelp or \"off\" to toggle it off")));
        } else {
            if (args[0].toLowerCase().equals("bruh")) {
                Minecraft.getMinecraft().thePlayer.playSound(bruh.toString(), 1.0f, 1.0f);
                bruhOn = true;
                oofOn = false;
                quackOn = false;
                blopOn = false;
                coinOn = false;
                pingOn = false;
                plingOn = false;
                popOn = false;
                suprisedOn = false;
                uwuOn = false;
                chatPing.saveConfig();
                Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&aYou have enabled &6" + args[0])));
            } else if (args[0].toLowerCase().equals("oof")) {
                Minecraft.getMinecraft().thePlayer.playSound(oof.toString(), 1.0f, 1.0f);
                bruhOn = false;
                oofOn = true;
                quackOn = false;
                blopOn = false;
                coinOn = false;
                pingOn = false;
                plingOn = false;
                popOn = false;
                suprisedOn = false;
                uwuOn = false;
                chatPing.saveConfig();
                Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&aYou have enabled &6" + args[0])));
            } else if (args[0].toLowerCase().equals("quack")) {
                Minecraft.getMinecraft().thePlayer.playSound(quack.toString(), 1.0f, 1.0f);
                bruhOn = false;
                oofOn = false;
                quackOn = true;
                blopOn = false;
                coinOn = false;
                pingOn = false;
                plingOn = false;
                popOn = false;
                suprisedOn = false;
                uwuOn = false;
                chatPing.saveConfig();
                Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&aYou have enabled &6" + args[0])));
            } else if (args[0].toLowerCase().equals("blop")) {
                Minecraft.getMinecraft().thePlayer.playSound(blop.toString(), 1.0f, 1.0f);
                bruhOn = false;
                oofOn = false;
                quackOn = false;
                blopOn = true;
                coinOn = false;
                pingOn = false;
                plingOn = false;
                popOn = false;
                suprisedOn = false;
                uwuOn = false;
                chatPing.saveConfig();
            } else if (args[0].toLowerCase().equals("coin")) {
                Minecraft.getMinecraft().thePlayer.playSound(coin.toString(), 1.0f, 1.0f);
                bruhOn = false;
                oofOn = false;
                quackOn = false;
                blopOn = false;
                coinOn = true;
                pingOn = false;
                plingOn = false;
                popOn = false;
                suprisedOn = false;
                uwuOn = false;
                chatPing.saveConfig();
                Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&aYou have enabled &6" + args[0])));

            } else if (args[0].toLowerCase().equals("ping")) {
                Minecraft.getMinecraft().thePlayer.playSound(ping.toString(), 1.0f, 1.0f);
                bruhOn = false;
                oofOn = false;
                quackOn = false;
                blopOn = false;
                coinOn = false;
                pingOn = true;
                plingOn = false;
                popOn = false;
                suprisedOn = false;
                uwuOn = false;
                chatPing.saveConfig();
                Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&aYou have enabled &6" + args[0])));

            } else if (args[0].toLowerCase().equals("pling")) {
                Minecraft.getMinecraft().thePlayer.playSound(pling.toString(), 1.0f, 1.0f);
                bruhOn = false;
                oofOn = false;
                quackOn = false;
                blopOn = false;
                coinOn = false;
                pingOn = false;
                plingOn = true;
                popOn = false;
                suprisedOn = false;
                uwuOn = false;
                chatPing.saveConfig();
                Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&aYou have enabled &6" + args[0])));

            } else if (args[0].toLowerCase().equals("pop")) {
                Minecraft.getMinecraft().thePlayer.playSound(pop.toString(), 1.0f, 1.0f);
                bruhOn = false;
                oofOn = false;
                quackOn = false;
                blopOn = false;
                coinOn = false;
                pingOn = false;
                plingOn = false;
                popOn = true;
                suprisedOn = false;
                uwuOn = false;
                chatPing.saveConfig();
                Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&aYou have enabled &6" + args[0])));

            } else if (args[0].toLowerCase().equals("surprised")) {
                Minecraft.getMinecraft().thePlayer.playSound(surprised.toString(), 1.0f, 1.0f);
                bruhOn = false;
                oofOn = false;
                quackOn = false;
                blopOn = false;
                coinOn = false;
                pingOn = false;
                plingOn = false;
                popOn = false;
                suprisedOn = true;
                uwuOn = false;
                chatPing.saveConfig();
                Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&aYou have enabled &6" + args[0])));

            } else if (args[0].toLowerCase().equals("uwu")) {
                Minecraft.getMinecraft().thePlayer.playSound(uwu.toString(), 1.0f, 1.0f);
                bruhOn = false;
                oofOn = false;
                quackOn = false;
                blopOn = false;
                coinOn = false;
                pingOn = false;
                plingOn = false;
                popOn = false;
                suprisedOn = false;
                uwuOn = true;
                chatPing.saveConfig();
                Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&aYou have enabled &6" + args[0])));
            } else if (args[0].toLowerCase().equals("off")) {
                bruhOn = false;
                oofOn = false;
                quackOn = false;
                blopOn = false;
                coinOn = false;
                pingOn = false;
                plingOn = false;
                popOn = false;
                suprisedOn = false;
                uwuOn = false;
                chatPing.saveConfig();
                Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&aYou have disabled all the sounds &6")));
            }else
                {
                    Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Util.replace("&b[&dChatPing&b]&cInvalid sound name")));
                }
            }
        }

    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }
}