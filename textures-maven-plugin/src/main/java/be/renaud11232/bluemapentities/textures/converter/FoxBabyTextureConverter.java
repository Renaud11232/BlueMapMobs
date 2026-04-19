package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class FoxBabyTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(5, 5, 6, 5);
        BufferedImage nose = texture.getSubimage(20, 22, 2, 2);
        BufferedImage leftEar = texture.getSubimage(23, 9, 2, 2);
        BufferedImage rightEar = texture.getSubimage(23, 12, 2, 2);
        icon.drawImage(face, 4, 10, face.getWidth() * 4, face.getHeight() * 4, null);
        icon.drawImage(nose, 12, 22, nose.getWidth() * 4, nose.getHeight() * 4, null);
        icon.drawImage(leftEar, 4, 2, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
        icon.drawImage(rightEar, 20, 2, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
    }
}
