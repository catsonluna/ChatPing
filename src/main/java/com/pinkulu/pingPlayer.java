package com.pinkulu;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class pingPlayer {
    public static boolean bruhOn;
    public static boolean oofOn;
    public static boolean quackOn;
    public static boolean blopOn;
    public static boolean coinOn;
    public static boolean pingOn;
    public static boolean plingOn;
    public static boolean popOn;
    public static boolean suprisedOn;
    public static boolean uwuOn;
    public static boolean rainbow;
    public static String Cformat = "";
    public static String Nick;
    public static ResourceLocation bruh = new ResourceLocation("pingmodutils", "bruh");
    public static ResourceLocation oof = new ResourceLocation("pingmodutils", "oof");
    public static ResourceLocation quack = new ResourceLocation("pingmodutils", "quack");
    public static ResourceLocation blop = new ResourceLocation("pingmodutils", "Blop");
    public static ResourceLocation coin = new ResourceLocation("pingmodutils", "Coin");
    public static ResourceLocation ping = new ResourceLocation("pingmodutils", "PING");
    public static ResourceLocation pling = new ResourceLocation("pingmodutils", "Pling");
    public static ResourceLocation pop = new ResourceLocation("pingmodutils", "Pop");
    public static ResourceLocation surprised = new ResourceLocation("pingmodutils", "surprised");
    public static ResourceLocation uwu = new ResourceLocation("pingmodutils", "uwu");
    @SubscribeEvent
    public void chatEvent(final ClientChatReceivedEvent e) {

        final String msgWithName = e.message.getFormattedText();
        final String plName = Minecraft.getMinecraft().thePlayer.getName().toLowerCase();
        for (int i = 0; i < msgWithName.length(); ++i) {
            final Character colon = msgWithName.charAt(i);
            if (msgWithName.contains("Party Leader")) {
                return;
            }
            if (msgWithName.contains("Party Members")) {
                return;
            } else if (colon.equals(':')) {

                final String noMessage = msgWithName.substring(0, i);
                final String message = msgWithName.replace(noMessage, "").toLowerCase();
                final String normal = msgWithName.replace(noMessage, "");
                final String bigreplace = Util.replacer(Util.replacef(Util.replace7(Util.replacee(Util.replaceemoji1(Util.replaceemoji2(Util.replaceemoji3(Util.replaceemoji4(Util.replaceemoji5(Util.replaceemoji6(Util.replaceemoji7(Util.replaceemoji8(Util.replaceemoji9(Util.replaceemoji10(Util.replaceemoji11(Util.replaceemoji12(Util.replaceemoji13(Util.replaceemoji14(Util.replaceemoji15(Util.replaceemoji16(Util.replaceemoji17(Util.replaceemoji18(Util.replaceemoji19(Util.replaceemoji20(Util.replaceemoji21(normal)))))))))))))))))))))))));
                final String smallreplace = Util.replacething(bigreplace);
                if (message.contains(plName) || message.contains(Nick)) {
                    if (Cformat != null) {
                        Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(noMessage + Cformat + smallreplace));
                        e.setCanceled(true);
                    }
                    if (bruhOn) {
                        Minecraft.getMinecraft().thePlayer.playSound(bruh.toString(), 1.0f, 1.0f);
                    } else if (oofOn) {
                        Minecraft.getMinecraft().thePlayer.playSound(oof.toString(), 1.0f, 1.0f);
                    } else if (quackOn) {
                        Minecraft.getMinecraft().thePlayer.playSound(quack.toString(), 1.0f, 1.0f);
                    } else if (blopOn) {
                        Minecraft.getMinecraft().thePlayer.playSound(blop.toString(), 1.0f, 1.0f);
                    } else if (coinOn) {
                        Minecraft.getMinecraft().thePlayer.playSound(coin.toString(), 1.0f, 1.0f);
                    } else if (pingOn) {
                        Minecraft.getMinecraft().thePlayer.playSound(ping.toString(), 1.0f, 1.0f);
                    } else if (plingOn) {
                        Minecraft.getMinecraft().thePlayer.playSound(pling.toString(), 1.0f, 1.0f);
                    } else if (popOn) {
                        Minecraft.getMinecraft().thePlayer.playSound(pop.toString(), 1.0f, 1.0f);
                    } else if (suprisedOn) {
                        Minecraft.getMinecraft().thePlayer.playSound(surprised.toString(), 1.0f, 1.0f);
                    } else if (uwuOn) {
                        Minecraft.getMinecraft().thePlayer.playSound(uwu.toString(), 1.0f, 1.0f);
                    }

                }
                break;
            }
        }
    }
}
