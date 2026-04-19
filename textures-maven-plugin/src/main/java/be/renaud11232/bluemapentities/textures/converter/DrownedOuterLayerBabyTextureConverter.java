package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DrownedOuterLayerBabyTextureConverter extends SimpleTextureConverter {
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
        BufferedImage face = texture.getSubimage(41, 9, 6, 6);
        icon.drawImage(face, 4, 4, face.getWidth() * 4, face.getHeight() * 4, null);
    }
}
