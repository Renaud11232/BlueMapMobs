package be.renaud11232.bluemapentities.textures.converter;

import be.renaud11232.bluemapentities.textures.ImageOperations;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PolarBearTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage leftEar = texture.getSubimage(27, 1, 2, 2);
        BufferedImage rightEar = ImageOperations.flop(leftEar);
        BufferedImage face = texture.getSubimage(7, 7, 7, 7);
        BufferedImage nose = texture.getSubimage(3, 47, 5, 3);
        icon.drawImage(leftEar, -2, 0, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
        icon.drawImage(rightEar, 26, 0, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
        icon.drawImage(face, 2, 4, face.getWidth() * 4, face.getHeight() * 4, null);
        icon.drawImage(nose, 6, 20, nose.getWidth() * 4, nose.getHeight() * 4, null);
    }
}
