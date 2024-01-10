package Graphic;

import java.awt.image.BufferedImage;

public class assets {
    public static BufferedImage background;
    public static BufferedImage gameName;
    public static float count = 0;
    public static void init() {
    background = loadImage("Images/Backgrounds/Background.jpg");
    gameName = loadImage("Images/Backgrounds/BackgroundName.png");
    }

    public static BufferedImage loadImage(String path){
        count++;
        return  loader.imageLoader(path);
    }
}
