package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class HoglinBabyTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(12, 0, 10, 12);
        BufferedImage leftTusk = texture.getSubimage(46, 29, 2, 2);
        BufferedImage rightTusk = texture.getSubimage(54, 29, 2, 2);
        icon.drawImage(face, 6, 4, face.getWidth() * 2, face.getHeight() * 2, null);
        icon.drawImage(leftTusk, 2, 20, leftTusk.getWidth() * 2, leftTusk.getHeight() * 2, null);
        icon.drawImage(rightTusk, 26, 20, rightTusk.getWidth() * 2, rightTusk.getHeight() * 2, null);
    }
}
