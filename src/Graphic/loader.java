package Graphic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class loader {
    /**
     * Carga las imagenes
     *
     * @param path Directorio de la imagen
     * @return Try->La imagen Catch->Null
     */
    public static BufferedImage imageLoader(String path) {
        try {
            return ImageIO.read(loader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}