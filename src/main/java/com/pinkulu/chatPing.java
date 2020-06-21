package com.pinkulu;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonWriter;
import com.pinkulu.commands.format;
import com.pinkulu.commands.help;
import com.pinkulu.commands.nick;
import com.pinkulu.commands.soundtoggle;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@Mod(modid = chatPing.MODID, version = chatPing.VERSION, name = chatPing.NAME)
public class chatPing {

    static final String MODID = "chatping";
    public static final String VERSION = "1.2";
    public static final String NAME = "ChatPing";
    private final pingPlayer pingPlayer = new pingPlayer();

    @Mod.EventHandler
    public void onInitialization(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(pingPlayer);
        MinecraftForge.EVENT_BUS.register(this);
        ClientCommandHandler.instance.registerCommand(new soundtoggle());
        ClientCommandHandler.instance.registerCommand(new help());
        ClientCommandHandler.instance.registerCommand(new format());
        ClientCommandHandler.instance.registerCommand(new nick());
        loadConfig();

    }

    public static void saveConfig() {
        try {
            File file = new File("ChatPing", "config.json");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            JsonWriter writer = new JsonWriter(new FileWriter(file, false));
            writeJson(writer);
            writer.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private void loadConfig() {
        try {
            File file = new File("ChatPing", "config.json");
            if (file.exists())
                readJson(file);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void readJson(File file) throws Throwable {
        JsonParser parser = new JsonParser();
        JsonObject json = parser.parse(new FileReader(file)).getAsJsonObject();
        json = json.getAsJsonObject("Sounds");

        com.pinkulu.pingPlayer.oofOn = json.get("oof").getAsBoolean();
        com.pinkulu.pingPlayer.bruhOn = json.get("bruh").getAsBoolean();
        com.pinkulu.pingPlayer.quackOn = json.get("quack").getAsBoolean();
        com.pinkulu.pingPlayer.blopOn = json.get("blop").getAsBoolean();
        com.pinkulu.pingPlayer.coinOn = json.get("coin").getAsBoolean();
        com.pinkulu.pingPlayer.pingOn = json.get("ping").getAsBoolean();
        com.pinkulu.pingPlayer.plingOn = json.get("pling").getAsBoolean();
        com.pinkulu.pingPlayer.popOn = json.get("pop").getAsBoolean();
        com.pinkulu.pingPlayer.suprisedOn = json.get("surprised").getAsBoolean();
        com.pinkulu.pingPlayer.uwuOn = json.get("uwu").getAsBoolean();
        com.pinkulu.pingPlayer.Cformat = json.get("CFormat").getAsString();
        com.pinkulu.pingPlayer.Nick = json.get("Nick").getAsString();


    }

    public static void writeJson(JsonWriter writer) throws IOException {
        writer.setIndent(" "); // this enabled pretty print
        writer.beginObject();
        writer.name("Sounds");
        writer.beginObject();

        writer.name("oof").value(com.pinkulu.pingPlayer.oofOn);
        writer.name("bruh").value(com.pinkulu.pingPlayer.bruhOn);

        writer.name("quack").value(com.pinkulu.pingPlayer.quackOn);
        writer.name("blop").value(com.pinkulu.pingPlayer.blopOn);

        writer.name("coin").value(com.pinkulu.pingPlayer.coinOn);
        writer.name("ping").value(com.pinkulu.pingPlayer.pingOn);

        writer.name("pling").value(com.pinkulu.pingPlayer.plingOn);
        writer.name("pop").value(com.pinkulu.pingPlayer.popOn);
        writer.name("uwu").value(com.pinkulu.pingPlayer.uwuOn);

        writer.name("surprised").value(com.pinkulu.pingPlayer.suprisedOn);

        writer.name("CFormat").value(com.pinkulu.pingPlayer.Cformat);
        writer.name("Name").value(com.pinkulu.pingPlayer.Nick);


        writer.endObject();
        writer.endObject();
    }
}