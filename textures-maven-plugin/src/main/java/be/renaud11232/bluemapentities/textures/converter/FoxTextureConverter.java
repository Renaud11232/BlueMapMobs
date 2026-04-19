package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class FoxTextureConverter extends SimpleTextureConverter {
    @Override
    protected int getExpectedTextureWidth() {
        return 48;
    }

    @Override
    protected int getExpectedTextureHeight() {
        return 32;
    }

    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(7, 11, 8, 6);
        BufferedImage nose = texture.getSubimage(9, 21, 4, 2);
        BufferedImage leftEar = texture.getSubimage(9, 2, 2, 2);
        BufferedImage rightEar = texture.getSubimage(16, 2, 2, 2);
        icon.drawImage(face, 0, 8, face.getWidth() * 4, face.getHeight() * 4, null);
        icon.drawImage(nose, 8, 24, nose.getWidth() * 4, nose.getHeight() * 4, null);
        icon.drawImage(leftEar, 0, 0, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
        icon.drawImage(rightEar, 24, 0, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
    }
}
