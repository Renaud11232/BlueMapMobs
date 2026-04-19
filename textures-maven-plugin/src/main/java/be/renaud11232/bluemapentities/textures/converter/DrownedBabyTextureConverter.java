package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DrownedBabyTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(9, 9, 6, 6);
        icon.drawImage(face, 4, 4, face.getWidth() * 4, face.getHeight() * 4, null);
    }
}
