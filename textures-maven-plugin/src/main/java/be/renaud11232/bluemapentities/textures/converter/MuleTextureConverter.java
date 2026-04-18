package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MuleTextureConverter extends SimpleTextureConverter {
    @Override
    protected int getExpectedTextureWidth() {
        return 64;
    }

    @Override
    protected int getExpectedTextureHeight() {
        return 64;
    }

    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage ear = texture.getSubimage(0, 13, 1, 7);
        BufferedImage face = texture.getSubimage(0, 20, 7, 5);
        BufferedImage nose = texture.getSubimage(0, 30, 5, 5);
        BufferedImage neck = texture.getSubimage(0 , 42, 7, 12);
        icon.drawImage(ear, 6, 0, ear.getWidth() * 2, ear.getHeight() * 2, null);
        icon.drawImage(face, 4, 12, face.getWidth() * 2, face.getHeight() * 2, null);
        icon.drawImage(nose, 18, 12, nose.getWidth() * 2, nose.getHeight() * 2, null);
        icon.drawImage(neck, 4, 22,  neck.getWidth() * 2, neck.getHeight() * 2, null);
    }
}
