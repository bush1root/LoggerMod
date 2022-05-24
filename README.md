# 🔌 LoggerMod
This mod on 1.12.2 steals the entered passwords (Entered via /login)


# ⚡ How to configure?
- [x] Change Size
- [x] Rainbow Watermark (You can turn it off)
- [x] Easily To Configure
Binds:
I - Turn OFF Watermark
K - Add Size To Hitboxes
J - Reduce The Size Of Hitboxes

Tutorial: [Click](https://www.youtube.com/watch?v=OobK_s7yOQI) (in Russian)

# ❓ How it Works?
```java
    public void onUpdate(RenderPlayerEvent e) {
        Entity player = e.getEntity();
        
        if (player != Minecraft.getInstance().player) {
            player.setBoundingBox(new AxisAlignedBB(
                            player.getX() - size,
                            player.getBoundingBox().minY,
                            player.getZ() - size,
                            player.getX() + size,
                            player.getBoundingBox().maxY,
                            player.getZ() + size
                    )
            );
        }
    }

``` 

# 📱 Screenshots
![Screenshot_20220524_201426](https://user-images.githubusercontent.com/100863585/170095387-ad0eaa4b-b844-4b3b-8d5e-70b9012abe43.png)
