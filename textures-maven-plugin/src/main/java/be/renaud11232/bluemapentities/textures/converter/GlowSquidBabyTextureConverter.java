package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GlowSquidBabyTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(8, 8, 8, 10);
        icon.drawImage(face, 8, 6, face.getWidth() * 2, face.getHeight() * 2, null);
    }
}
