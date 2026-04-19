package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class HoglinTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(80, 1, 14, 19);
        BufferedImage leftTusk = texture.getSubimage(3, 13, 2, 2);
        BufferedImage rightTusk = texture.getSubimage(12, 13, 2, 2);
        icon.drawImage(face, 2, -6, face.getWidth() * 2, face.getHeight() * 2, null);
        icon.drawImage(leftTusk, 0, 16, leftTusk.getWidth() * 2, leftTusk.getHeight() * 2, null);
        icon.drawImage(rightTusk, 28, 16, rightTusk.getWidth() * 2, rightTusk.getHeight() * 2, null);
    }
}
