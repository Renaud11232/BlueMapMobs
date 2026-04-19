package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PolarBearBabyTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage leftEar = texture.getSubimage(21, 1, 2, 2);
        BufferedImage rightEar = texture.getSubimage(27, 1, 2, 2);
        BufferedImage face = texture.getSubimage(4, 4, 6, 5);
        BufferedImage nose = texture.getSubimage(22, 5, 4, 2);
        icon.drawImage(leftEar, 0, 4, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
        icon.drawImage(rightEar, 24, 4, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
        icon.drawImage(face, 4, 8, face.getWidth() * 4, face.getHeight() * 4, null);
        icon.drawImage(nose, 8, 20, nose.getWidth() * 4, nose.getHeight() * 4, null);
    }
}
