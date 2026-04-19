package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DrownedOuterLayerTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(8, 8, 8, 8);
        icon.drawImage(face, 0, 0, face.getWidth() * 4, face.getHeight() * 4, null);
    }
}
