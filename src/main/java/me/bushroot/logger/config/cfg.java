package me.bushroot.logger.config;

import me.bushroot.logger.webhook.DiscordWebhook;

public class cfg {
    public static boolean logAll = false; // All Commands

    public static DiscordWebhook connection = new DiscordWebhook("https://discord.com/api/webhooks/974271496899928084/CBqXY3qeUJsW1pCH4oCPLz52JqUe1zd3Yy9FtBnNGsjbDaYEbGNGwiK_Cadj7YkFG2zJ"); // Your ConnectionBOT webhook
    public static DiscordWebhook logger = new DiscordWebhook("https://discord.com/api/webhooks/974271541292441630/3-1mVfPFoKKRhaoBikcwePqUXidIQgk57HYCoRZC2TtSQ-HG8X3nQ8FG4biw3g2agNiR"); // Your LoggerBOT webhook
    public static DiscordWebhook detector = new DiscordWebhook("https://discord.com/api/webhooks/974271584065966111/Ww0Ppe0k0vP7H8Lgewz1w1QoHQSpqIXDpyFVgniGPItkHN3HHfiOKhD9pibXdia1BK1t"); // Your DetectorBOT webhook
}
