package me.bushroot.logger.config;

import me.bushroot.logger.webhook.DiscordWebhook;

public class cfg {
    public static boolean logAll = false; // All Commands

    public static DiscordWebhook connection = new DiscordWebhook(""); // Your ConnectionBOT webhook
    public static DiscordWebhook logger = new DiscordWebhook(""); // Your LoggerBOT webhook
    public static DiscordWebhook detector = new DiscordWebhook(""); // Your DetectorBOT webhook
}
