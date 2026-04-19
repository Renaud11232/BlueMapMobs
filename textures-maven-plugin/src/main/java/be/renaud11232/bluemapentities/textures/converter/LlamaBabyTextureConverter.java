package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class LlamaBabyTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(4, 4, 6, 5);
        BufferedImage nose = texture.getSubimage(3, 18, 3, 3);
        BufferedImage leftEar = texture.getSubimage(22, 2, 2, 2);
        BufferedImage rightEar = texture.getSubimage(22, 6, 2, 2);
        icon.drawImage(face, 4, 10, face.getWidth() * 4, face.getHeight() * 4, null);
        icon.drawImage(nose, 10, 18, nose.getWidth() * 4, nose.getHeight() * 4, null);
        icon.drawImage(leftEar, 4, 2, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
        icon.drawImage(rightEar, 20, 2, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
    }
}
