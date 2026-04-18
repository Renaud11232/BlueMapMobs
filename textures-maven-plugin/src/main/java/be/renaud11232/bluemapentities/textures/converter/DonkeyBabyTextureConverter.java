package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DonkeyBabyTextureConverter extends SimpleTextureConverter {
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
        BufferedImage ear = texture.getSubimage(25, 1, 1, 7);
        BufferedImage face = texture.getSubimage(0, 9, 9, 13);
        BufferedImage neck = texture.getSubimage(30 , 13, 4, 5);
        //FIXME: The ear seem to be at the wrong place, but the issue is also in vanilla Minecraft
        icon.drawImage(ear, 9, 2, ear.getWidth() * 2, ear.getHeight() * 2, null);
        icon.drawImage(face, 7, 12, face.getWidth() * 2, face.getHeight() * 2, null);
        icon.drawImage(neck, 7, 20,  neck.getWidth() * 2, neck.getHeight() * 2, null);
    }
}
