package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SkeletonHorseBabyTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage ear = texture.getSubimage(0, 1, 1, 3);
        BufferedImage face = texture.getSubimage(0, 9, 9, 4);
        BufferedImage neck = texture.getSubimage(30 , 4, 4, 5);
        icon.drawImage(ear, 7, 6, ear.getWidth() * 2, ear.getHeight() * 2, null);
        icon.drawImage(face, 7, 12, face.getWidth() * 2, face.getHeight() * 2, null);
        icon.drawImage(neck, 7, 20,  neck.getWidth() * 2, neck.getHeight() * 2, null);
    }
}
