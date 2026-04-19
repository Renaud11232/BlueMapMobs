package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GlowSquidTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(12, 12, 12, 16);
        icon.drawImage(face, 4, 0, face.getWidth() * 2, face.getHeight() * 2, null);
    }
}
