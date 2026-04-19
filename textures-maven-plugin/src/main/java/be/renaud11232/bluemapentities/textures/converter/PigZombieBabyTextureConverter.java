package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PigZombieBabyTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(7, 7, 9, 6);
        BufferedImage nose = texture.getSubimage(22, 31, 3, 3);
        icon.drawImage(face, -2, 4, face.getWidth() * 4, face.getHeight() * 4, null);
        icon.drawImage(nose, 10, 16, nose.getWidth() * 4, nose.getHeight() * 4, null);
    }
}
