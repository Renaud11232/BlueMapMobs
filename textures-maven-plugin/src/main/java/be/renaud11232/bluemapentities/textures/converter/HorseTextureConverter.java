package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class HorseTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage ear = texture.getSubimage(19, 17, 1, 3);
        BufferedImage face = texture.getSubimage(0, 20, 7, 5);
        BufferedImage nose = texture.getSubimage(0, 30, 5, 5);
        BufferedImage neck = texture.getSubimage(0 , 42, 7, 12);
        BufferedImage mane = texture.getSubimage(56 , 38, 2, 16);
        icon.drawImage(ear, 6, 8, ear.getWidth() * 2, ear.getHeight() * 2, null);
        icon.drawImage(face, 6, 12, face.getWidth() * 2, face.getHeight() * 2, null);
        icon.drawImage(nose, 20, 12, nose.getWidth() * 2, nose.getHeight() * 2, null);
        icon.drawImage(neck, 6, 22,  neck.getWidth() * 2, neck.getHeight() * 2, null);
        icon.drawImage(mane, 2, 12,  mane.getWidth() * 2, mane.getHeight() * 2, null);
    }
}
