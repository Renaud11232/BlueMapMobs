package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PigTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(8, 8, 8, 8);
        BufferedImage nose = texture.getSubimage(17, 17, 4, 3);
        icon.drawImage(face, 0, 0, face.getWidth() * 4, face.getHeight() * 4, null);
        icon.drawImage(nose, 8, 16, nose.getWidth() * 4, nose.getHeight() * 4, null);
    }
}
