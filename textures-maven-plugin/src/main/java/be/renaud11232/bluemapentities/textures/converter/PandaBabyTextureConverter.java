package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PandaBabyTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage leftEar = texture.getSubimage(25, 1, 3, 3);
        BufferedImage rightEar = texture.getSubimage(34, 1, 3, 3);
        BufferedImage face = texture.getSubimage(5, 5, 7, 6);
        BufferedImage nose = texture.getSubimage(25, 7, 4, 2);
        icon.drawImage(leftEar, 7, 9, leftEar.getWidth() * 2, leftEar.getHeight() * 2, null);
        icon.drawImage(rightEar, 19, 9, rightEar.getWidth() * 2, rightEar.getHeight() * 2, null);
        icon.drawImage(face, 9, 11, face.getWidth() * 2, face.getHeight() * 2, null);
        icon.drawImage(nose, 12, 19, nose.getWidth() * 2, nose.getHeight() * 2, null);
    }
}
