package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PigZombieTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(8, 8, 10, 8);
        BufferedImage nose = texture.getSubimage(32, 2, 4, 4);
        BufferedImage leftTusk = texture.getSubimage(3, 1, 1, 2);
        BufferedImage rightTusk = texture.getSubimage(3, 5, 1, 2);
        icon.drawImage(face, -4, 0, face.getWidth() * 4, face.getHeight() * 4, null);
        icon.drawImage(nose, 8, 16, nose.getWidth() * 4, nose.getHeight() * 4, null);
        icon.drawImage(leftTusk, 4, 24, leftTusk.getWidth() * 4, leftTusk.getHeight() * 4, null);
        icon.drawImage(rightTusk, 24, 24, rightTusk.getWidth() * 4, rightTusk.getHeight() * 4, null);
    }
}
